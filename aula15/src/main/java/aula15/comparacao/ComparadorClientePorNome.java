package aula15.comparacao;

import java.util.Comparator;

/**
 * Comparador de clientes por nome
 */
public class ComparadorClientePorNome implements Comparator<Cliente> {

	public int compare(Cliente o1, Cliente o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
