package aula16.execoes;

import java.io.File;
import java.io.IOException;

public class MainTesteExcecao {

	public static void main(String[] args) throws IOException {
		criarArquivo();
	}

	private static void criarArquivo() throws IOException {
		criar();
	}

	private static void criar() throws IOException {
		salvar();
	}

	private static void salvar() throws IOException {
		salvarEmDisco();
	}

	private static void salvarEmDisco() throws IOException {
		File arquivo = new File("c:\\teste.txt");
		arquivo.createNewFile();
	}

}
