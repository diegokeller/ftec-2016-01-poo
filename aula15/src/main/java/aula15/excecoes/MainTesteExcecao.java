package aula15.excecoes;

import java.io.File;
import java.io.IOException;

public class MainTesteExcecao {

	public static void main(String[] args) {
		
		// Criação de um arquivo
		File arquivo = new File("c:\\teste.txt");
		try {
			arquivo.createNewFile();
			System.out.println("Arquivo criado com sucesso.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao criar o arquivo. "
					+ "Verifique o caminho informado e se "
					+ "você tem permissão.");
		}

	}

}
