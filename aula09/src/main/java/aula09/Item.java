package aula09;

public class Item {

	private Produto produto;
	private Integer quantidade;

	// Construtor
	public Item(Produto produto, Integer quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Float getTotal() {
		return produto.getPreco() * quantidade;
	}

	@Override
	public String toString() {
		return "Item [produto=" + produto + ", quantidade="
				+ quantidade + "]";
	}

}
