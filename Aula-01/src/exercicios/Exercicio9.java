package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// Escreva um programa que lê 4 números do teclado e imprima a média, o maior e o menor deles.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		float n1 = Float.parseFloat(leitor.nextLine());
		
		System.out.print("Insira um número: ");
		float n2 = Float.parseFloat(leitor.nextLine());
		
		System.out.print("Insira um número: ");
		float n3 = Float.parseFloat(leitor.nextLine());
		
		System.out.print("Insira um número: ");
		float n4 = Float.parseFloat(leitor.nextLine());
		
		double media = (n1 + n2 + n3 + n4) / 4;
		
		float max = Math.max(n1, Math.max(n2, Math.max(n3, n4)));
		
		float min = Math.min(n1, Math.min(n2, Math.min(n3, n4)));
		
		System.out.println("A média é: " + media);
		System.out.println("O maior é: " + max);
		System.out.println("O menor é: " + min);

	}

}
