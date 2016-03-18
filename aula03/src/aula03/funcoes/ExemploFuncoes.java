package aula03.funcoes;

public class ExemploFuncoes {

	public static void main(String[] args) {
		dizerOla("João");

		// Comentário
		System.out.println(somarDoisNumeros(5, 9));

		/*
		 */
		System.out.println(superSoma(5f, 9f));
		System.out.println(OutrasFuncoes.multiplicarDoisNumeros(4, 6));
	}

	/**
	 * Um método muito receptivo que cumprimenta a pessoa.
	 * 
	 * @param nome
	 *            Nome do abençoado
	 */
	public static void dizerOla(String nome) {
		System.out.println("Olá " + nome);
	}

	public static int somarDoisNumeros(int n1, int n2) {
		int resultado = n1 + n2;
		System.out.println("Somando inteiros");
		return resultado;
	}

	/**
	 * Use o superSoma()
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	@Deprecated
	public static float somarDoisNumeros(float n1, float n2) {
		float resultado = n1 + n2;
		System.out.println("Somandos float");
		return resultado;
	}

	public static float superSoma(float n1, float n2) {
		float resultado = n1 + n2;
		System.out.println("Somandos float");
		return resultado;
	}

}
