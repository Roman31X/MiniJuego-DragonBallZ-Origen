package com.roman31x.minijuego.dragonballz.origen.Controladores;

import com.roman31x.minijuego.dragonballz.origen.Vista_Panel_Inicio.Start_DragonBallZ_Origen;
import java.awt.event.*;

/**
 *
 * @author Roman31X
 */
public class Control_Start implements MouseListener,ActionListener{
    
    private Start_DragonBallZ_Origen inicio;
    private ControladorTiempoVisible tiempo = new ControladorTiempoVisible();
    
    public Control_Start(Start_DragonBallZ_Origen inicio) {
        this.inicio = inicio;
        
        inicio.INICIAR.addActionListener(this);
        inicio.SALIR.addActionListener(this);
        
    }
    
    public void Mostrar(){
        inicio.setVisible(true);
        for(int i = 0;i < 8; i++){
            switch(i){
                case 0: tiempo.timepoAnimacionLabel(inicio.Uno);break;
                case 1: tiempo.timepoAnimacionLabel(inicio.Dos);break;
                case 2: tiempo.timepoAnimacionLabel(inicio.Tres);break;
                case 3: tiempo.timepoAnimacionLabel(inicio.Cuatro);break;
                case 4: tiempo.timepoAnimacionLabel(inicio.Cinco);break;
                case 5: tiempo.timepoAnimacionLabel(inicio.Seis);break;
                case 6: tiempo.timepoAnimacionLabel(inicio.Siete);break;
                case 7: tiempo.timepoAnimacionLabel(inicio.Ocho);break;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        System.out.println(accion);
        switch(accion){
            case "INICIAR":;break;
            case "SALIR":System.exit(0);break;
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
