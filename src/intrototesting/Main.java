package intrototesting;

import java.util.Scanner;

public class Main {

	public static final int NUM_REPETICIONES = 3;
	
	public static void main(String[] args) {
		Suma suma = new Suma();
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < NUM_REPETICIONES; i++) {
			suma.obtenerValores(teclado);
			Dibujante.dibujitoEnAscii1();

		}
		
		Dibujante.dibujitoEnAscii2();

		
		
		
        teclado.close();
	}
}

