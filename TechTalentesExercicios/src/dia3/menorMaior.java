package dia3;

import java.util.Scanner;

public class menorMaior {

	public static void main(String args[])
    {
      /*Escreva um algoritmo em Java que leia dois n�meros inteiros e determine qual � o menor. 
       * Escreva um algoritmo que determina o maior tamb�m.*/

      Scanner in = new Scanner(System.in);
      int continuarPrograma = 1;

      while (continuarPrograma == 1) {
      
        System.out.println("Digite o primeiro valor: ");

        int primeiroValor = in.nextInt();
        
        System.out.println("Digite o segundo valor: ");

        int segundoValor = in.nextInt();

        if (primeiroValor < segundoValor) {
          System.out.println("O primeiro valor digitado � menor: " + primeiroValor);
        } else if (segundoValor < primeiroValor) {
          System.out.println("O segundo valor digitado � menor: " + segundoValor);
        } else {
          System.out.println("Os valores digitados s�o iguais");
        }

        System.out.println("Deseja continuar o programa s(1)/n(0)?");
        continuarPrograma = in.nextInt();

        
      }
      in.close();
    }
}
