package aula04.conta_bancaria;

public class ContaBancaria {

	// Atributos
	private float saldo;

	// Ações

	public void depositar(float valor) {
		saldo += valor;
	}

	public void sacar(float valor) {
		saldo -= valor;
	}

	public void consultarSaldo() {
		System.out.println(saldo);
	}

	public float getSaldo() {
		return saldo;
	}

}
