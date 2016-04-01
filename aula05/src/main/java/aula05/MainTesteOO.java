package aula05;

import java.util.Date;

public class MainTesteOO {

	public static void main(String[] args) {

		// Tipos primitivos
		int a = 5;
		int b = 5;
		if (a == b) {
			System.out.println("São iguais");
		}

		Pessoa joao = new Pessoa();
		joao.setNome("João");
		joao.setSobrenome("da Silva");
		joao.setDataNascimento(new Date());
		joao.setAtivo(true);
		joao.setCpf(123456l);

		Pessoa maria = new Pessoa("Maria", "de Souza");
		maria.setDataNascimento(new Date());
		maria.setCpf(789456l);

		// Temos duas variáveis diferentes
		// O conteúdo pode ser igual
		// Mas cada uma referencia um objeto diferente
		Pessoa cleusa = new Pessoa("Cleusa", "de Farias", new Date(),
				123l, true);
		Pessoa cleusa2 = new Pessoa("Cleusa", "de Farias", new Date(),
				123l, true);
		if (cleusa == cleusa2) {
			System.out.println("Cleusas iguais");
		} else {
			System.out.println("Cleusas diferentes");
		}

		// Aqui estamos fazendo com que a variável cleusa2 aponte para o
		// mesmo endereço de memória da variável cleusa.
		// Com isso temos duas variáveis apontando para o mesmo objeto.
		cleusa2 = cleusa;

		// O operador "==" compara os endereços de memória das variáveis
		if (cleusa == cleusa2) {
			System.out.println("Cleusas iguais");
		} else {
			System.out.println("Cleusas diferentes");
		}

		cleusa.setSobrenome("da Silva");
		System.out.println(cleusa2.getNomeCompleto());

		// Chama o GC
		// Conheça mas NUNCA USE!!!!!!
		System.gc();

		// Passagem por valor
		int numero = 5;
		System.out.println(numero);
		incrementar(numero);
		System.out.println(numero);

		// Passagem por referência
		System.out.println(joao.getAtivo());
		inativarPessoa(joao);
		System.out.println(joao.getAtivo());

		// Comparação de objetos
		String nome1 = new String("João");
		String nome2 = new String("João");
		System.out.println("Nomes == " + (nome1 == nome2));
		System.out.println("Nomes equals " + nome1.equals(nome2));

		// Testando o equals da pessoa
		Pessoa p1 = new Pessoa("João", "Silveira", new Date(), 123l,
				true);
		Pessoa p2 = new Pessoa("João", "Silveira", new Date(), 123l,
				true);
		System.out.println("Pessoas iguais " + p1.equals(p2));

		System.out.println(p1);
		System.out.println(p1.toString());

	}

	public static void incrementar(int valor) {
		valor++;
	}

	public static void inativarPessoa(Pessoa pessoa) {
		pessoa.setAtivo(false);
	}

}
