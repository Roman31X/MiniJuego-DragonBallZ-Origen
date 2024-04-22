package com.roman31x.minijuego.dragonballz.origen.Musica;

import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.*;

/**
 *
 * @author Roman31X
 */
public class ControladorMusicaSonidos {
    private Clip musica;
    
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
