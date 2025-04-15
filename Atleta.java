package aula8;

public class Atleta {
	private String nome;
	private Double altura;
	public Atleta(String nome, Double altura) {
		super();
		this.nome = nome;
		this.altura = altura;
		
	}
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nAltura: " + altura;
	}
	public String getNome() {
		return nome;
	}
	public Double getAltura() {
		return altura;
	}
}