package logicaBasica;
import java.util.Scanner;

public class conectivos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número com vírgula");
        double numero = leitor.nextDouble();

        if(numero >= 5 && numero <= 20){
            System.out.println("O número está entre 5 e 20 " + numero);
        } else{
            System.out.println("O número está em outro intervalo " + numero);
        }
    }
}
