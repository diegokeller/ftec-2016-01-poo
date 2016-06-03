package aula14.mapa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import aula14.comparacao.Produto;

public class MainMapa {

	public static void main(String[] args) {

		// Cria um mapa
		Map<Integer, Produto> produtos = 
				new HashMap<Integer, Produto>();
		
		// Adiciona um elemento
		produtos.put(123, new Produto("Uva", 14.3f));
		produtos.put(124, new Produto("Pêssego", 14.3f));
		System.out.println(produtos);
		
		// Obtém um elemento
		Produto p = produtos.get(123);
		System.out.println(p);
		
		////// 
		
		// Verifica se tem uma chave
		System.out.println(produtos.containsKey(124));
		
		// Obtém uma lista dos valores
		Collection<Produto> produtosLista = produtos.values();
		System.out.println(produtosLista);
		
		// Percorrer as chaves e valores do mapa
		Set<Entry<Integer, Produto>> conjuntoDeProduto = 
				produtos.entrySet();
		for (Entry<Integer, Produto> entrada : conjuntoDeProduto) {
			Integer codigo = entrada.getKey();
			System.out.println(codigo);
			Produto produto = entrada.getValue();
			System.out.println(produto);
		}

	}

}
