package com.roman31x.minijuego.dragonballz.origen.Controladores;

import com.roman31x.minijuego.dragonballz.origen.Musica.ControladorMusicaFondo;
import com.roman31x.minijuego.dragonballz.origen.Vista_Panel_Inicio.Menu_Minijuegos;
import com.roman31x.minijuego.dragonballz.origen.Vista_Panel_Inicio.Start_DragonBallZ_Origen;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Roman31X
 */
public class Control_Menu_Principal implements MouseListener{
    
    private Menu_Minijuegos menu;
    
    private Start_DragonBallZ_Origen origen = new Start_DragonBallZ_Origen();

    public Control_Menu_Principal(Menu_Minijuegos menu2) {
        this.menu = menu2;
        
        menu.Memoria.addMouseListener(this);
        menu.Laberinto.addMouseListener(this);
        menu.Combate.addMouseListener(this);
        menu.Atras.addMouseListener(this);
    
    }
        
    public void Mostrar(){
        menu.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e){
        if(e.getSource() == menu.Memoria){
            System.out.println("MEMORIA");
        }else if (e.getSource() == menu.Laberinto){
            System.out.println("LABERINTO");
        }else if (e.getSource() == menu.Combate){
            System.out.println("COMBATE");
        }else if (e.getSource() == menu.Atras){
            try {
                regresar();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Control_Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(Control_Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Control_Menu_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        if(e.getSource() == menu.Memoria){
            menu.Memoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/MemoriaLuz.png")));
        }else if (e.getSource() == menu.Laberinto){
            menu.Laberinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/laberintoLuz.png")));
        }else if (e.getSource() == menu.Combate){
            menu.Combate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/combateLuz.png")));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == menu.Memoria){
            menu.Memoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/juegoMemoria.png")));
        }else if (e.getSource() == menu.Laberinto){
            menu.Laberinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/laberintoGris.png")));
        }else if (e.getSource() == menu.Combate){
            menu.Combate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/combateGris.png")));
        }
    }
    public void regresar() throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        Control_Start iniciar = new Control_Start(origen);
        iniciar.Mostrar();
        menu.setVisible(false);
    }
}
