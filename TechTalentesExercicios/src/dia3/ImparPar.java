package dia3;

import java.util.Scanner;

public class ImparPar {
	public static void main(String args[])
    {
      // Escreva um algoritmo que leia um n�mero inteiro e diga se ele � par ou �mpar.
		
      System.out.println("Por favor digite um n�mero");
      Scanner in = new Scanner(System.in);
      int numero = in.nextInt();
      
      if (numero % 2 == 0) {
        System.out.println("� um n�mero par");
      } else {
        System.out.println("� um n�mero �mpar");
      }
      in.close();
    }
}
