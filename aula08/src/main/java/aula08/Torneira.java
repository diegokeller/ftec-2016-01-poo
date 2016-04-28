package aula08;

public class Torneira extends Cronometro {

	private int vazao = 5;

	public void abrir() {
		iniciar();
		System.out.println("Torneira aberta.");
	}

	public void fechar() {
		parar();
		System.out.println("Torneira fechada.");
	}

	public float getConsumo() {
		return getTempoEmSegundos() * (vazao / 60f);
	}

}
