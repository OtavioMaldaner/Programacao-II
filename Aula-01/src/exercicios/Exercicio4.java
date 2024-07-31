package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Crie um programa que calcule e mostre o volume de uma esfera. O raio da esfera será fornecido
		// pelo usuário através do teclado (tipo de dado double). Pesquisa a fórmula para cálcule de volume
		// da esfera e considere para PI o valor 3.14159
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o raio de uma circunferência: ");
		double raio = Double.parseDouble(leitor.nextLine());
		
		double volume = (4 / 3) * Math.PI * Math.pow(raio, 3);
		
		System.out.println("O volume da esfera é: " + volume);
	}

}
