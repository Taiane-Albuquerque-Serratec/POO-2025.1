package exercicios;

public class Funcionario {
	private String nome;
	private double salario;
//static existe para a classe, entao dá pra relacionar com tudo e não somente com o objeto
//se parece com a variavel global
	private static int contador = 0;
	
	//Construtor
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		contador++;
	
	}

	public String getNome() {
		return nome;

	}

	public double getSalario() {
		return salario;
	}

//static existe para a classe, entao dá pra relacionar com tudo e não somente com o objeto
	public static int getContador() {
		return contador;
	}
}