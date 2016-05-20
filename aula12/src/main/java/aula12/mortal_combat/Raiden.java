package aula12.mortal_combat;

public class Raiden extends Personagem
	implements Teletransporte {

	public void teletransportar() {
		System.out.println("Rainden teletransportando...");
	}

	@Override
	public void fatality() {
		System.out.println("Fatality Rainden...");
	}

}
