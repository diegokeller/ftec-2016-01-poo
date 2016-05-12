package aula11.prova;

public class Musica extends Midia {

	private String artista;

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	@Override
	public String toString() {
		return "Musica [artista=" + artista + ", nome=" + nome
				+ ", duracao=" + duracao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((artista == null) ? 0 : artista.hashCode());
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
		Musica other = (Musica) obj;
		if (artista == null) {
			if (other.artista != null)
				return false;
		} else if (!artista.equals(other.artista))
			return false;
		return true;
	}

	public Musica(String nome, Integer duracao, String artista) {
		super(nome, duracao);
		this.artista = artista;
	}

}
