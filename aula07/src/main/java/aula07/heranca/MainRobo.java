package aula07.heranca;

public class MainRobo {

	public static void main(String[] args) {

		EstoqueDeSolda e = new EstoqueDeSolda();
		EstoqueDeSolda e2 = new EstoqueDeSolda();

		EstoqueDeSolda.consultar();

		Robo robo1 = new Robo("Unidade 1");
		robo1.soldar("Placa 1", "Parafuso 2");

		RoboGerenciado robo2 = new RoboGerenciado("Unidade 1");
		robo2.soldar("Placa 1", "Parafuso 2");
		robo2.reportarProducao();

		RoboOnline robo3 = new RoboOnline("Unidade 1");
		robo3.soldar("Placa 1", "Parafuso 2");

		EstoqueDeSolda.consultar();
	}

}
