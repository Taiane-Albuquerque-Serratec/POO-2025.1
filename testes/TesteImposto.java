package org.serratec.testes;

import org.serratec.exemplos.Empresa;
import org.serratec.exemplos.Pessoa;

public class TesteImposto {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Sandro", 25000.);
		Empresa empresa = new Empresa("XPTO Ltda", 100000.);

		System.out.println("Total a Pagar - Pessoa Fisica: " + pessoa.calcularIr());
		System.out.println("Total a Pagar - Empresa PJ: " + empresa.calcularIr());
		System.out.println("Total a Pagar - ICMS: " + empresa.calcularICMS());
	}

}
