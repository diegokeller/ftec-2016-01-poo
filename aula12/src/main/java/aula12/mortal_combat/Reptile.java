package aula12.mortal_combat;

public class Reptile extends Personagem implements Invisivel{

	public void ficarInvisivel() {
		System.out.println("Reptile ficando invisível.");
	}

	@Override
	public void fatality() {
		System.out.println("Reptile dando fatality.");
	}

}
