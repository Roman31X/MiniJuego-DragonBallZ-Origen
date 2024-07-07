package com.roman31x.minijuego.dragonballz.origen.Controladores;

import com.roman31x.minijuego.dragonballz.origen.Vista_Panel_Inicio.Menu_Minijuegos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Roman31X
 */
public class Control_Menu_Principal implements MouseListener{
    
    private Menu_Minijuegos menu;

    public Control_Menu_Principal(Menu_Minijuegos menu2) {
        this.menu = menu2;
    
    
    }
        
    public void Mostrar(){
        menu.setVisible(true);
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
