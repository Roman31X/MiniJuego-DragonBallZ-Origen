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
public class ControladorMusica {
    private Clip fondoMusica;
    private Clip musica;

    public ControladorMusica() {
    }
        
    public void Play() throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        InputStream ruta = null;
        ruta =getClass().getResourceAsStream("/AudioJuego/inicioMusic.wav");
        fondoMusica = AudioSystem.getClip();
        fondoMusica.open(AudioSystem.getAudioInputStream(ruta));
        fondoMusica.start();
    }
    
    public Clip ReproducirAudio(int dato)throws LineUnavailableException{
        InputStream ruta = null;
        if(dato == 1){
            
        }else if(dato == 2){
            ruta =getClass().getResourceAsStream("/AudioJuego/inicioMusic.wav");
        }else if(dato == 3){
            ruta =getClass().getResourceAsStream("/AudioJuego/Jugar.wav");
        }
        
        Clip clip;
        clip = AudioSystem.getClip();
        try {
            clip.open(AudioSystem.getAudioInputStream(ruta));
        } catch (UnsupportedAudioFileException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } 
        return clip;
    }
}
