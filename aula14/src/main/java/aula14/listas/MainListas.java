package aula14.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainListas {

	public static void main(String[] args) {

		// Criar uma lista de Strings
		List<String> nomes = new LinkedList<String>();
		
		// Adicionar um elemento
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("José");
		
		// Verificar se um elemento está na lista
		System.out.println(nomes.contains("Maria"));
		
		// Obter a posição de um dos elementos
		System.out.println(nomes.indexOf("Maria"));
		
		// Obter a quantidade de elementos na lista
		System.out.println(nomes.size());
		
		//////
		
		// Adicionar um elemento em uma posição 
		nomes.add(0, "Carla");
		System.out.println(nomes);
		
		// Trocar o valor de uma posição
		nomes.set(0, "Cecília");
		System.out.println(nomes);

		// Remover um elemento
		nomes.remove("João");
		System.out.println(nomes);
		
		// Remover pela posição
		nomes.remove(1);
		System.out.println(nomes);
		
		//// 
		
		// Verificar se a lista está vazia
		System.out.println(nomes.isEmpty());
		
		// Limpar a lista
		nomes.clear();
		System.out.println(nomes);

		nomes.add("Nome 1");
		nomes.add("Nome 2");
		nomes.add("Nome 3");
		nomes.add("Nome 4");
		nomes.addAll(Arrays.asList(new String[]{"Nome 5", "Nome 6"}));
		
		// Percorrer
		for (String string : nomes) {
			System.out.println(string);
		}
		
		
	}

}
