package aula11.bloqueando_heranca;

public class ContratatoLocacao 
			extends Contrato {

	// Não pode sobrescrever
	// esse método pois ele 
	// é final na classe do Contrato
	@Override
	public Float getPreco() {
		return super.getPreco();
	}
	
	@Override
	public void mostrar() {
		System.out.println("AAA");
	}
	
}
