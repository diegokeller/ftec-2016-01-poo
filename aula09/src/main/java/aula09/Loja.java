package aula09;

public class Loja {

	// Lista de produtos da loja
	private Produto[] produtos;

	// Construtor
	public Loja() {
		// Lista de produtos da loja
		produtos = new Produto[10];
	}

	// Verifica se um produto já existe na loja
	private boolean produtoJaExiste(Produto produtoNovo) {
		// Percorre os produtos
		for (Produto produto : produtos) {
			// Compara o nome
			if (produtoNovo.equals(produto)) {
				return true;
			}
		}
		return false;
	}

	// Incluir um produto
	// Não pode ter dois com a mesma nome
	public void incluir(Produto produto) {

		if (produtoJaExiste(produto)) {
			System.out.println("Já existe um produto com esse nome.");
			return;
		}

		int posicao = getProximaPosicaoLivre();
		if (posicao < 0) {
			System.out.println("Não tem mais espaço.");
			return;
		}

		produtos[posicao] = produto;
	}

	public void excluir(int posicao) {

		if ((posicao - 1) > produtos.length) {
			System.out.println("Posição inválida: " + posicao);
			return;
		}

		if (posicao < 0) {
			System.out.println("Posição inválida: " + posicao);
			return;
		}

		produtos[posicao] = null;

	}

	// Retorna a primeira posição livre do vetor
	private int getProximaPosicaoLivre() {

		// Percorre o vetor
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] == null) {
				return i;
			}
		}

		// Não tem posição livre
		return -1;

	}

	public void mostrarProdutos() {

		System.out.println("=============================");
		System.out.println("Produtos da Loja");
		System.out.println("=============================");

		for (int i = 0; i < produtos.length; i++) {
			Produto p = produtos[i];
			if (p == null) {
				System.out.println(i + " : VAZIO");
			} else {
				System.out.println(i + " : " + p.toString());
			}
		}

	}

}
