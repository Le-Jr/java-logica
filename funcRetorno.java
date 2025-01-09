import java.util.Scanner;

/**
 * funcRetorno
 */
public class funcRetorno {

    static String espanhol() {
        return "Buenos Dias";
    }

    static String port() {
        return "Bom dia!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha um idioma: ");
        int numero = leitor.nextInt();
        leitor.close();
        switch (numero) {
            case 1:
                System.out.println(port());
                break;
            case 2:
                System.out.println(espanhol());
                break;
            default:
                System.out.println("Digite uma opção válida");
                break;
        }

    }
}
