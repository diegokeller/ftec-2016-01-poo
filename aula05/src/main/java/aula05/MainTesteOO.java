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
	}

}
