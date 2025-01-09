package logicaBasica;

import java.util.Random;

/**
 * numeroAleatorio
 */
public class numeroAleatorio {

    public static void main(String[] args) {
        Random numeroAleatorio = new Random();

        System.out.println(numeroAleatorio.nextInt(100));
    }
}
