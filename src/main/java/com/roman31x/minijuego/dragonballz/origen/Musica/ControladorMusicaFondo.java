package com.roman31x.minijuego.dragonballz.origen.Musica;

import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Roman31X
 */
public class ControladorMusicaFondo {
    private Clip fondoMusica;

    public ControladorMusicaFondo() {
    }
        
    public void inicio() throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        InputStream ruta = null;
        ruta =getClass().getResourceAsStream("/AudioJuego/inicioMusic.wav");
        fondoMusica = AudioSystem.getClip();
        fondoMusica.open(AudioSystem.getAudioInputStream(ruta));
        fondoMusica.start();
    }
}
