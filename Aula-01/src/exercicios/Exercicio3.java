package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Faça um programa que leia 2 números inteiros do teclado e que imprima se os números são iguais
		// ou diferentes. Caso sejam diferentes, imprima o maior deles apenas.
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Insira um número inteiro: ");
		int a = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Insira um número inteiro: ");
		int b = Integer.parseInt(leitor.nextLine());
		
		if (a == b) {
			System.out.println("Os números são iguais!");
		} else {
			System.out.println(Math.max(a,  b) + " é maior!");
		}
	}

}
