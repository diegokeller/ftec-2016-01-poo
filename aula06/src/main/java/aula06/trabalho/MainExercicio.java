package aula06.trabalho;

import java.util.Scanner;

public class MainExercicio {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		String nome = leitor.nextLine();

		System.out.println("Digite o CPF:");
		Long cpf = leitor.nextLong();
		leitor.nextLine();

		Pessoa p1 = new Pessoa(cpf, nome);

		System.out.println("Digite seu nome:");
		String nome2 = leitor.nextLine();

		System.out.println("Digite o CPF:");
		Long cpf2 = leitor.nextLong();
		leitor.nextLine();

		Pessoa p2 = new Pessoa(cpf2, nome2);

		System.out.println(p1);
		System.out.println(p2.toString());

		// Comparando as pessoas
		if (p1.equals(p2)) {
			System.out.println("Pessoas iguais. Não pode trocar.");
		} else {
			System.out.println("Pessoas diferentes. Pode trocar.");
		}
	}

}
