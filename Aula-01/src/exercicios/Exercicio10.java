package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a
		// quantidade de salários mínimos esse usuário ganha e imprima o resultado.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o salario minimo: ");
		float salario_min = Float.parseFloat(leitor.nextLine());
		
		System.out.println("Insira o seu salario: ");
		float salario = Float.parseFloat(leitor.nextLine());
		
		float vezes_salario = salario / salario_min;
		
		System.out.println("Você ganha " + vezes_salario + " salários mínimos");

	}

}
