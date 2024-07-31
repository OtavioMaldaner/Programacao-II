package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Modifique o programa criado anteriormente utilizando condições if e else.
		// Para este exercício você deve utilizar if e else if.


		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira o seu salario: ");
		float salario = Float.parseFloat(leitor.nextLine());
		
		if (salario <= 1000) {
			double salario_atual = salario * 1.2;
			System.out.println("Seu novo salário é R$" + salario_atual);
		} 
		if (salario > 1000 && salario <= 2000) {
			double salario_atual = salario * 1.15;
			System.out.println("Seu novo salário é R$" + salario_atual);
		}
		
		if (salario > 2000) {
			double salario_atual = salario * 1.1;
			System.out.println("Seu novo salário é R$" + salario_atual);
		}
	}
}
