import java.util.Scanner;

/**
 * parametros
 */
public class parametros {

    static void formataParada(String nome, int idade, double peso) {
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
        System.out.println("PESO: " + peso);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");

        String name = leitor.nextLine();

        System.out.println("Digite sua idade");
        int idade = leitor.nextInt();

        System.out.println("Digite seu peso: ");
        double peso = leitor.nextDouble();

        leitor.close();
        formataParada(name, idade, peso);
    }
}
