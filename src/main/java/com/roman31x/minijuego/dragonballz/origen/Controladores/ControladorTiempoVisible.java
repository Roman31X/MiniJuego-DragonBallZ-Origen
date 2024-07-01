package com.roman31x.minijuego.dragonballz.origen.Controladores;

/**
 *
 * @author Roman31X
 */

import javax.swing.*;
import java.awt.event.*;

public class ControladorTiempoVisible {
    
    public void timepoAnimacionLabel(JLabel labelBlanco){
        visualizacionLabel (labelBlanco);
        try {
            // Pausar el programa por 3 segundos (3000 milisegundos)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }
    }
    
    public void visualizacionLabel (JLabel labelBlanco){
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelBlanco.setVisible(false);
            }
        });
        timer.setRepeats(false); // Ejecutar solo una vez
        timer.start();
    }
    
}
