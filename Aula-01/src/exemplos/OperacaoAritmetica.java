package exemplos;

public class OperacaoAritmetica {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int soma = a + b;
		int subtracao = a - b;
		int mult = a * b;
		int div = a / b;
		double pot = Math.pow(a, b);
		int resto = a % b;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + mult);
		System.out.println("Divisão: " + div);
		System.out.println("Potenciação: " + pot);
		System.out.println("Resto: " + resto);
		
		if (a > b) {
			System.out.println("A é maior que B!");
		} else if (a < b) {
			System.out.println("B é maior que A!");
		} else {
			System.out.println("A e B são iguais");
		}

	}

}
