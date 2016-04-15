package aula07.abstrato;

public class BoloDeCenoura extends Bolo {

	@Override
	public void ingredientes() {
		System.out.println("Farinha");
		System.out.println("Leite");
		System.out.println("Cenoura ralada");
	}

	@Override
	public void modoDePreparo() {
		System.out.println("Misturar os ingredientes");
		System.out.println("Colocar em uma forma untada");
		System.out.println("Assar em forno médio por 40 minutos");
	}

}
