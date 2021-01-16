package dia6;

import java.util.Scanner;

public class InverteString {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira uma palavra para ser invertida");
		String palavra = scanner.next();

		String invertida = "";
		System.out.println(palavra.length());
		
		for (int i = palavra.length()-1; i >= 0; i--) {
			invertida += palavra.charAt(i);
		}

		System.out.println(invertida);
		
		scanner.close();
	}
	
}
