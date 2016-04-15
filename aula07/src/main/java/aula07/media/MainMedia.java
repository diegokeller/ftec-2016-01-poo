package aula07.media;

public class MainMedia {

	public static void main(String[] args) {

		// Media media = new Media(5f, 3f, 4f);
		MediaAritimetica mediaAritimetica = new MediaAritimetica(5f,
				3f, 4f);
		MediaHarmonica mediaHarmonica = new MediaHarmonica(5f, 3f,
				4f);

		// media.calcular();
		mediaAritimetica.calcular();
		mediaHarmonica.calcular();

	}

}
