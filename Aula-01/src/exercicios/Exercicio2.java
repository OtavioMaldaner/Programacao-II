package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Escreva um programa que lê um número do teclado e que determine se ele é par ou impar.

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int a = Integer.parseInt(leitor.nextLine());
		
		int resto = a % 2;
		
		if (resto == 0) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é ímpar!");
		}

	}

}
