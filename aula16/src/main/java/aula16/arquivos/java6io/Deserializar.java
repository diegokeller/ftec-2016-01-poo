package aula16.arquivos.java6io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Deserializar {

	public static void main(String[] args) {
		
		// Lista de pessoas
		List<Pessoa> pessoas;
		
		// Fluxo de entrada de objetos (serializar)
		ObjectInputStream in = null;
		
		try {
			// Arquivo de origem (com buffer)
			BufferedInputStream buffer =
					new BufferedInputStream(
							new FileInputStream("pessoas.txt"));
			
			// Inicializa a entrada
			in = new ObjectInputStream(buffer);
			
			// Serializa / Escreve
			try {
				pessoas = (List<Pessoa>) in.readObject();
				System.out.println(pessoas);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Fecha o arquivo
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
