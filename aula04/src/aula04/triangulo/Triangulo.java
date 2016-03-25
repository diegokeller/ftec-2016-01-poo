package aula04.triangulo;

public class Triangulo {

	/**
	 * Atributos
	 */
	int lado1;
	int lado2;
	int lado3;

	/**
	 * Funções
	 */

	public void classificar() {

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Equilatero");
		} else {
			if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("Isóceles");
			} else {
				System.out.println("Escaleno");
			}
		}

	}

}
