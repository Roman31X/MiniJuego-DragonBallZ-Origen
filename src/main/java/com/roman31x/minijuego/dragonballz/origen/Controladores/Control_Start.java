package com.roman31x.minijuego.dragonballz.origen.Controladores;

import com.roman31x.minijuego.dragonballz.origen.Vista_Panel_Inicio.Menu_Minijuegos;
import com.roman31x.minijuego.dragonballz.origen.Vista_Panel_Inicio.Start_DragonBallZ_Origen;
import java.awt.event.*;

/**
 *
 * @author Roman31X
 */
public class Control_Start implements MouseListener{
    
    private Start_DragonBallZ_Origen inicio;
    private ControladorTiempoVisible tiempo = new ControladorTiempoVisible();
    
    
    public Control_Start(Start_DragonBallZ_Origen inicio1) {
        this.inicio = inicio1;
        
        inicio.INICIAR.addMouseListener(this);
        inicio.SALIR.addMouseListener(this);
        
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
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == inicio.INICIAR){
            final Menu_Minijuegos minijuegos = new Menu_Minijuegos();
            final Control_Menu_Principal menuPrincipal = new Control_Menu_Principal(minijuegos);
            menuPrincipal.Mostrar();
            inicio.setVisible(false);
        }
        
        if(e.getSource() == inicio.SALIR){
            System.exit(0);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == inicio.INICIAR){
            inicio.INICIAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/inicio.png")));
            inicio.INICIAR.setBackground(new java.awt.Color(240, 227, 131));
        }else if (e.getSource() == inicio.SALIR){
            inicio.SALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/finLuz.png")));
            inicio.SALIR.setBackground(new java.awt.Color(240, 227, 131));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == inicio.INICIAR){
            inicio.INICIAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/inicioGris.png")));
            inicio.INICIAR.setBackground(new java.awt.Color(204, 204, 204));
        }else if (e.getSource() == inicio.SALIR){
            inicio.SALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/finGris.png")));
            inicio.SALIR.setBackground(new java.awt.Color(204, 204, 204));
        }
    }
}
