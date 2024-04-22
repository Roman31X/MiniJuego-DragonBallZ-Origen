package com.roman31x.minijuego.dragonballz.origen.Controladores;

import com.roman31x.minijuego.dragonballz.origen.Vista_Panel_Inicio.Start_DragonBallZ_Origen;
import javax.sound.sampled.Clip;

/**
 *
 * @author Roman31X
 */
public class Control_Start {
    
    private Start_DragonBallZ_Origen inicio;
    
    public Control_Start(Start_DragonBallZ_Origen inicio) {
        this.inicio = inicio;
    }
    
    public void Mostrar(){
        inicio.setVisible(true);
    }
}
