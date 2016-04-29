package aula08;

import java.text.NumberFormat;

public class SAMAE {

	private float custoDoLitro;
	private float taxaBasica;

	// Construtor
	public SAMAE() {
		custoDoLitro = 0.01f;
		taxaBasica = 23.00f;
	}

	public void fazerLeituraEmitirConta(Casa casa) {

		float consumo = casa.getTotalConsumo();
		System.out
				.println("Foram consumidos " + consumo + " litros.");

		float totalConta = taxaBasica + (consumo * custoDoLitro);

		// Formatador de números
		NumberFormat nf = NumberFormat.getCurrencyInstance();

		System.out
				.println("Total da conta: " + nf.format(totalConta));

		casa.zerarMedidor();
	}

}
