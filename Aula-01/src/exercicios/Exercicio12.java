package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Crie um programa que leia 6 n�meros double. Logo ap�s calcule a m�dia aritm�tica dos 3 primeiros
		// e a m�dia aritm�tica dos 3 �ltimos. Imprima a soma das m�dias, e a m�dia das m�dias.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira um n�mero inteiro: ");
		double n1 = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira um n�mero inteiro: ");
		double n2 = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira um n�mero inteiro: ");
		double n3 = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira um n�mero inteiro: ");
		double n4 = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira um n�mero inteiro: ");
		double n5 = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira um n�mero inteiro: ");
		double n6 = Double.parseDouble(leitor.nextLine());
		
		double m1 = (n1 + n2 + n3) / 3;
		double m2 = (n4 + n5 + n6) / 3;
		double sm = m1 + m2;
		double mm = (m1 + m2) / 2;
		
		System.out.println("A m�dia �: " + m1);
		System.out.println("A m�dia �: " + m2);
		System.out.println("A soma das m�dias �: " + sm);
		System.out.println("A m�dia das m�dias �: " + mm);
	}

}
