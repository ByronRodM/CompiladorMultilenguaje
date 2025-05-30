package umg.edu;

import umg.edu.ui.CompilerUI;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * Punto de entrada principal para la aplicación del simulador de compilador
 */
public class Main {
    public static void main(String[] args) {
        // Establecer look and feel del sistema
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Iniciar la UI en el hilo de eventos
        SwingUtilities.invokeLater(() -> {
            CompilerUI ui = new CompilerUI();
            ui.setVisible(true);
        });
    }
}
