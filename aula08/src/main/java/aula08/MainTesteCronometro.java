package aula08;

public class MainTesteCronometro {

	public static void main(String[] args)
			throws InterruptedException {

		Cronometro c = new Cronometro();
		c.iniciar();

		// Espera 2 segundos
		Thread.sleep(2000);

		c.parar();

		System.out.println(c.getTempoEmSegundos());

	}

}
