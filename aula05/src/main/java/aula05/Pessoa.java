package aula05;

import java.util.Date;

public class Pessoa {

	// Atributos
	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	private Long cpf;
	private Boolean ativo;

	// Construtor da classe
	// Público, sem parâmetros
	// Chamado quando a classe é instanciada
	// É como um método, mas sem retorno.
	public Pessoa() {
		System.out.println("Criou um objeto de pessoa.");
	}

	public Pessoa(String nome, String sobrenome) {
		System.out.println("Contrutor 2");
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.ativo = true;
	}

	public Pessoa(String nome, String sobrenome, Date dataNascimento, Long cpf, Boolean ativo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.ativo = ativo;
	}

	public String getNomeCompleto() {
		return nome + " " + sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}
