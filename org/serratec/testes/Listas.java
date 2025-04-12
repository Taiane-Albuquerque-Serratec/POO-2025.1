package org.serratec.testes;

import java.util.Arrays;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		String [] carros = {"Sandero", "HB20", "Versa", "KA", "Corsa" };
		//List<String> listaCarros = List.of(carros); //quando uso assim, ele retorna a lista que criei
		List<String> listaCarros = Arrays.asList(carros);
		//qnd faco assim, retorna a lista modificada, com o que eu adicionar, como abaixo
		//listaCarros.set(0, "Fusca");
		carros[1] = "Fox";
		
		for (String carro : listaCarros) {
			System.out.println(carro);
		}
				
	}

}
