package exemplos;

import java.util.Iterator;

public class FirstProgram {
	
	public int x = 5;
	public int y = 10;
	
	public static void main(String[] args) {
		FirstProgram primeiroPrograma = new FirstProgram();
		System.out.println(
			primeiroPrograma.x 
			+ primeiroPrograma.y
		);
		System.out.println("ALIIIII ALIIIII");
		
		//	8 bits
		byte b1 = 127;
		// 16 bits
		short b2 = 12700;
		// 32 bits
		int b3 = 1270000000;
		// 64 bits
		long b4 = 1270000000000000000l;
		
		// 32 bits
		float f1 = 3.1415f;
		// 64 bits
		double d1 = 3.15154325d;
		System.out.println(d1);
		
		
		boolean bool1 = true; 
		boolean bool2 = false;
		
		System.out.println(bool1);
		
		// String não é tipo, é CLASSE!!!!
		String texto = "Olá Mudo!";
		
	}
}