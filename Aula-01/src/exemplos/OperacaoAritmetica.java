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
		System.out.println("Subtra��o: " + subtracao);
		System.out.println("Multiplica��o: " + mult);
		System.out.println("Divis�o: " + div);
		System.out.println("Potencia��o: " + pot);
		System.out.println("Resto: " + resto);
		
		if (a > b) {
			System.out.println("A � maior que B!");
		} else if (a < b) {
			System.out.println("B � maior que A!");
		} else {
			System.out.println("A e B s�o iguais");
		}

	}

}
