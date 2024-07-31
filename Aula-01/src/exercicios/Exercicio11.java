package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// Crie um programa que leia do usuário um número inteiro e imprima o seu sucessor e seu
		// antecessor
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro: ");
		int n = Integer.parseInt(leitor.nextLine());

		int sucessor = n + 1;
		int antecessor = n - 1;
		
		System.out.println("O sucessor é " + sucessor);
		System.out.println("O antecessor é " + antecessor);
	}

}
