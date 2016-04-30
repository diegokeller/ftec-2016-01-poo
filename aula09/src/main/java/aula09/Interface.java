package aula09;

import java.util.Scanner;

public class Interface {

	private Scanner leitor;
	private Loja loja;

	// Construtor
	public Interface() {
		leitor = new Scanner(System.in);
		loja = new Loja();
	}

	public void mostrarMenu() {
		System.out.println("0 - Sair");
		System.out.println("1 - Incluir produto na Loja");
		System.out.println("2 - Excluir produto da Loja");
		System.out.println("3 - Mostar produts da Loja");

		int opcao = leitor.nextInt();
		leitor.nextLine();
		switch (opcao) {
		case 0:
			System.exit(0);
			break;
		case 1:
			incluirProdutoLoja();
			break;
		case 2:
			excluirProdutoLoja();
			break;
		case 3:
			loja.mostrarProdutos();
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}
		mostrarMenu();
	}

	private void excluirProdutoLoja() {
		loja.mostrarProdutos();
		System.out.println("Digite a posição que deseja excluir:");
		Integer posicao = leitor.nextInt();
		leitor.nextLine();
		loja.excluir(posicao);
	}

	private void incluirProdutoLoja() {

		System.out.println("Digite o nome:");
		String nome = leitor.nextLine();

		System.out.println("Digite o preço:");
		Float preco = leitor.nextFloat();
		leitor.nextLine(); // Depois de ler um número, sempre ler uma linha

		System.out.println("Digite a quantidade em estoque:");
		Integer quantidadeEmEstoque = leitor.nextInt();
		leitor.nextLine(); // Depois de ler um número, sempre ler uma linha

		Produto produto = new Produto(nome, preco,
				quantidadeEmEstoque);
		loja.incluir(produto);
	}

}
