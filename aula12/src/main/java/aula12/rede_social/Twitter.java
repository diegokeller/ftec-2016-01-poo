package aula12.rede_social;

public class Twitter implements Compartilhavel {
	
	public void tuitar(){
		System.out.println("Tuitando no Twitter.");
	}

	public void compartilhar() {
		tuitar();
	}

}
