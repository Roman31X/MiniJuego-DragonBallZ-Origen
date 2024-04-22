package com.roman31x.minijuego.dragonballz.origen;

/**
 *
 * @author Escorpio31X
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniJuegoDragonBallZOrigen extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de Timer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JLabel label = new JLabel("Este es un JLabel");
        frame.add(label);
        
        // Crear un Timer que ejecute una tarea después de 3 segundos
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cambiar la visibilidad del JLabel
                label.setVisible(false);
            }
        });
        
        // Iniciar el Timer
        timer.setRepeats(false); // Para que solo se ejecute una vez
        timer.start();
        
        frame.setVisible(true);
    }
}
