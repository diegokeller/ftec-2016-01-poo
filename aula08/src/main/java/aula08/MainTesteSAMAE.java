package aula08;

public class MainTesteSAMAE {

	public static void main(String[] args)
			throws InterruptedException {

		SAMAE samae = new SAMAE();

		Casa casa = new Casa();

		casa.abrirChuveiro();
		casa.abrirTorneira();

		Thread.sleep(2000);

		casa.fecharChuveiro();
		casa.fecharTorneira();

		samae.fazerLeituraEmitirConta(casa);
	}

}
