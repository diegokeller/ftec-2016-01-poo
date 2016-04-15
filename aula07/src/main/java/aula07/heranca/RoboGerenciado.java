package aula07.heranca;

public class RoboGerenciado extends Robo {

	private int contadorPecas;

	public RoboGerenciado(String fabrica) {
		super(fabrica);
		contadorPecas = 0;
	}

	public void reportarProducao() {
		System.out.println("Produziu " + contadorPecas + " peças.");
	}

	@Override
	public void soldar(String peca1, String peca2) {
		super.soldar(peca1, peca2);
		contadorPecas++;
	}

}
