package aula06.carro_sem_oo;

import java.util.Scanner;

public class JogoSemOO {

	public static void main(String[] args) {

		String cor;
		Integer velocidade = 0;

		Scanner leitor = new Scanner(System.in);

		while (true) {
			String comando = leitor.nextLine();
			if (comando.equals("A")) {
				velocidade++;
			}
			if (comando.equals("F")) {
				velocidade--;
			}
			if (comando.equals("X")) {
				break;
			}
			System.out.println("Velocidade: " + velocidade);
		}
	}

}
