package aula07.media;

public class MediaAritimetica extends Media {

	public MediaAritimetica(Float n1, Float n2, Float n3) {
		super(n1, n2, n3);
	}

	@Override
	public void calcular() {
		System.out.println((n1 + n2 + n3) / 3);
	}

}
