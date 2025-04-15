package aula8;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private String email;
	private Integer idade;

	public Aluno(String nome, String email, Integer idade) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "\nDados do(a)Aluno(a): " + "\nNome: " + nome + " \nEmail: " + email + " \nIdade: " + idade +"\n";
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(email, other.email);
	}
////source - delegate methods - seta idade - select compateTo
//	public int compareTo(Integer anotherInteger) {
//		return idade.compareTo(anotherInteger);
//	} esse é quando uso HashSet na main

	@Override
	public int compareTo(Aluno outro) {
		//listar em ordem alfabética
		return nome.compareTo(outro.nome);
	}
	

}
