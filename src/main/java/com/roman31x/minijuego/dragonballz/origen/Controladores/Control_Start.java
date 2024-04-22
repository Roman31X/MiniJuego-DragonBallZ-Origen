package com.roman31x.minijuego.dragonballz.origen.Controladores;

import com.roman31x.minijuego.dragonballz.origen.Vista_Panel_Inicio.Start_DragonBallZ_Origen;
import java.awt.event.*;

/**
 *
 * @author Roman31X
 */
public class Control_Start implements MouseListener,ActionListener{
    
    private Start_DragonBallZ_Origen inicio;
    
    public Control_Start(Start_DragonBallZ_Origen inicio) {
        this.inicio = inicio;
        
        inicio.INICIAR.addActionListener(this);
        inicio.OPCIONES.addActionListener(this);
        inicio.SALIR.addActionListener(this);
        
    }
    
    public void Mostrar(){
        inicio.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        System.out.println(accion);
        switch(accion){
            case "INICIAR":;break;
            case "OPCIONES":;break;
            case "SALIR":
                System.exit(0);
                ;break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
