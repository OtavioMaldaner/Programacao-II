package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Escreva um programa que solicite as seguintes informações sobre uma viagem: quilometragem
		// inicial do carro, quilometragem do carro após a viagem e o número de litros de combustível
		// consumidos. Com base nessas informações calcule a média de consumo do carro por litro e
		// imprima na tela.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira a quilometragem inicial do carro: ");
		float km_inicial = Float.parseFloat(leitor.nextLine());
		
		System.out.print("Insira a quilometragem final do carro: ");
		float km_final = Float.parseFloat(leitor.nextLine());
		
		System.out.print("Insira o combustível consumido: ");
		float l_consumido = Float.parseFloat(leitor.nextLine());
		
		float media = (km_final - km_inicial) / l_consumido;
		
		System.out.println("A média final do seu carro foi de " + media + " litros");
	}

}
