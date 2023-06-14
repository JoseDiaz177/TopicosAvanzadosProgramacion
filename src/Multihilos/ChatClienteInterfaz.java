
package Multihilos;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class ChatClienteInterfaz extends JFrame {

    public ChatClienteInterfaz() {
        // Configura el tamaño y la ubicación de la ventana
        setSize(400, 300);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Agrega componentes a la ventana
        initComponents();
    }
    
    private void initComponents() {
        // Crea los componentes de la interfaz, como botones, campos de texto, etc.
        // Agrégalos al contenido del JFrame utilizando el gestor de diseño apropiado (por ejemplo, BorderLayout, GridBagLayout, etc.)
        
        // Ejemplo:
        JPanel panel = new JPanel();
        JButton sendButton = new JButton("Enviar");
        JTextField messageField = new JTextField(20);
        JTextArea chatArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        
        panel.add(scrollPane);
        panel.add(messageField);
        panel.add(sendButton);
        
        // Configura el comportamiento de los componentes (eventos, acciones, etc.)
        
        // Ejemplo:
        sendButton.addActionListener(e -> {
            String message = messageField.getText();
            // Lógica para enviar el mensaje al servidor de chat
            chatArea.append("Cliente: " + message + "\n");
            messageField.setText("");
        });
        
        // Configura el gestor de diseño del JFrame y agrega el panel principal
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        // Crea una instancia de la interfaz del cliente y hazla visible
        SwingUtilities.invokeLater(() -> {
            ChatClienteInterfaz chatInterface = new ChatClienteInterfaz();
            chatInterface.setVisible(true);
        });
    }
}
    