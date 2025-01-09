package logicaBasica;

import java.util.Scanner;

/**
 * vetorNumero
 */
public class vetorNumero {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int MAX = 5;
        int[] lista = new int[MAX];
        boolean verifica = true;

        for (int i = 0; i < MAX; i++) {
            System.out.println("Digite um numero: ");
            lista[i] = leitor.nextInt();
        }

        while (verifica) {
            System.out.println("Digite um numero (digite 0 para sair)");
            int numero = leitor.nextInt();

            if (numero == 0) {
                verifica = false;
                break;
            }

            for (int i = 0; i < lista.length; i++) {
                if (numero == lista[i]) {
                    System.out.println("Numero encontrado");
                    break;
                } else {
                    System.out.println("Numero não encontrado");
                }
            }

        }

    }
}
