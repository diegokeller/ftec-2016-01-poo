package aula15.comparacao;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MainOrdenacao {

	public static void main(String[] args) {

		List<Cliente> clientes = new LinkedList<Cliente>();
		clientes.add(new Cliente("João", 1));
		clientes.add(new Cliente("Maria", 5));
		clientes.add(new Cliente("Abel", 2));
		clientes.add(new Cliente("Carlos", 0));
		clientes.add(new Cliente("Joana", 2));
		
		// Faz a ordenação por prioridade e nome;
		Collections.sort(clientes);
		System.out.println(clientes);
		
		// Faz ordenação só pelo nome
		ComparadorClientePorNome comparador = 
				new ComparadorClientePorNome();
		Collections.sort(clientes, comparador);
		System.out.println(clientes);

		// Usando classe anônima - ordenar só por prioridade
		Collections.sort(clientes, new Comparator<Cliente>() {
			public int compare(Cliente o1, Cliente o2) {
				return o1.getPrioridade().compareTo(o2.getPrioridade());
			}
		});
		System.out.println(clientes);
		
		// Usando Java 8 - Comparar o nome - Expressões Lambda
		Collections.sort(clientes, (o1, o2) -> {
			return o1.getNome().compareTo(o2.getNome());
		});
		System.out.println(clientes);
		
		// Mostrar na tela
		System.out.println(clientes);
		
	}

}
