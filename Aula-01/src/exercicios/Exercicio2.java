package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Escreva um programa que l� um n�mero do teclado e que determine se ele � par ou impar.

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int a = Integer.parseInt(leitor.nextLine());
		
		int resto = a % 2;
		
		if (resto == 0) {
			System.out.println("O n�mero � par!");
		} else {
			System.out.println("O n�mero � �mpar!");
		}

	}

}
