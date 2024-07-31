package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	
	public static void main(String[] args) {
		// Escreva um programa que pergunte o salário do funcionário e calcule o valor do aumento. Para
		// salários até R$1.000,00 calcule um aumento de 20%. Para salários maiores que R$1.000,00 até
		// R$2.000,00 calcule 15% de aumento, e por fim, para salários maiores que R$2.000,00 calcule 10%
		// de aumento. Para este exercício você deve utilizar apenas if (não utilizar o else).

		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira o seu salario: ");
		float salario = Float.parseFloat(leitor.nextLine());
		
		if (salario <= 1000) {
			double salario_atual = salario * 1.2;
			System.out.println("Seu novo salário é R$" + salario_atual);
		} else if (salario > 1000 && salario <= 2000) {
			double salario_atual = salario * 1.15;
			System.out.println("Seu novo salário é R$" + salario_atual);
		} else {
			double salario_atual = salario * 1.1;
			System.out.println("Seu novo salário é R$" + salario_atual);
		}
	}


}
