package aula06.jogo_com_oo;

/**
 * Essa classe de carro esportivo vai herdar da classe Carro. Ou seja, ela vai
 * ter todos os atributos e métodos que um carro tem, mas algumas coisas que
 * vamos adicionar nessa classe (potência e arrancar).
 * 
 * @author Diego
 *
 */
public class CarroEsportivo extends Carro { // A herança é feita pelo comando
											// extends. Uma classe só pode
											// herdar de uma única classe.

	private Float potencia;

	public CarroEsportivo(String cor, Integer velocidade,
			Float potencia) {
		super(cor, velocidade);
		this.potencia = potencia;
	}

	public void arrancar() {
		velocidade = 100;
	}

	public Float getPotencia() {
		return potencia;
	}

	public void setPotencia(Float potencia) {
		this.potencia = potencia;
	}

	/**
	 * Esse é um exemplo de sobrescrita de método. Pois estamos substituindo
	 * completamente o método toString()
	 */
	@Override
	public String toString() {
		return "CarroEsportivo [potencia=" + potencia + ", cor=" + cor
				+ ", velocidade=" + velocidade + "]";
	}

	/**
	 * Aqui temos um exemplo de sobrecarga de método, pois está sendo feito o
	 * que a classe carro já fazia, mais uma coisa, que é aumentar mais 9 na
	 * velociade.
	 */
	@Override
	public void acelerar() {
		super.acelerar();
		velocidade += 9;
	}

}
