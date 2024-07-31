package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Faça um programa que calcule o aumento de um salário. Ele deve ler do teclado o valor do salário
		// e a porcentagem de aumento. Finalmente, imprima na tela o valor do salário, o percentual de
		// aumento, o valor do aumento e o novo salário.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira o salário: ");
		float salario = Float.parseFloat(leitor.nextLine());
				
		System.out.print("Insira o aumento: ");
		float aumento = Float.parseFloat(leitor.nextLine());
				
		float perc_aumento = (aumento / 100) + 1;
				
		float salario_atual = salario * perc_aumento;
		
		System.out.println("Seu novo salário é: R$" + salario_atual);
		
				
	}

}
