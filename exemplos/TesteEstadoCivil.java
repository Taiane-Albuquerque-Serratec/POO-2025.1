package org.serratec.exemplos;

public class TesteEstadoCivil {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Marciel", 100000.);
		pessoa.setEstadoCivil(EstadoCivil.SOLTEIRO);
		
		System.out.println("Seu atual Estado Civil: VIUVO('V'), SOLTEIRO('S'), CASADO('C'), DIVORCIADO('D'): " + "\n" + pessoa.getEstadoCivil().getSigla());
		System.out.println(pessoa.getEstadoCivil().ordinal());
		
		for (EstadoCivil ec : EstadoCivil.values()) {
			System.out.println(ec);
		}
	}
}