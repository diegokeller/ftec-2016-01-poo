package aula11.bloqueando_heranca;

public class Contrato {

	public final Float getPreco() {
		return 0f;
	}

	public void mostrar() {
		System.out.println(
				"Mostrando " + 
				"contrato...");
	}

}
