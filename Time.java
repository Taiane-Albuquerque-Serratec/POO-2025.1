package aula8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	public class Time {
	private String nome;
	private List<Atleta> atletas;
	
	public Time(String nome) {
		super();
		this.nome = nome;
		atletas = new ArrayList<> ();	
	}

@Override
	public String toString() {
		return "Time: " + nome + ", Atletas:  " + atletas;
	}

//qualquer lista não pode ter set!!!!! 
//modifica os valores passados, aí ñ faz sentido
	public String getNome() {
		return nome;
	}

	public List<Atleta> getAtletas() {
		return atletas;
	}
	public void adicionarAtleta(Atleta... atletas) {
		this.atletas.addAll(Arrays.asList(atletas));
	}
}
