package aula07.heranca;

public class EstoqueDeSolda {

	public static int quantidade = 100;

	public EstoqueDeSolda() {
	}

	public static void consumir() {
		quantidade--;
	}

	public static void consultar() {
		System.out.println(
				"Quantidade de solda em estoque: " + quantidade);
	}

}
