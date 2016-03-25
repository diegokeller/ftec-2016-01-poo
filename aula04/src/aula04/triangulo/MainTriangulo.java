package aula04.triangulo;

public class MainTriangulo {

	public static void main(String[] args) {

		// Declara um triangulo
		Triangulo t1 = new Triangulo();

		// Define os valores dos lados
		t1.lado1 = 4;
		t1.lado2 = 5;
		t1.lado3 = 3;

		// Classifica o triangulo
		t1.classificar();

		// Cria outro triangulo
		Triangulo t2 = new Triangulo();
		t2.lado1 = 5;
		t2.lado2 = 5;
		t2.lado3 = 5;
		t2.classificar();
	}

}
