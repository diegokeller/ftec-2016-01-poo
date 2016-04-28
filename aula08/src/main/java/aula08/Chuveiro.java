package aula08;

public class Chuveiro extends Cronometro {

	private int vazao = 12;

	public void abrir() {
		iniciar();
		System.out.println("Chuveiro aberto.");
	}

	public void fechar() {
		parar();
		System.out.println("Chuveiro fechado.");
	}

	public long getConsumo() {
		return getTempoEmSegundos() * vazao;
	}

}
