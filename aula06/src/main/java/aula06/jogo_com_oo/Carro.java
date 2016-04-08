package aula06.jogo_com_oo;

public class Carro {

	protected String cor;
	protected Integer velocidade;

	public Carro(String cor, Integer velocidade) {
		super();
		this.cor = cor;
		this.velocidade = velocidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getVelocidade() {
		return velocidade;
	}

	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", velocidade=" + velocidade
				+ "]";
	}

	public void acelerar() {
		velocidade++;
	}

	public void freiar() {
		velocidade--;
	}
}
