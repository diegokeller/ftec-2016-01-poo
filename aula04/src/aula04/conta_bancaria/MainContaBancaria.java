package aula04.conta_bancaria;

public class MainContaBancaria {

	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria();
		c1.depositar(100);
		c1.sacar(40);
		c1.consultarSaldo();
	}

}
