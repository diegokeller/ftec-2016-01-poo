package aula15.colecoes;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainColecao {

	public static void main(String[] args) {
		
		// Conjuntos
		Set<String> nomes = new HashSet<String>();
		Set<String> nomes2 = new LinkedHashSet<String>();
		Set<String> nomes3 = new TreeSet<String>();
		
		// Mapas
		Map<String, Float> vendas = new HashMap<String, Float>();
		Map<String, Float> vendas2 = new LinkedHashMap<String, Float>();
		Map<String, Float> vendas3 = new TreeMap<String, Float>();
		
		// Fila FIFO
		Queue<String> fila = new LinkedList<String>();
		
		// Fila duplamente encadeada
		Deque<String> fila2 = new LinkedList<String>();

		// Pilha
		Stack<String> pilha = new Stack<String>();

		

	}

}
