package aula12.mortal_combat;

public abstract class Personagem {

	public void andar(){
		System.out.println("Andando");
	}

	public void pular(){
		System.out.println("Pulando");
	}
	
	public abstract void fatality();
	
}
