package aula11.prova;

public abstract class Midia {

	protected String nome;
	protected Integer duracao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Midia [nome=" + nome + ", duracao=" + duracao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((duracao == null) ? 0 : duracao.hashCode());
		result = prime * result
				+ ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Midia other = (Midia) obj;
		if (duracao == null) {
			if (other.duracao != null)
				return false;
		} else if (!duracao.equals(other.duracao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public Midia(String nome, Integer duracao) {
		super();
		this.nome = nome;
		this.duracao = duracao;
	}

}
