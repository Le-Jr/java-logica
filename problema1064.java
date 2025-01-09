package logicaBasica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class problema1064 {
  public static void main(String[] args){
      // 1 - Ler valores FEITO
      // 2 - Armazenar os valores no arrayList FEITO
      // 3 - Verificar quais são positivos FEITO
      // 4 - Somar o array - FEITO
      // 5 - Fazer a media - FEITO

      double sum = 0;
      double media;
      ArrayList<Double> list = new ArrayList<Double>();
      ArrayList<Double> positiveList = new ArrayList<Double>();
      Scanner leitor = new Scanner(System.in);

     for(int i=0; i<6; i++){
        list.add(leitor.nextDouble());

        if(list.get(i)> 0) {
            positiveList.add(list.get(i));
        }
     }
 
     for(int i = 0; i < positiveList.size(); i++){
         sum += positiveList.get(i);
     }


     media = sum / positiveList.size();
     System.out.println(positiveList.size()   +  " valores positivos");
     System.out.println(String.format("%.1f", media));

  }

}
