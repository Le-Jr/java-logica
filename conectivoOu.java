package logicaBasica;
import java.util.Scanner;

public class conectivoOu {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        double numero = leitor.nextDouble();

        if(numero < 5 || numero > 10){
            System.out.println("tá no intervalo " + numero);
        } else{
            System.out.println("não tá no intervalo " + numero);
        }
    }
}
