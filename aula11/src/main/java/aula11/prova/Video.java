package aula11.prova;

public class Video extends Midia {

	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public String toString() {
		return "Video [diretor=" + diretor + ", nome=" + nome
				+ ", duracao=" + duracao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((diretor == null) ? 0 : diretor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		if (diretor == null) {
			if (other.diretor != null)
				return false;
		} else if (!diretor.equals(other.diretor))
			return false;
		return true;
	}

	public Video(String nome, Integer duracao, String diretor) {
		super(nome, duracao);
		this.diretor = diretor;
	}

}
