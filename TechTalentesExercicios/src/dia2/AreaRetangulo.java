package dia2;

import java.util.Scanner;

public class AreaRetangulo {
	public static void main(String args[])
    {
        // Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a �rea do ret�ngulo.
		
        Scanner scanner = new Scanner(System.in);

        System.out.println("Esse algoritimo calcula a �rea de um ret�ngulo");
        
        System.out.println("Por favor digite a base do ret�ngulo");
        float base = scanner.nextFloat();
        
        System.out.println("Por favor digite a altura do ret�ngulo");
        float altura = scanner.nextFloat();
        
        float area = base * altura;

        System.out.println("A �rea do ret�ngulo �: " + area);
        
        scanner.close();
    }
}
