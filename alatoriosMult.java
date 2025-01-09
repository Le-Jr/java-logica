package logicaBasica;

import java.util.Random;
import java.util.random.*;

/**
 * alatoriosMult
 */
public class alatoriosMult {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int min = 1;
        int max = 6;

        int n1 = min + aleatorio.nextInt(max - min + 1);

        int n2 = min + aleatorio.nextInt(max - min + 1);
        int mult = n1 * n2;

        if (mult > 15) {
            System.out.println("O número é maior que 15 " + mult);
        } else {
            System.out.println("O número é menor que 15 " + mult);
        }

        // System.out.println(n1);
    }
}
