package dia3;

import java.util.Scanner;

public class ClassificaNadador {

	public static void main(String args[])
    {
      /*Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
​
      Infantil A = 5 a 7 anos
      Infantil B = 8 a 11 anos
      Juvenil A = 12 a 13 anos
      Juvenil B = 14 a 17 anos
      Adultos = Maiores de 18 anos */

      Scanner in = new Scanner(System.in);
      int continuarPrograma = 1;

      while (continuarPrograma == 1) {
      
        System.out.println("Digite a idade do nadador: ");

        int idade = in.nextInt();
        

        boolean infantilA = idade >= 5 && idade <= 7;
        boolean infantilB = idade >= 8 && idade <= 11;
        boolean juvenilA = idade >= 12 && idade <= 13;
        boolean juvenilB = idade >= 14 && idade <= 17;
        boolean adultos = idade >= 18;

        if (infantilA) {
          System.out.println("Categoria infantil A");
        } else if (infantilB) {
          System.out.println("Categoria infantil B");
        } else if (juvenilA) {
          System.out.println("Categoria juvenil A");
        } else if (juvenilB) {
          System.out.println("Categoria juvenil B");
        } else if (adultos) {
          System.out.println("Categoria Adultos");
        } else {
          System.out.println("Categoria não encontrada para a idade: " + idade);
        }
          
        System.out.println("Deseja continuar o programa s(1)/n(0)?");
        continuarPrograma = in.nextInt();

      }
      in.close();
    }
}
