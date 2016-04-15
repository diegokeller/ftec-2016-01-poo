package aula07.abstrato;

// Classe abstrata
// Não existe na vida real
public abstract class Bolo {

	// Método abstrato
	// Alguem vai ter que dizer os ingredientes depois
	public abstract void ingredientes();

	public abstract void modoDePreparo();

	// Método concreto
	// Sempre funciona assim, nessa ordem
	public void preparar() {
		ingredientes();
		modoDePreparo();
	}

}
