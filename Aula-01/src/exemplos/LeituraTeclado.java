package exemplos;

import java.util.Scanner;

public class LeituraTeclado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um nome: ");
		String nome = scanner.nextLine();
		
		
		
		System.out.print("Digite sua idade: ");
		int idade = Integer.parseInt(scanner.nextLine());
		System.out.println("Seu nome é " + nome + " ");
		System.out.println(idade);
	}

}
