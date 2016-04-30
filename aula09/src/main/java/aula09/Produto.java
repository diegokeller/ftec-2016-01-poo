package aula09;

public class Produto {

	private String nome;
	private Float preco;
	private Integer quantidadeEmEstoque;

	public Produto(String nome, Float preco,
			Integer quantidadeEmEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	@Override
	// Mostrar os dados na console
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco
				+ ", quantidadeEmEstoque=" + quantidadeEmEstoque
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	// Comparar produtos pelo nome
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
