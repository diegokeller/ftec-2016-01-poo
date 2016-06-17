package aula16.execoes;

public class ContaBancaria {

	private Float saldo = 0f;
	
	public ContaBancaria(Float saldo){
		this.saldo = saldo;
	}
	
	public void sacar(Float valor) throws SaldoInsuficienteException{
		if(valor > this.saldo){
			throw new SaldoInsuficienteException(saldo);
		}
		this.saldo -= valor;
		System.out.println("Efetuado o saque de " + valor);
	}
}
