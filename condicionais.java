package logicaBasica;

import java.util.Scanner;

public class condicionais {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade");
        idade = leitor.nextInt();

        if(idade >= 18){
            System.out.println("Já pode ser preso tem " + idade + " anos");
        } else {
            System.out.println("Toma tenência senão o pau quebra, você já tem " + idade + " anos");
        }

    }

}
