package aula16.execoes;

public class SaldoInsuficienteException extends Exception {
	
	private Float saldoAtual;
	
	public SaldoInsuficienteException(Float saldoAtual){
		super("Saldo insuficiente para completar a operação.");
		this.saldoAtual = saldoAtual;
	}

	public Float getSaldoAtual() {
		return saldoAtual;
	}
}
