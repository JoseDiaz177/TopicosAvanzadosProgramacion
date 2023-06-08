
package Metodo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MiFrame extends JFrame implements ActionListener {
    
    JButton boton;
    
    MiFrame(){
        this.setSize(320, 200);
        
        boton = new JButton("Cerrar");
        
        boton.addActionListener(this);
        
        this.add(boton);
    }
    
    public static void main(String[] args){
        MiFrame frame = new MiFrame();  
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    
}
