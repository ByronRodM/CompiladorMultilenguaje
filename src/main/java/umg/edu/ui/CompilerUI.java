package umg.edu.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultHighlighter;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

import umg.edu.antlr.LanguageDetector;
import umg.edu.error.CompilationError;
import umg.edu.error.ErrorTable;
import umg.edu.lexer.LexerManager;
import umg.edu.lexer.TokenInfo;
import umg.edu.parser.ParserManager;
import umg.edu.semantic.SemanticAnalyzer;
import umg.edu.symboltable.Symbol;
import umg.edu.symboltable.SymbolTable;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Interfaz principal para CompiSim - Simulador de Compilador Multilenguaje
 */
public class CompilerUI extends JFrame {

    // Colores del tema claro moderno
    private static final Color LIGHT_PRIMARY = new Color(245, 248, 251);        // Gris muy claro
    private static final Color LIGHT_SECONDARY = new Color(255, 255, 255);      // Blanco puro
    private static final Color BLUE_ACCENT = new Color(74, 144, 226);           // Azul principal
    private static final Color BLUE_SECONDARY = new Color(100, 160, 240);       // Azul secundario
    private static final Color BLUE_LIGHT = new Color(230, 240, 250);           // Azul muy claro
    private static final Color DARK_TEXT = new Color(33, 37, 41);               // Texto oscuro
    private static final Color MEDIUM_TEXT = new Color(108, 117, 125);          // Texto medio
    private static final Color SELECTION_COLOR = new Color(184, 218, 255);      // Azul claro para selección
    private static final Color BORDER_COLOR = new Color(208, 212, 217);         // Bordes

    private JTextArea codeTextArea;
    private JTextArea actionTextArea;
    private JTabbedPane analysisTabbedPane;
    private JTable tokenTable;
    private JTable errorTable;
    private JTable symbolTable;
    private JComboBox<String> languageComboBox;
    private JButton analyzeButton;
    private JButton viewTreeButton;
    private JButton loadFileButton;
    private JButton clearButton;
    
    private final ErrorTable errorTableModel;
    private final SymbolTable symbolTableModel;
    private LanguageDetector.Language detectedLanguage = LanguageDetector.Language.UNKNOWN;
    
    // Mantener referencia al gestor de parser
    private ParserManager parserManager;
    
    private static final String[] TOKEN_TABLE_COLUMNS = {"Tipo", "Texto", "Línea", "Columna"};
    private static final String[] ERROR_TABLE_COLUMNS = {"Tipo", "Mensaje", "Línea", "Columna"};
    private static final String[] SYMBOL_TABLE_COLUMNS = {"Nombre", "Tipo", "Ámbito", "Valor", "Línea", "Columna"};
    
    public CompilerUI() {
        errorTableModel = new ErrorTable();
        symbolTableModel = new SymbolTable();
        parserManager = new ParserManager(errorTableModel);
        
        // Configurar tema claro
        configureUITheme();
        
        setTitle("CompiSim - Simulador de Compilador Multilenguaje");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocationRelativeTo(null);
        
        // Aplicar colores al frame principal
        getContentPane().setBackground(LIGHT_PRIMARY);
        
        initComponents();
        layoutComponents();
        
        setVisible(true);
    }
    
    /**
     * Configura el tema de colores claro para toda la aplicación
     */
    private void configureUITheme() {
        try {
            // Configurar look and feel primero
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Aplicar colores personalizados DESPUÉS del Look and Feel
        UIManager.put("Panel.background", LIGHT_PRIMARY);
        UIManager.put("TabbedPane.background", LIGHT_SECONDARY);
        UIManager.put("TabbedPane.foreground", DARK_TEXT);
        UIManager.put("TabbedPane.selectedBackground", BLUE_LIGHT);
        UIManager.put("TabbedPane.selectedForeground", DARK_TEXT);
        UIManager.put("TabbedPane.contentAreaColor", LIGHT_SECONDARY);
        UIManager.put("Table.background", LIGHT_SECONDARY);
        UIManager.put("Table.foreground", DARK_TEXT);
        UIManager.put("Table.selectionBackground", SELECTION_COLOR);
        UIManager.put("Table.selectionForeground", DARK_TEXT);
        UIManager.put("Table.gridColor", BORDER_COLOR);
        UIManager.put("TableHeader.background", BLUE_LIGHT);
        UIManager.put("TableHeader.foreground", DARK_TEXT);
        UIManager.put("ScrollPane.background", LIGHT_SECONDARY);
        UIManager.put("Viewport.background", LIGHT_SECONDARY);
        UIManager.put("Label.foreground", DARK_TEXT);
        UIManager.put("TitledBorder.titleColor", BLUE_ACCENT);
        UIManager.put("Border.foreground", BORDER_COLOR);
        UIManager.put("OptionPane.background", LIGHT_SECONDARY);
        UIManager.put("OptionPane.foreground", DARK_TEXT);
        UIManager.put("OptionPane.messageForeground", DARK_TEXT);
    }
    
    private void initComponents() {
        // Componentes del panel de entrada
        codeTextArea = new JTextArea();
        codeTextArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        codeTextArea.setBackground(LIGHT_SECONDARY);
        codeTextArea.setForeground(DARK_TEXT);
        codeTextArea.setCaretColor(BLUE_ACCENT);
        codeTextArea.setSelectionColor(SELECTION_COLOR);
        codeTextArea.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 1),
            BorderFactory.createEmptyBorder(8, 8, 8, 8)
        ));
        codeTextArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                detectLanguage();
            }
            
            @Override
            public void removeUpdate(DocumentEvent e) {
                detectLanguage();
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                detectLanguage();
            }
        });
        
        // Componentes de análisis (Panel con pestañas para tabla de tokens, errores y símbolos)
        tokenTable = createStyledTable(new DefaultTableModel(TOKEN_TABLE_COLUMNS, 0));
        errorTable = createStyledTable(new DefaultTableModel(ERROR_TABLE_COLUMNS, 0));
        symbolTable = createStyledTable(new DefaultTableModel(SYMBOL_TABLE_COLUMNS, 0));
        
        analysisTabbedPane = new JTabbedPane();
        analysisTabbedPane.setBackground(LIGHT_SECONDARY);
        analysisTabbedPane.setForeground(DARK_TEXT);
        analysisTabbedPane.addTab("Tokens", createStyledScrollPane(tokenTable));
        analysisTabbedPane.addTab("Errores", createStyledScrollPane(errorTable));
        analysisTabbedPane.addTab("Tabla de Símbolos", createStyledScrollPane(symbolTable));
        
        // Componentes del panel de acción
        actionTextArea = new JTextArea();
        actionTextArea.setEditable(false);
        actionTextArea.setFont(new Font("SansSerif", Font.PLAIN, 14));
        actionTextArea.setBackground(LIGHT_SECONDARY);
        actionTextArea.setForeground(DARK_TEXT);
        actionTextArea.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 1),
            BorderFactory.createEmptyBorder(8, 8, 8, 8)
        ));
        
        // Componentes de la barra de herramientas
        languageComboBox = new JComboBox<>(new String[]{
                "Detectar automáticamente",
                "C++",
                "HTML",
                "JavaScript",
                "Pascal",
                "PL/SQL",
                "Python",
                "T-SQL"
        });
        styleComponent(languageComboBox);
        
        analyzeButton = createStyledButton("🔍 Analizar");
        analyzeButton.addActionListener(e -> analyzeCode());
        
        viewTreeButton = createStyledButton("🌳 Ver Árbol");
        viewTreeButton.addActionListener(e -> showParseTree());
        viewTreeButton.setEnabled(false); // Deshabilitar hasta tener un árbol de análisis válido
        
        loadFileButton = createStyledButton("📁 Cargar Archivo");
        loadFileButton.addActionListener(e -> loadFile());
        
        clearButton = createStyledButton("🗑️ Limpiar");
        clearButton.addActionListener(e -> clearAll());
    }
    
    /**
     * Crea una tabla con estilos personalizados
     */
    private JTable createStyledTable(DefaultTableModel model) {
        JTable table = new JTable(model);
        table.setBackground(LIGHT_SECONDARY);
        table.setForeground(DARK_TEXT);
        table.setSelectionBackground(SELECTION_COLOR);
        table.setSelectionForeground(DARK_TEXT);
        table.setGridColor(BORDER_COLOR);
        table.setRowHeight(25);
        table.getTableHeader().setBackground(BLUE_LIGHT);
        table.getTableHeader().setForeground(DARK_TEXT);
        table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 12));
        table.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, 1));
        return table;
    }
    
    /**
     * Crea un ScrollPane con estilos personalizados
     */
    private JScrollPane createStyledScrollPane(JComponent component) {
        JScrollPane scrollPane = new JScrollPane(component);
        scrollPane.setBackground(LIGHT_SECONDARY);
        scrollPane.getViewport().setBackground(LIGHT_SECONDARY);
        scrollPane.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, 1));
        return scrollPane;
    }
    
    /**
     * Crea un botón con estilos personalizados
     */
    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        applyButtonStyles(button);
        return button;
    }
    
    /**
     * Aplica estilos completos a un botón
     */
    private void applyButtonStyles(JButton button) {
        button.setFont(new Font("SansSerif", Font.BOLD, 12));
        button.setFocusPainted(false);
        button.setBorderPainted(true);
        button.setOpaque(true);
        button.setContentAreaFilled(true);
        
        // Aplicar colores para estado normal
        button.setBackground(BORDER_COLOR);
        button.setForeground(MEDIUM_TEXT);
        
        // Crear border personalizado
        button.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BLUE_ACCENT, 1),
            BorderFactory.createEmptyBorder(8, 16, 8, 16)
        ));
        
        // Manejar estados del botón
        button.addChangeListener(e -> {
            if (button.getModel().isEnabled()) {
                if (button.getModel().isPressed()) {
                    // Estado presionado - fondo más oscuro, texto blanco
                    button.setBackground(BORDER_COLOR);
                    button.setForeground(MEDIUM_TEXT);
                    button.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(BLUE_ACCENT.darker().darker(), 2),
                        BorderFactory.createEmptyBorder(7, 15, 7, 15)
                    ));
                } else if (button.getModel().isRollover()) {
                    // Estado hover - fondo más claro, texto blanco
                    button.setBackground(BORDER_COLOR);
                    button.setForeground(MEDIUM_TEXT);
                    button.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(BLUE_SECONDARY, 1),
                        BorderFactory.createEmptyBorder(8, 16, 8, 16)
                    ));
                } else {
                    // Estado normal
                    button.setBackground(BORDER_COLOR);
                    button.setForeground(MEDIUM_TEXT);
                    button.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(BORDER_COLOR, 1),
                        BorderFactory.createEmptyBorder(8, 16, 8, 16)
                    ));
                }
            } else {
                // Estado deshabilitado
                button.setBackground(BORDER_COLOR);
                button.setForeground(MEDIUM_TEXT);
                button.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(BORDER_COLOR, 1),
                    BorderFactory.createEmptyBorder(8, 16, 8, 16)
                ));
            }
        });
        
        button.repaint();
    }
    
    /**
     * Aplica estilos a un componente genérico
     */
    private void styleComponent(JComponent component) {
        if (component instanceof JComboBox) {
            applyComboBoxStyles((JComboBox<?>) component);
        } else {
            component.setBackground(LIGHT_SECONDARY);
            component.setForeground(DARK_TEXT);
            component.setOpaque(true);
        }
    }
    
    /**
     * Aplica estilos específicos para ComboBox
     */
    private void applyComboBoxStyles(JComboBox<?> comboBox) {
        comboBox.setBackground(LIGHT_SECONDARY);
        comboBox.setForeground(DARK_TEXT);
        comboBox.setOpaque(true);
        comboBox.setFont(new Font("SansSerif", Font.PLAIN, 12));
        
        comboBox.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 1),
            BorderFactory.createEmptyBorder(4, 8, 4, 8)
        ));
        
        // Configurar el renderer para los elementos de la lista
        comboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                          boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                
                if (isSelected) {
                    setBackground(SELECTION_COLOR);
                    setForeground(DARK_TEXT);
                } else {
                    setBackground(LIGHT_SECONDARY);
                    setForeground(DARK_TEXT);
                }
                setOpaque(true);
                setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));
                
                return this;
            }
        });
        
        if (comboBox.isEditable()) {
            Component editor = comboBox.getEditor().getEditorComponent();
            editor.setBackground(LIGHT_SECONDARY);
            editor.setForeground(DARK_TEXT);
        }
        
        comboBox.repaint();
    }
    
    /**
     * Organiza los componentes en el layout principal
     */
    private void layoutComponents() {
        // Panel principal con BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        mainPanel.setBackground(LIGHT_PRIMARY);
        
        // Header con logo de CompiSim
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(LIGHT_SECONDARY);
        headerPanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 1),
            BorderFactory.createEmptyBorder(10, 15, 10, 15)
        ));
        
        JLabel logoLabel = new JLabel("CompiSim");
        logoLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        logoLabel.setForeground(BLUE_ACCENT);
        
        JLabel subtitleLabel = new JLabel("Simulador de Compilador Multilenguaje");
        subtitleLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        subtitleLabel.setForeground(MEDIUM_TEXT);
        
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBackground(LIGHT_SECONDARY);
        titlePanel.add(logoLabel, BorderLayout.NORTH);
        titlePanel.add(subtitleLabel, BorderLayout.CENTER);
        
        headerPanel.add(titlePanel, BorderLayout.WEST);
        
        // Barra de herramientas
        JPanel toolbarPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        toolbarPanel.setBackground(LIGHT_PRIMARY);
        toolbarPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        
        JLabel languageLabel = new JLabel("Lenguaje:");
        languageLabel.setForeground(DARK_TEXT);
        languageLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
        toolbarPanel.add(languageLabel);
        toolbarPanel.add(Box.createHorizontalStrut(5));
        toolbarPanel.add(languageComboBox);
        toolbarPanel.add(Box.createHorizontalStrut(15));
        toolbarPanel.add(analyzeButton);
        toolbarPanel.add(Box.createHorizontalStrut(5));
        toolbarPanel.add(viewTreeButton);
        toolbarPanel.add(Box.createHorizontalStrut(5));
        toolbarPanel.add(loadFileButton);
        toolbarPanel.add(Box.createHorizontalStrut(5));
        toolbarPanel.add(clearButton);
        
        // Panel norte que combina header y toolbar
        JPanel northPanel = new JPanel(new BorderLayout());
        northPanel.setBackground(LIGHT_PRIMARY);
        northPanel.add(headerPanel, BorderLayout.NORTH);
        northPanel.add(toolbarPanel, BorderLayout.CENTER);
        
        mainPanel.add(northPanel, BorderLayout.NORTH);
        
        // Panel dividido para código y análisis
        JSplitPane horizontalSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        horizontalSplitPane.setDividerLocation(500);
        horizontalSplitPane.setBackground(LIGHT_PRIMARY);
        
        // Panel izquierdo (Entrada de código)
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 1), 
            "📝 Editor de Código", 
            0, 0, 
            new Font("SansSerif", Font.BOLD, 12), 
            BLUE_ACCENT
        ));
        leftPanel.setBackground(LIGHT_PRIMARY);
        leftPanel.add(createStyledScrollPane(codeTextArea), BorderLayout.CENTER);
        
        // Panel derecho (Resultados del análisis)
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 1), 
            "📊 Resultados del Análisis", 
            0, 0, 
            new Font("SansSerif", Font.BOLD, 12), 
            BLUE_ACCENT
        ));
        rightPanel.setBackground(LIGHT_PRIMARY);
        rightPanel.add(analysisTabbedPane, BorderLayout.CENTER);
        
        horizontalSplitPane.setLeftComponent(leftPanel);
        horizontalSplitPane.setRightComponent(rightPanel);
        
        // Panel inferior para salida de acciones
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 1), 
            "📋 Registro de Actividad", 
            0, 0, 
            new Font("SansSerif", Font.BOLD, 12), 
            BLUE_ACCENT
        ));
        bottomPanel.setBackground(LIGHT_PRIMARY);
        bottomPanel.add(createStyledScrollPane(actionTextArea), BorderLayout.CENTER);
        
        // Panel dividido vertical para contenido principal y área de acciones
        JSplitPane verticalSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        verticalSplitPane.setDividerLocation(500);
        verticalSplitPane.setBackground(LIGHT_PRIMARY);
        verticalSplitPane.setTopComponent(horizontalSplitPane);
        verticalSplitPane.setBottomComponent(bottomPanel);
        
        mainPanel.add(verticalSplitPane, BorderLayout.CENTER);
        
        setContentPane(mainPanel);
    }
    
    private void detectLanguage() {
        String code = codeTextArea.getText();
        
        // Only try to detect language if there's enough code to work with
        if (code.length() > 10) {
            detectedLanguage = LanguageDetector.detectLanguage(code);
            
            // Update the language combo box if necessary
            String detectedLanguageText = languageToString(detectedLanguage);
            if (detectedLanguage != LanguageDetector.Language.UNKNOWN &&
                    !languageComboBox.getSelectedItem().equals(detectedLanguageText)) {
                languageComboBox.setSelectedItem(detectedLanguageText);
            }
        }
    }
    
    private LanguageDetector.Language getSelectedLanguage() {
        String selectedLanguage = (String) languageComboBox.getSelectedItem();
        
        if (selectedLanguage.equals("Detectar automáticamente")) {
            return detectedLanguage;
        }
        
        return switch (selectedLanguage) {
            case "C++" -> LanguageDetector.Language.CPP;
            case "HTML" -> LanguageDetector.Language.HTML;
            case "JavaScript" -> LanguageDetector.Language.JAVASCRIPT;
            case "Pascal" -> LanguageDetector.Language.PASCAL;
            case "PL/SQL" -> LanguageDetector.Language.PLSQL;
            case "Python" -> LanguageDetector.Language.PYTHON;
            case "T-SQL" -> LanguageDetector.Language.TSQL;
            default -> LanguageDetector.Language.UNKNOWN;
        };
    }
    
    private String languageToString(LanguageDetector.Language language) {
        return switch (language) {
            case CPP -> "C++";
            case HTML -> "HTML";
            case JAVASCRIPT -> "JavaScript";
            case PASCAL -> "Pascal";
            case PLSQL -> "PL/SQL";
            case PYTHON -> "Python";
            case TSQL -> "T-SQL";
            case UNKNOWN -> "Detectar automáticamente";
        };
    }
    
    private void analyzeCode() {
        String code = codeTextArea.getText();
        if (code.isEmpty()) {
            showError("El código está vacío.");
            return;
        }
        
        // Clear existing analysis results
        clearAnalysisResults();
        
        // Get the selected language or detect it
        LanguageDetector.Language language = getSelectedLanguage();
        if (language == LanguageDetector.Language.UNKNOWN) {
            showError("No se pudo detectar el lenguaje o el lenguaje no es compatible.");
            return;
        }
        
        // Show detected language in action area
        actionTextArea.setText("Lenguaje detectado: " + languageToString(language) + "\n");
        
        // Perform lexical analysis
        LexerManager lexerManager = new LexerManager(errorTableModel);
        List<TokenInfo> tokens = lexerManager.analyze(code, language);
        
        // Display token information
        displayTokens(tokens);
        
        // Mostrar la pestaña de tokens por defecto al iniciar análisis
        analysisTabbedPane.setSelectedIndex(0);
        
        // Skip further analysis if there are lexical errors
        if (errorTableModel.hasErrorsOfType(CompilationError.ErrorType.LEXICAL)) {
            displayErrors();
            actionTextArea.append("Se encontraron errores léxicos. Corríjalos antes de continuar.\n");
            viewTreeButton.setEnabled(false); // Disable tree viewer if there are lexical errors
            return;
        }
        
        // Perform syntax analysis
        ParseTree parseTree = parserManager.analyze(code, language);
        
        // Skip further analysis if there are syntax errors
        if (errorTableModel.hasErrorsOfType(CompilationError.ErrorType.SYNTACTIC) || parseTree == null) {
            displayErrors();
            actionTextArea.append("Se encontraron errores sintácticos. Corríjalos antes de continuar.\n");
            viewTreeButton.setEnabled(false); // Disable tree viewer if there are syntax errors
            return;
        }
        
        // We have a valid parse tree, enable the tree viewer button
        viewTreeButton.setEnabled(true);
        
        // Perform semantic analysis
        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer(errorTableModel, symbolTableModel);
        boolean semanticSuccess = semanticAnalyzer.analyze(parseTree, language);
        
        // Display all errors and symbols
        displayErrors();
        displaySymbols();
        
        // If there are no errors, simulate execution
        if (!errorTableModel.hasErrors()) {
            String executionResult = semanticAnalyzer.simulateExecution(code, language);
            if (!executionResult.isEmpty()) {
                actionTextArea.append("Ejecución simulada: " + executionResult + "\n");
            } else {
                actionTextArea.append("Análisis completado sin errores.\n");
            }
        } else {
            actionTextArea.append("Se encontraron errores durante el análisis. Corríjalos antes de ejecutar.\n");
        }
    }
    
    /**
     * Mostrar la visualización del árbol de análisis sintáctico
     */
    private void showParseTree() {
        // Obtener el último árbol de análisis y parser del gestor de parser
        ParseTree parseTree = parserManager.getLastParseTree();
        Parser parser = parserManager.getLastParser();
        
        // Mostrar la visualización del árbol
        TreeVisualizer.showTreeViewer(parseTree, parser, this);
    }
    
    private void loadFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar Archivo de Código");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
        
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                StringBuilder content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                codeTextArea.setText(content.toString());
                actionTextArea.setText("Archivo cargado: " + selectedFile.getName() + "\n");
            } catch (IOException e) {
                showError("Error al leer el archivo: " + e.getMessage());
            }
        }
    }
    
    private void clearAll() {
        codeTextArea.setText("");
        clearAnalysisResults();
        actionTextArea.setText("");
        languageComboBox.setSelectedIndex(0);
        detectedLanguage = LanguageDetector.Language.UNKNOWN;
        viewTreeButton.setEnabled(false);
    }
    
    private void clearAnalysisResults() {
        // Limpiar tabla de tokens
        DefaultTableModel tokenModel = (DefaultTableModel) tokenTable.getModel();
        tokenModel.setRowCount(0);
        
        // Limpiar tabla de errores
        DefaultTableModel errorModel = (DefaultTableModel) errorTable.getModel();
        errorModel.setRowCount(0);
        
        // Limpiar tabla de símbolos
        DefaultTableModel symbolModel = (DefaultTableModel) symbolTable.getModel();
        symbolModel.setRowCount(0);
        
        // Limpiar modelos de tabla de errores y símbolos
        errorTableModel.clear();
        symbolTableModel.clear();
        
        // Reiniciar componentes de visualización
        viewTreeButton.setEnabled(false);
    }
    
    private void displayTokens(List<TokenInfo> tokens) {
        DefaultTableModel model = (DefaultTableModel) tokenTable.getModel();
        model.setRowCount(0);
        
        for (TokenInfo token : tokens) {
            model.addRow(new Object[]{
                    token.getTypeName(),
                    token.getText(),
                    token.getLine(),
                    token.getColumn()
            });
        }
    }
    
    private void displayErrors() {
        DefaultTableModel model = (DefaultTableModel) errorTable.getModel();
        model.setRowCount(0);
        
        List<CompilationError> errors = errorTableModel.getAllErrors();
        for (CompilationError error : errors) {
            model.addRow(new Object[]{
                    error.getType(),
                    error.getMessage(),
                    error.getLine(),
                    error.getColumn()
            });
        }
        
        // Mantener la pestaña actual - el usuario decide cuándo ver errores
        if (!errors.isEmpty()) {
            actionTextArea.append("⚠️ Se encontraron " + errors.size() + " error(es). Ver pestaña 'Errores'.\n");
        }
    }
    
    private void displaySymbols() {
        DefaultTableModel model = (DefaultTableModel) symbolTable.getModel();
        model.setRowCount(0);
        
        List<Symbol> symbols = symbolTableModel.getAllSymbols();
        
        // Debug: agregar información sobre el estado de la tabla de símbolos
        actionTextArea.append("Tabla de símbolos: " + symbols.size() + " símbolos encontrados.\n");
        
        for (Symbol symbol : symbols) {
            model.addRow(new Object[]{
                    symbol.getName(),
                    symbol.getType(),
                    symbol.getScope(),
                    symbol.getValue() != null ? symbol.getValue() : "N/A",
                    symbol.getLine(),
                    symbol.getColumn()
            });
        }
        
        // Siempre mantener la pestaña actual (Tokens) - el usuario cambia manualmente
        if (!symbols.isEmpty()) {
            actionTextArea.append("💡 Los símbolos están disponibles en la pestaña 'Tabla de Símbolos'.\n");
        } else {
            actionTextArea.append("No se encontraron símbolos. Esto puede ocurrir si:\n");
            actionTextArea.append("• El lenguaje no tiene análisis semántico implementado completamente\n");
            actionTextArea.append("• El código no contiene declaraciones de variables\n");
            actionTextArea.append("• Hay errores sintácticos que impiden el análisis semántico\n");
        }
    }
    
    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void main(String[] args) {
        // Establecer look and feel del sistema
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Iniciar la UI en el hilo de eventos
        SwingUtilities.invokeLater(CompilerUI::new);
    }
} 