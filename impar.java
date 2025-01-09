package logicaBasica;
import java.util.Scanner;

public class impar{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();

        if (numero % 2 != 0) {
            System.out.println("O número " + numero + " é impar");
        } else{
            System.out.println("O número não é impar");
        }
        
    }
}
