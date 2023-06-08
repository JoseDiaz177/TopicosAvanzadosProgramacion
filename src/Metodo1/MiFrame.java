package Metodo1;


import javax.swing.JButton;
import javax.swing.JFrame;

public class MiFrame extends JFrame {
    
    JButton boton;
    
    MiFrame(){
        this.setSize(320, 200);
        
        boton = new JButton("Cerrar");
        
        MiListener listener = new MiListener();
        
        boton.addActionListener(listener);
        
        this.add(boton);
    }
    
    public static void main(String[] args){
        MiFrame frame = new MiFrame();  
        
        frame.setVisible(true);
    }
    
}

