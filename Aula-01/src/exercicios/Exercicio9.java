package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// Escreva um programa que l� 4 n�meros do teclado e imprima a m�dia, o maior e o menor deles.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		float n1 = Float.parseFloat(leitor.nextLine());
		
		System.out.print("Insira um n�mero: ");
		float n2 = Float.parseFloat(leitor.nextLine());
		
		System.out.print("Insira um n�mero: ");
		float n3 = Float.parseFloat(leitor.nextLine());
		
		System.out.print("Insira um n�mero: ");
		float n4 = Float.parseFloat(leitor.nextLine());
		
		double media = (n1 + n2 + n3 + n4) / 4;
		
		float max = Math.max(n1, Math.max(n2, Math.max(n3, n4)));
		
		float min = Math.min(n1, Math.min(n2, Math.min(n3, n4)));
		
		System.out.println("A m�dia �: " + media);
		System.out.println("O maior �: " + max);
		System.out.println("O menor �: " + min);

	}

}
