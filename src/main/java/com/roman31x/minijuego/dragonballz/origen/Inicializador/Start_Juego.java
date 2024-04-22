package com.roman31x.minijuego.dragonballz.origen.Inicializador;

import com.roman31x.minijuego.dragonballz.origen.Controladores.Control_Start;
import com.roman31x.minijuego.dragonballz.origen.Musica.ControladorMusicaFondo;
import com.roman31x.minijuego.dragonballz.origen.Vista_Panel_Inicio.Start_DragonBallZ_Origen;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Roman31X
 */
public class Start_Juego {
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        Start_DragonBallZ_Origen origen = new Start_DragonBallZ_Origen();
        Control_Start iniciar = new Control_Start(origen); 
        ControladorMusicaFondo music = new ControladorMusicaFondo();
        music.inicio();
        iniciar.Mostrar();
        
    }
}
