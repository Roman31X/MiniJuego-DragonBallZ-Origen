package com.roman31x.minijuego.dragonballz.origen;

/**
 *
 * @author Escorpio31X
 */

public class TestInterfaz{

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 8; i++) {
            sum += i;
            System.out.println("Current sum: " + sum);

            try {
                // Pausar el programa por 3 segundos (3000 milisegundos)
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("Final sum: " + sum);
    }
}
