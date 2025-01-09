package logicaBasica;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número:");
        int n1;
        n1 = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Digite outro número:");
        int n2;
        n2 = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Digite o último número:");
        int n3;
        n3 = leitor.nextInt();
        leitor.nextLine();

        int resultado = n1 + n2 + n3;
        System.out.print("o resultado é:" + resultado);
    }
}
