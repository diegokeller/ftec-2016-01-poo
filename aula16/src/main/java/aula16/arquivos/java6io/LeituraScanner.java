package aula16.arquivos.java6io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class LeituraScanner {

	public static void main(String[] args)
			throws FileNotFoundException {

		Scanner s = null;

		try {
			s = new Scanner(new BufferedReader(
					new FileReader("numeros.txt")));

			s.useDelimiter(";"); // Separador

			// Localidade
			s.useLocale(new Locale("pt-BR"));

			while (s.hasNext()) { // Enquanto tiver valores
				System.out.println(s.nextInt());
			}

		} catch (Exception e) {
			
		} finally {
			if (s != null) {
				s.close();
			}
		}

	}

}
