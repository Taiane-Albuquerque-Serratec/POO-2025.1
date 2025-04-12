package org.serratec.aula;

public class Aluno {
	private String nome;
	private Integer idade;
	private String email;
	
	
	public Aluno(String nome, Integer idade, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Nome Aluno: " + nome + ", Idade: " + idade + ", Email: " + email;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}
	
	public String getEmail() {
		return email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
