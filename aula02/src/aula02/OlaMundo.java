package aula02;

import java.text.NumberFormat;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class OlaMundo {

	public static void main(String[] args) {

		// Para escrever na console
		// Print
		System.out.println("Olá Mundo!");

		// Declaração de variáveis
		int numero1;
		boolean ativo = false; // declara e inicializa
		char estadoCivil = 'C'; // char usa aspas simples

		// Float - Numero de ponto flutuante
		// Colocar o sufixo "f" ao lado do valor
		float salario = 1500.60f;

		// Por padrão número com casas decimais são double
		double lucro = 25456.65;

		// Mais de uma variável em uma linha
		int idade1, idade2, idade3;
		int quantidade1 = 5, quantidade2 = 6;

		// Strings
		String nome = "João da Silva";

		// Operadores
		int valor1 = 10;
		int valor2 = 20;

		// Matemáticos
		int valor3 = valor1 + valor2;
		valor3 = valor1 - valor2;
		valor3 = valor1 * valor2;
		valor3 = valor1 / valor2;
		System.out.println(valor3); // int / int = int, por isso fica zero

		float valor4 = 15f;
		float valor5 = valor1 / valor4;

		System.out.println(valor5);

		// Resto
		int valor6 = 11 % 3;
		System.out.println(valor6);

		// Atribuição com matemático
		valor6 += 5;
		System.out.println(valor6);
		valor6 = valor6 + 2;
		System.out.println(valor6);

		// Incremento e decremento
		System.out.println(valor6++);
		System.out.println(++valor6);

		// Comandos

		// IF
		if (valor6 >= 10) {
			System.out.println("Maior que 10");
		}

		// IF / ELSE
		valor6 = 9;
		if (valor6 >= 10) {
			System.out.println("Maior que 10");
		} else {
			System.out.println("Menor que 10");
		}

		// Operadores lógicos E (&&) e OU (||)
		if (valor6 <= 10 && (valor3 < 10 || valor3 > 20 || true)) {
			System.out.println("Algum valor");
		}

		// Laço - For
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// Laço - While
		int j = 0;
		while (j <= 5) {
			System.out.println(j);
			j++;
		}

		do {

		} while (false);

		// Comparação (igual e diferente)
		if (valor1 == valor2 || valor2 != valor3) {

		}

		switch (valor1) {
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		default:
			System.out.println("Outro");
			break;
		}
		
		String nomePessoa = "João";
		System.out.println("Olá " + nomePessoa + "! Seja Bem Vindo!");

	}

}
