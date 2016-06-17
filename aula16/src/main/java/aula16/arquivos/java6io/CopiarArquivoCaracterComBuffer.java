package aula16.arquivos.java6io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiarArquivoCaracterComBuffer {

	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		BufferedWriter outputStream = null;

		try {
			inputStream = 
					new BufferedReader(
							new FileReader("teste.txt"));
			outputStream = 
					new BufferedWriter(
							new FileWriter("teste_caracter.txt"));

			String linha;
			while ((linha = inputStream.readLine()) != null) {
				outputStream.write(linha + "\n");
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

	}

}
