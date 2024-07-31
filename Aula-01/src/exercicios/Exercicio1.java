package exercicios;

import java.util.Scanner;

//Faça um programa que leia 2 números inteiros do teclado e que imprima na tela a soma,
// substração, multiplicação, divisão e resto da divisão desses dois números.
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int a = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Digite outro número inteiro: ");
		int b = Integer.parseInt(leitor.nextLine());
		
		int soma = a + b;
		int subtracao = a - b;
		int multiplicacao = a * b;
		int divisao = a / b;
		int resto = a % b;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
		System.out.println("Resto: " + resto);


	}

}
