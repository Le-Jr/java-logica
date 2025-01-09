import java.util.Scanner;

/**
 * calculadora
 */
public class calculadora {

    static float addNum(float n1, float n2) {
        return n1 + n2;
    }

    static float subNum(float n1, float n2) {
        return n1 - n2;
    }

    static float multNum(float n1, float n2) {
        return n1 * n2;
    }

    static float divNum(float n1, float n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha uma operação add - 1 sub - 2 mult - 3 div - 4 ");
        int opcao = leitor.nextInt();

        System.out.println("Digite dois numeros");
        float n1 = leitor.nextFloat();
        float n2 = leitor.nextFloat();
        leitor.close();

        switch (opcao) {
            case 1:
                System.out.println(addNum(n1, n2));
                break;
            case 2:
                System.out.println(subNum(n1, n2));
                break;
            case 3:
                System.out.println(multNum(n1, n2));
                break;
            case 4:
                System.out.println(divNum(n1, n2));
                break;
            default:
                System.out.println("Digite uma opção válida");
                break;
        }
    }
}
