package aula15.comparacao;

public class Cliente implements Comparable<Cliente> {

	// Atributos, construtor, get e set, toString 
	
	private String nome;
	private Integer prioridade;

	public Cliente(String nome, Integer prioridade) {
		super();
		this.nome = nome;
		this.prioridade = prioridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", prioridade=" + prioridade
				+ "]";
	}

	public int compareTo(Cliente outroCliente) {
		System.out.println("Comparando " + this.getNome() + 
				" com " + outroCliente.getNome());
		
		// Deve retornar um número inteiro
		// -1 se o this deve vir antes
		// 0 se são iguais
		// 1 se o this deve vir depois
		if(this.prioridade < outroCliente.getPrioridade()){
			return -1;
		} else {
			if (this.prioridade > outroCliente.getPrioridade()) {
				return 1;
			} else {
				return this.nome.compareTo(outroCliente.getNome());
			}
		}
		
	}

}
