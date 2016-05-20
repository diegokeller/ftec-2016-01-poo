package aula12.mortal_combat;

public class Scorpion extends Personagem implements Teletransporte {

	public void teletransportar() {
		System.out.println("Scorpion teletransportando.");
	}

	@Override
	public void fatality() {
		System.out.println("Scorpion dando fatality.");
	}

}
