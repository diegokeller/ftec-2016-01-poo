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

	public Pessoa(String nome, String sobrenome, Date dataNascimento,
			Long cpf, Boolean ativo) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result
				+ ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((sobrenome == null) ? 0 : sobrenome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome
				+ ", dataNascimento=" + dataNascimento + ", cpf="
				+ cpf + ", ativo=" + ativo + "]";
	}

}
