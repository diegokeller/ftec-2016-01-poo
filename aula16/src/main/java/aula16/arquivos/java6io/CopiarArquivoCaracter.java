package aula16.arquivos.java6io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiarArquivoCaracter {

	public static void main(String[] args) throws IOException {

		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			inputStream = 
					new FileReader("teste.txt");
			outputStream = 
					new FileWriter("teste_caracter.txt");

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
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
