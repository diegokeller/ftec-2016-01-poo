package aula08;

public class MainTesteCasa {

	public static void main(String[] args)
			throws InterruptedException {

		Casa c = new Casa();

		c.abrirChuveiro();
		c.abrirTorneira();

		Thread.sleep(2000);

		c.fecharChuveiro();
		c.fecharTorneira();

		System.out.println(c.getTotalConsumo());
	}

}
