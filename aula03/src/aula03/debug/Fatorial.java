package aula03.debug;

public class Fatorial {

	public static void main(String[] args) {

		int numero = 5;
		int resultado = 1;
		for (int i = numero; i >= 1; i--) {
			resultado *= i;
		}
		System.out.println(resultado);

	}

}
