package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Crie um programa que calcule e mostre o volume de uma esfera. O raio da esfera ser� fornecido
		// pelo usu�rio atrav�s do teclado (tipo de dado double). Pesquisa a f�rmula para c�lcule de volume
		// da esfera e considere para PI o valor 3.14159
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o raio de uma circunfer�ncia: ");
		double raio = Double.parseDouble(leitor.nextLine());
		
		double volume = (4 / 3) * Math.PI * Math.pow(raio, 3);
		
		System.out.println("O volume da esfera �: " + volume);
	}

}
