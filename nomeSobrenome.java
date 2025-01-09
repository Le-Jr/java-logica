package logicaBasica;

import java.util.Scanner;

public class nomeSobrenome {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        String nome;
        String sobrenome;

        System.out.print("Digite seu nome:");
        nome = leitor.nextLine();

        System.out.print("Digite seu sobrenome:");
        sobrenome = leitor.nextLine();

        System.out.print("Seu nome completo é " + String.format(nome + " " + sobrenome));
    }
}
