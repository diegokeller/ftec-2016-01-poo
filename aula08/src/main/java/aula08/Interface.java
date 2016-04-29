package aula08;

import java.util.Scanner;

public class Interface {

	private Scanner leitor;
	private Casa casa;
	private SAMAE samae;

	public Interface() {
		leitor = new Scanner(System.in);
		casa = new Casa();
		samae = new SAMAE();
	}

	public void mostrarMenu() {
		System.out.println("1 - Abrir torneira");
		System.out.println("2 - Fechar torneira");
		System.out.println("3 - Abrir chuveiro");
		System.out.println("4 - Fechar chuveiro");
		System.out.println("5 - Fazer leitura e emitir conta");
		System.out.println("0 - Sair");

		int opcao = leitor.nextInt();
		switch (opcao) {
		case 1:
			casa.abrirTorneira();
			break;
		case 2:
			casa.fecharTorneira();
			break;
		case 3:
			casa.abrirChuveiro();
			break;
		case 4:
			casa.fecharChuveiro();
			break;
		case 5:
			samae.fazerLeituraEmitirConta(casa);
			break;
		case 0:
			System.exit(0);
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}

		mostrarMenu();
	}

}
