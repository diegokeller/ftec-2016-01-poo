package aula16.arquivos.java6io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarArquivo {

	public static void main(String[] args) {

		// Cria o fluxo de entrada
		FileInputStream in = null;
		
		// Cria o fluxo de saída
		FileOutputStream out = null;

		try {
			in = new FileInputStream("teste.txt");
			out = new FileOutputStream("teste_copia.txt");
			int c;

			// Lê o arquivo byte a byte
			while ((c = in.read()) != -1) {
				out.write(c); // Escreve o arquivo byte a byte
			}
			
			System.out.println("Arquivo copiado com sucesso!");
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		} catch (IOException e) {
			System.out.println("Erro ao ler ou gravar no arquivo.");
		} finally {
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out != null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
