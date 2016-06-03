package aula14.comparacao;

import java.util.LinkedList;
import java.util.List;

public class MainComparacao {

	public static void main(String[] args) {

		Produto p1 = new Produto("Banana", 12.3f);
		Produto p2 = new Produto("Banana", 12.3f);

		List<Produto> produtos = new LinkedList<Produto>();
		produtos.add(p1);
		
		System.out.println(produtos.contains(p2));
		
		System.out.println(produtos);
	}

}
