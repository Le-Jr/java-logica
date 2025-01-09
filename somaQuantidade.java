package logicaBasica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * somaQuantidade
 */
public class somaQuantidade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i, j, k;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> listarPar = new ArrayList<Integer>();

        i = leitor.nextInt();
        j = leitor.nextInt();
        k = leitor.nextInt();

        lista.add(j);
        lista.add(k);

        for (int l = 0; l < i; l++) {
            if (lista.size() == i) {
                break;
            }
            lista.add(lista.get(l) + lista.get(lista.size() - 1));

        }

        System.out.println(lista);

        for (int l = 0; l < lista.size(); l++) {
            if (lista.get(l) % 2 == 0) {
                listarPar.add(lista.get(l));
            }
        }

        System.out.println(listarPar);
    }
}
