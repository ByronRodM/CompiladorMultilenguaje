package umg.edu.ui;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Utilidad para visualizar árboles de análisis sintáctico
 */
public class TreeVisualizer {

    /**
     * Muestra un árbol de análisis sintáctico en un diálogo
     * @param parseTree El árbol de análisis a visualizar
     * @param parser El parser que creó el árbol
     * @param parent El componente padre para el diálogo
     */
    public static void showTreeViewer(ParseTree parseTree, Parser parser, Component parent) {
        if (parseTree == null || parser == null) {
            JOptionPane.showMessageDialog(
                    parent,
                    "No hay árbol de análisis disponible.\nPrimero debe realizar un análisis sintáctico.",
                    "Árbol no disponible",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        
        // Crear el visualizador del árbol
        final TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), parseTree);
        viewer.setScale(1.5); // Escalar un poco para mejor visibilidad
        
        // Crear un panel para contener el visualizador del árbol y el botón de exportar
        JPanel panel = new JPanel(new BorderLayout());
        
        // Agregar el visualizador del árbol con barras de desplazamiento
        JScrollPane treeScrollPane = new JScrollPane(viewer);
        panel.add(treeScrollPane, BorderLayout.CENTER);
        
        // Agregar botón de exportar (centrado)
        JButton exportButton = new JButton("Exportar Imagen");
        exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exportTreeImage(viewer, parent);
            }
        });
        
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(exportButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        
        // Crear el diálogo
        JDialog dialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(parent), "Visualizador de Árbol Sintáctico", true);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.getContentPane().add(panel);
        dialog.setSize(800, 600);
        dialog.setLocationRelativeTo(parent);
        dialog.setVisible(true);
    }
    
    /**
     * Exporta la vista del árbol a un archivo de imagen
     * @param viewer El visualizador del árbol a exportar
     * @param parent El componente padre
     */
    private static void exportTreeImage(TreeViewer viewer, Component parent) {
        // Crear un selector de archivos
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Imagen");
        fileChooser.setFileFilter(new FileNameExtensionFilter("PNG Image", "png"));
        fileChooser.setSelectedFile(new File("arbol_sintactico.png"));
        
        // Mostrar diálogo de guardar
        int result = fileChooser.showSaveDialog(parent);
        if (result != JFileChooser.APPROVE_OPTION) {
            return;
        }
        
        // Obtener el archivo y agregar extensión .png si no está presente
        File file = fileChooser.getSelectedFile();
        if (!file.getName().toLowerCase().endsWith(".png")) {
            file = new File(file.getAbsolutePath() + ".png");
        }
        
        try {
            // Crear una imagen buffered desde el componente viewer
            Dimension size = viewer.getSize();
            BufferedImage image = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = image.createGraphics();
            
            // Llenar el fondo con blanco
            g2.setColor(Color.WHITE);
            g2.fillRect(0, 0, size.width, size.height);
            
            // Pintar el viewer
            viewer.paint(g2);
            g2.dispose();
            
            // Guardar la imagen
            ImageIO.write(image, "png", file);
            
            JOptionPane.showMessageDialog(
                    parent,
                    "Imagen guardada exitosamente en:\n" + file.getAbsolutePath(),
                    "Exportación Exitosa",
                    JOptionPane.INFORMATION_MESSAGE
            );
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    parent,
                    "Error al guardar la imagen: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
} 