package aula08;

public class Casa {

	private Chuveiro chuveiro;
	private Torneira torneira;

	private float totalConsumo;

	/**
	 * Construtor da casa. Inicializar variáveis.
	 */
	public Casa() {
		chuveiro = new Chuveiro();
		torneira = new Torneira();
		totalConsumo = 0;
	}

	public void abrirTorneira() {
		torneira.abrir();
	}

	public void fecharTorneira() {
		torneira.fechar();
		float consumo = torneira.getConsumo();
		System.out
				.println("Torneira consumiu " + consumo + " litros.");
		this.totalConsumo += consumo;
	}

	public void abrirChuveiro() {
		chuveiro.abrir();
	}

	public void fecharChuveiro() {
		chuveiro.fechar();
		float consumo = chuveiro.getConsumo();
		System.out
				.println("Chuveiro consumiu " + consumo + " litros.");
		this.totalConsumo += consumo;
	}

	public float getTotalConsumo() {
		return totalConsumo;
	}
}
