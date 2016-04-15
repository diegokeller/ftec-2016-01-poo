package aula07.heranca;

public class Robo {

	protected String fabrica;

	public Robo(String fabrica) {
		super();
		this.fabrica = fabrica;
	}

	public String getFabrica() {
		return fabrica;
	}

	public void setFabrica(String fabrica) {
		this.fabrica = fabrica;
	}

	public void soldar(String peca1, String peca2) {
		EstoqueDeSolda.consumir();
		System.out.println("Soldando " + peca1 + " com " + peca2
				+ " na fábrica " + fabrica);
	}

}
