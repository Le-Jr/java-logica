package logicaBasica;

import java.util.Scanner;

/**
 * vetorSemana
 */
public class vetorSemana {

    public static void main(String[] args) {
        final String[] DIAS = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7");
        int dia = leitor.nextInt();

        System.out.println("Hoje é " + DIAS[dia - 1]);
    }
}
