import java.util.ArrayList;
import java.util.Scanner;

/**
 * arraylista
 */
public class arraylista {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean fake = true;
        int numero = 0;
        ArrayList<Integer> lista = new ArrayList<Integer>();

        while (fake) {
            numero = leitor.nextInt();
            lista.add(numero);

            if (numero == -1) {
                fake = false;
                leitor.close();
            }
        }
        System.out.println(lista);
    }
}
