package aula16.arquivos.java6io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Serializar {

	public static void main(String[] args) {
		
		// Lista de pessoas
		List<Pessoa> pessoas = 
				new LinkedList<Pessoa>();
		pessoas.add(new Pessoa("João", true, new Date()));
		pessoas.add(new Pessoa("Maria", false, new Date()));
		pessoas.add(new Pessoa("Carlos", false, new Date()));
		
		// Fluxo de saída de objetos (serializar)
		ObjectOutputStream out = null;
		
		try {
			// Arquivo de destino (com buffer)
			BufferedOutputStream buffer =
					new BufferedOutputStream(
							new FileOutputStream("pessoas.txt"));
			
			// Inicializa a saída
			out = new ObjectOutputStream(buffer);
			
			// Serializa / Escreve
			out.writeObject(pessoas);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Fecha o arquivo
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
