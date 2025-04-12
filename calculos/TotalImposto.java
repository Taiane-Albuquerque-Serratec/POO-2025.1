package org.serratec.calculos;

import org.serratec.exemplos.Tributos;

public class TotalImposto {
	private Double totalGeral = 0.0;

	public Double getTotalGeral() {
		return totalGeral;
	}
	
	public void CalcularTotalGeralTributos(Tributos tributos) {
		totalGeral += tributos.calcularICMS();
		totalGeral += tributos.calcularIr();
		System.out.println("Total Geral ICMS: " + tributos.calcularICMS());
		System.out.println("Total Geral IR: " + tributos.calcularIr());
	}
}