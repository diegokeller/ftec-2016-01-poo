package aula06.jogo_com_oo;

import java.util.Scanner;

public class InterfaceConsole {

	public static void main(String[] args) {

		Carro c1 = new Carro("Vermelho", 0);
		InterpretadorDeComandos comandos = new InterpretadorDeComandos();

		Scanner leitor = new Scanner(System.in);

		while (true) {
			String comando = leitor.nextLine();
			boolean continuar = comandos.interpretarComando(c1,
					comando);
			System.out.println(c1);
			if (!continuar) {
				break;
			}
		}
	}

}
