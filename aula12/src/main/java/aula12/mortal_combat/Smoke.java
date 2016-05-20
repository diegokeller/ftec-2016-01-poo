package aula12.mortal_combat;

public class Smoke extends Personagem implements Invisivel{

	public void ficarInvisivel() {
		System.out.println("Smoke ficando invisível.");
	}

	@Override
	public void fatality() {
		System.out.println("Smoke dando fatality.");
	}

}
