package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Crie um programa que leia 6 números double. Logo após calcule a média aritmética dos 3 primeiros
		// e a média aritmética dos 3 últimos. Imprima a soma das médias, e a média das médias.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro: ");
		double n1 = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira um número inteiro: ");
		double n2 = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira um número inteiro: ");
		double n3 = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira um número inteiro: ");
		double n4 = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira um número inteiro: ");
		double n5 = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira um número inteiro: ");
		double n6 = Double.parseDouble(leitor.nextLine());
		
		double m1 = (n1 + n2 + n3) / 3;
		double m2 = (n4 + n5 + n6) / 3;
		double sm = m1 + m2;
		double mm = (m1 + m2) / 2;
		
		System.out.println("A média é: " + m1);
		System.out.println("A média é: " + m2);
		System.out.println("A soma das médias é: " + sm);
		System.out.println("A média das médias é: " + mm);
	}

}
