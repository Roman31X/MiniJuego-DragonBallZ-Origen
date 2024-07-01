package com.roman31x.minijuego.dragonballz.origen;

/**
 *
 * @author Roman31X
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCarga {
    public static void main(String[] args) {
     JFrame frame = new JFrame("Blue Label Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Crear el JLabel
        JLabel blueLabel = new JLabel("This is a blue label");
        blueLabel.setOpaque(true); // Necesario para que el fondo sea visible
        blueLabel.setBackground(Color.BLUE);
        blueLabel.setForeground(Color.WHITE); // Texto blanco para contraste
        frame.add(blueLabel);

        // Hacer el JLabel invisible después de 6 segundos
        Timer timer = new Timer(6000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blueLabel.setVisible(false);
            }
        });
        timer.setRepeats(false); // Ejecutar solo una vez
        timer.start();

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
