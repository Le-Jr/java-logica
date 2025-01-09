package logicaBasica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * menu
 */
public class menu {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        Scanner leitor = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
            System.out.println("1 - Adicionar Número");
            System.out.println("2 - Visualizar Números");
            System.out.println("3 - Calcular Média");
            System.out.println("4 - Calcular Soma");
            System.out.println("5 - Sair");

            System.out.println("Escolha uma opção: ");
            int numero = leitor.nextInt();

            switch (numero) {
                case 1:
                    adicionaNumero(leitor, listaNumeros);
                    break;
                case 2:
                    visualizaNumero(listaNumeros);
                    break;
                case 3:
                    calculaMedia(listaNumeros);
                    break;
                case 4:
                    calculaSoma(listaNumeros);
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Adicione uma opção válida");
                    break;
            }
        }
    }

    public static void adicionaNumero(Scanner leitor, ArrayList<Integer> listaNumeros) {
        System.out.println("Digite um número inteiro: ");
        listaNumeros.add(leitor.nextInt());

    }

    public static void visualizaNumero(ArrayList<Integer> listaNumeros) {
        System.out.println(listaNumeros);

    }

    public static void calculaSoma(ArrayList<Integer> listaNumeros) {
        int sum = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            sum += listaNumeros.get(i);
        }
        System.out.println("Soma: " + sum);
    }

    public static void calculaMedia(ArrayList<Integer> listaNumeros) {
        double sum = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            sum += listaNumeros.get(i);
        }

        double media = sum / listaNumeros.size();

        System.out.println("Média: " + media);
    }
