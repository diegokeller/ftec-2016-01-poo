package aula11.prova;

import java.util.Arrays;

public class Playlist {

	private Musica[] musicas;
	private Video[] videos;

	private int proximaMusica;
	private int proximoVideo;

	private String nome;
	private String descricao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Playlist [nome=" + nome + ", descricao=" + descricao
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + Arrays.hashCode(musicas);
		result = prime * result
				+ ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + proximaMusica;
		result = prime * result + proximoVideo;
		result = prime * result + Arrays.hashCode(videos);
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
		Playlist other = (Playlist) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (!Arrays.equals(musicas, other.musicas))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (proximaMusica != other.proximaMusica)
			return false;
		if (proximoVideo != other.proximoVideo)
			return false;
		if (!Arrays.equals(videos, other.videos))
			return false;
		return true;
	}

	public Playlist(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;

		// Inicialização das variáveis
		musicas = new Musica[10];
		videos = new Video[10];
		proximaMusica = 0;
		proximoVideo = 0;
	}

	public void adicionarMusica(Musica musica) {
		musicas[proximaMusica] = musica;
		proximaMusica++;
	}

	public void adicionarVideo(Video video) {
		videos[proximoVideo] = video;
		proximoVideo++;
	}

	public Integer getTotalPlaylist() {
		Integer total = 0;
		for (int i = 0; i < musicas.length; i++) {
			Musica musica = musicas[i];
			if (musica != null) {
				total += musica.getDuracao();
			}
		}
		for (int i = 0; i < videos.length; i++) {
			Video video = videos[i];
			if (video != null) {
				total += video.getDuracao();
			}
		}
		return total;
	}

	public void mostrar() {
		System.out.println("================");
		System.out.println("Playlist");
		System.out.println("================");
		System.out.println(proximaMusica + " músicas");
		System.out.println(this.musicas);
		System.out.println(proximoVideo + " videos");
		System.out.println(this.videos);
		System.out.println("Duração total: " + getTotalPlaylist());
	}

}
