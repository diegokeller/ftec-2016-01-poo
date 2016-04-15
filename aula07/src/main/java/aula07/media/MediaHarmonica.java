package aula07.media;

public class MediaHarmonica extends Media {

	public MediaHarmonica(Float n1, Float n2, Float n3) {
		super(n1, n2, n3);
	}

	@Override
	public void calcular() {
		System.out.println(3 / ((1 / n1) + (1 / n2) + (1 / n3)));
	}

}
