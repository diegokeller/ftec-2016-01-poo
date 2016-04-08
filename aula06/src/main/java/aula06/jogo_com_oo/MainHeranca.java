package aula06.jogo_com_oo;

public class MainHeranca {

	public static void main(String[] args) {

		Carro uno = new Carro("Verde", 0);
		CarroEsportivo camaro = new CarroEsportivo("Amarelo", 0, 4f);

		uno.acelerar();
		System.out.println(uno);
		// uno.arrancar(); // Por que não funciona?

		camaro.arrancar();
		System.out.println(camaro);

		camaro.acelerar();
		System.out.println(camaro);

	}

}
