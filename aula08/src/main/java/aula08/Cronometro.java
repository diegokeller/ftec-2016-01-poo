package aula08;

/**
 * Classe de cronometro que conta o tempo decorrido entre o inicio e o fim.
 * 
 * @author Diego
 *
 */
public class Cronometro {

	private long inicio;
	private long fim;

	protected void iniciar() {
		inicio = System.currentTimeMillis();
	}

	protected void parar() {
		fim = System.currentTimeMillis();
	}

	protected void zerar() {
		inicio = 0;
		fim = 0;
	}

	protected long getTempoEmSegundos() {
		return (fim - inicio) / 1000; // Converte milisegundos para segundos
	}

}
