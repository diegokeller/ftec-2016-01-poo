package aula08;

public class MainTesteChuveiro {

	public static void main(String[] args)
			throws InterruptedException {

		Chuveiro c = new Chuveiro();

		c.abrir();

		Thread.sleep(2000);

		c.fechar();

		System.out.println(c.getConsumo());

	}

}
