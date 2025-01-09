package logicaBasica;
import java.util.Scanner;

public class letras {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite uma palavra");
        String palavra = leitor.nextLine();

        if(palavra.length() >= 5){
            System.out.println("A palavra tem mais de 5 letras");
        } else{
            System.out.println("Ela tem menos de 5 letras");
        }

    }
}
