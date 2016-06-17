package aula16.execoes;

public class MainBanco {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria(100f);
		try {
			c1.sacar(10f);
			c1.sacar(100f);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
			System.out.println("Saldo atual: " + e.getSaldoAtual());
		}
		
	}
	
}
