package aula16.execoes;

import java.io.File;
import java.io.IOException;

public class MainTratandoExcecoes {

	public static void main(String[] args) {

		File arquivo = new File("c:\teste.txt");
		try {
			// Vamos tentar fazer isso
			arquivo.createNewFile();
			System.out.println("Arquivo criado com sucesso.");
		} catch (IOException erro) {
			// Se der erro vamos caputar aqui
			System.out.println("Erro ao criar o arquivo: " 
					+ erro.getMessage()
					+ ". Verifique o caminho e as permissões.");
			erro.printStackTrace();
		} finally {
			// Independente se deu erro ou não, faça isso
			System.out.println("Obrigado por usar o sistema.");
		}
		
	}
}
