package aula07.heranca;

public class RoboOnline extends RoboGerenciado {

	public RoboOnline(String fabrica) {
		super(fabrica);
	}

	@Override
	public void soldar(String peca1, String peca2) {
		super.soldar(peca1, peca2);
		reportarProducao();
	}

	@Override
	public void reportarProducao() {
		System.out.println(
				"Chamando serviço web para reportar produção.");
	}

}
