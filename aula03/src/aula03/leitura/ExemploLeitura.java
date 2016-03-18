package aula03.leitura;

import java.util.Scanner;

public class ExemploLeitura {

	public static void main(String[] args) {

		// TODO: Sabia que você pode fazer tarefas por comentário?
		// FIXME: Pelo amor de Deus!!!!! Corrija

		Scanner leitor = new Scanner(System.in);

		// Ler um número
		System.out.println("Digite sua idade:");
		int numero = leitor.nextInt();
		leitor.nextLine();

		// Ler uma string
		System.out.println("Digite seu nome:");
		String nome = leitor.nextLine();

		System.out.println(nome);
		System.out.println(numero);

		// Fecha o leitor
		leitor.close();
	}

}
