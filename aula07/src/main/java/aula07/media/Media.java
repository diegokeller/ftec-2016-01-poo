package aula07.media;

public abstract class Media {

	protected Float n1;
	protected Float n2;
	protected Float n3;
	protected Float resultado;

	public Media(Float n1, Float n2, Float n3) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}

	public Float getN1() {
		return n1;
	}

	public void setN1(Float n1) {
		this.n1 = n1;
	}

	public Float getN2() {
		return n2;
	}

	public void setN2(Float n2) {
		this.n2 = n2;
	}

	public Float getN3() {
		return n3;
	}

	public void setN3(Float n3) {
		this.n3 = n3;
	}

	public Float getResultado() {
		return resultado;
	}

	public void setResultado(Float resultado) {
		this.resultado = resultado;
	}

	public void calcular() {
		System.out.println("Qual média?????");
	}
}
