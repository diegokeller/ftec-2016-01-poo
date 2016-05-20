package aula12.mortal_combat;

import java.util.Scanner;

public class Menu {

	private Scanner leitor;

	public Menu() {
		leitor = new Scanner(System.in);
	}

	public void mostrarMenu() {
		System.out.println("Escolhe seu personagem:");
		System.out.println("1 - SubZero");
		System.out.println("2 - Raiden");
		System.out.println("3 - Scorpion");
		System.out.println("4 - Smoke");
		System.out.println("5 - Reptile");

		int opcao = leitor.nextInt();
		Personagem p = null;
		switch (opcao) {
		case 1:
			p = new SubZero();
			break;

		case 2:
			p = new Raiden();
			break;

		case 3:
			p = new Scorpion();
			break;

		case 4:
			p = new Smoke();
			break;

		case 5:
			p = new Reptile();
			break;

		}
		
		while(true){
			String comando = leitor.nextLine();
			if(comando.equals("a")){
				p.andar();
			}
			if(comando.equals("p")){
				p.pular();
			}
			if(comando.equals("f")){
				p.fatality();
			}
			if(comando.equals("s")){
				System.exit(0);
			}
			if(comando.equals("e")){
				if(p instanceof Invisivel){
					Invisivel i = (Invisivel)p;
					i.ficarInvisivel();
				}
				if(p instanceof Teletransporte){
					((Teletransporte) p).teletransportar();
				}
			}
		}
	}

	public static void main(String[] args) {
		new Menu().mostrarMenu();
	}
}
