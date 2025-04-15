package aula8;

public class Cliente {
	private Integer id;
	private String nome;
	private String telefone;
	private Integer idade;
	
	public Cliente(Integer id, String nome, Integer idade, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente Id: " + id + "\nNome: " + nome + " \nIdade: " + idade + ", \nTelefone: " + telefone;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public Integer getIdade() {
		return idade;
	}
	
	
}
