package dia3;

import java.util.Scanner;

public class ImparPar {
	public static void main(String args[])
    {
      // Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.
		
      System.out.println("Por favor digite um número");
      Scanner in = new Scanner(System.in);
      int numero = in.nextInt();
      
      if (numero % 2 == 0) {
        System.out.println("É um número par");
      } else {
        System.out.println("É um número ímpar");
      }
      in.close();
    }
}
