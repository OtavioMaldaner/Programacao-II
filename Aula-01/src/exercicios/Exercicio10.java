package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Crie um algoritmo que leia o valor do sal�rio m�nimo e o valor do sal�rio de um usu�rio, calcule a
		// quantidade de sal�rios m�nimos esse usu�rio ganha e imprima o resultado.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o salario minimo: ");
		float salario_min = Float.parseFloat(leitor.nextLine());
		
		System.out.println("Insira o seu salario: ");
		float salario = Float.parseFloat(leitor.nextLine());
		
		float vezes_salario = salario / salario_min;
		
		System.out.println("Voc� ganha " + vezes_salario + " sal�rios m�nimos");

	}

}
