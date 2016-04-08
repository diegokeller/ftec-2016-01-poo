package aula06.jogo_com_oo;

public class InterpretadorDeComandos {

	public boolean interpretarComando(Carro carro, String comando) {
		if (comando.equals("A")) {
			carro.acelerar();
		}
		if (comando.equals("F")) {
			carro.freiar();
		}
		if (comando.equals("X")) {
			return false;
		}
		return true;
	}

}
