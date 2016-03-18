package aula03.vetor_matriz;

public class Vetor {

	public static void main(String[] args) {

		// Um vetor de inteiros de 5 posições
		// Todas as posições estão vazias
		int[] valores = new int[5];

		// Vetor já inicializado
		// Com 6 posições
		int[] idades = new int[] { 18, 16, 25, 65, 12, 30 };

		// Matrizes
		// 10 x 5 = 50 posições
		int[][] dados = new int[10][5];

		// Mais dimensões
		// 27 posições ao todo
		int cubo[][][] = new int[3][3][3];

		// Ler e escrever no vetor
		// Primeira posição é a zero
		System.out.println(idades[0]);
		idades[0] = 100;
		System.out.println(idades[0]);

		// Verificar tamanho do vetor
		System.out.println(idades.length);

		// Percorre o vetor
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
