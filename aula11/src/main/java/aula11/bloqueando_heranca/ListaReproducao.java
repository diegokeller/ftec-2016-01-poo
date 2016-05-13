package aula11.bloqueando_heranca;

public class ListaReproducao {
	
	private String[] musicas;
	
	public static final Integer TAMANHO = 10;
	
	public ListaReproducao() {
		TAMANHO = 11; // atributos constantes não podem ser alteradas
		musicas = new String[TAMANHO];
	}

}
