package aula05;

public class MainEscopoVariavel {

	private static String nome;

	public static int somar(int a, int b) {
		int soma = a + b;
		System.out.println(nome);
		return soma;
	}

	public static void main(String[] args) {
		// Não compila pois a variável soma foi declarada em
		// outro método (escopo).
		// System.out.println(soma);
		nome = "João";
		somar(5, 6);
		int somar = somar(4, 7);
		System.out.println(somar);

		int idade = 17;
		if (idade < 18) {
			boolean maiorDeIdade = false;
		}
		// Também não compila pelo mesmo motivo
		// System.out.println(maiorDeIdade);
	}
}
