package aula11.prova;

public class MainPlaylist {

	public static void main(String[] args) {

		Playlist lista = new Playlist("Tarde acústica",
				"Música boa...");
		lista.adicionarMusica(new Musica("AAA", 5, "BBB"));
		lista.adicionarVideo(new Video("CCC", 7, "CCC"));
		lista.mostrar();

	}

}
