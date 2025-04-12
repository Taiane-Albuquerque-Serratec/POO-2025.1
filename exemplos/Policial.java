package org.serratec.exemplos;
//final na classe não pode ter filhos/herança
public final class Policial {
	protected String nome;
	//protected final String LOTACAO = "BRASILIA";
	protected final String LOTACAO;
		
	public Policial(String nome, String lotacao) {
		this.nome = nome;
		LOTACAO = lotacao;
	}

	//NÃO PODE SER SOBRESCRITO
	public final void imprimir() {
		System.out.println("Dados do Policial: ");

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLOTACAO() {
		return LOTACAO;
	}
}