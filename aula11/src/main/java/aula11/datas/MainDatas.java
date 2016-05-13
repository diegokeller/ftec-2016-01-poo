package aula11.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class MainDatas {

	public static void main(String[] args) {

		// Data
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate ontem = LocalDate.now().minusDays(1);
		System.out.println(ontem);

		LocalDate mesQueVem = LocalDate.now().plusMonths(1);
		System.out.println(mesQueVem);

		LocalDate natal = LocalDate.of(2016, Month.DECEMBER, 25);
		System.out.println(natal);

		// Data e hora
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);

		// Formatar
		DateTimeFormatter formatador = DateTimeFormatter
				.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(agora));

		// Converter de string
		LocalDateTime data = LocalDateTime
				.parse("25/12/2000 21:14:16", formatador);
		System.out.println(data);
	}

}
