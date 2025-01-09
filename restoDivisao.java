package logicaBasica;

public class restoDivisao {
    public static void main(String[] args){
        double n1 = 8.5;
        double n2 = 7.25;
        double resultado = n1 % n2;

        System.out.println("O resultado é:" + String.format("%.1f", resultado));
    }
}
