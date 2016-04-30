package aula09;

public class Carrinho {

	private Cliente cliente;
	private Item[] itens;

	// Construtor
	public Carrinho() {
		itens = new Item[10];
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// Retorna a primeira posição livre do vetor
	private int getProximaPosicaoLivre() {

		// Percorre o vetor
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] == null) {
				return i;
			}
		}

		// Não tem posição livre
		return -1;

	}

	public void incluir(Produto produto) {

		// TODO: Ao incluir 2 vezes o mesmo produto, aumentar a qtd
		// ao inves de adicionar produto duplicado

		int posicao = getProximaPosicaoLivre();
		if (posicao < 0) {
			System.out.println("Não tem mais espaço.");
			return;
		}

		// Cria o item com quantidade 1
		Item item = new Item(produto, 1);

		itens[posicao] = item;
	}

	public void excluir(int posicao) {

		if ((posicao - 1) > itens.length) {
			System.out.println("Posição inválida: " + posicao);
			return;
		}

		if (posicao < 0) {
			System.out.println("Posição inválida: " + posicao);
			return;
		}

		itens[posicao] = null;

	}

	public Float getTotalCarrinho() {
		Float total = 0f;
		for (int i = 0; i < itens.length; i++) {
			Item item = itens[i];
			if (item != null) {
				total += item.getTotal();
			}
		}
		return total;
	}

	public void emitirRelatorio() {
		System.out.println("========================");
		System.out.println("Carrinho de Compras");
		System.out.println("========================");
		for (int i = 0; i < itens.length; i++) {

			Item item = itens[i];
			if (item == null) {
				System.out.println(i + " : VAZIO");
			} else {
				System.out.println(i + " : " + item);
			}

		}
		System.out.println("TOTAL: " + getTotalCarrinho());
	}

}
