package aula14.cojuntos;

import java.util.HashSet;
import java.util.Set;

import aula14.comparacao.Produto;

class MainConjuntos {

	public static void main(String[] args) {
		
		// Cria um conjunto
		Set<Produto> produtos = new HashSet<Produto>();
		
		Produto banana = new Produto("Banana", 123.4f);
		Produto banana2 = new Produto("Banana", 123.4f);
		
		produtos.add(banana);
		System.out.println(produtos);

		produtos.add(banana2);
		System.out.println(produtos);
		
		Produto abacaxi = new Produto("Abacaxi", 456.7f);
		produtos.add(abacaxi);
		System.out.println(produtos);
		
		
		
	}
	
}
