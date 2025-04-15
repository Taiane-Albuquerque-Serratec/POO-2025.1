package aula8;

import java.util.HashSet;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {

	public static void main(String[] args) {
		// Não permite elemento iguais
		//Não mantém a ordem
		//Set<String> times = new HashSet<>();
		// Não permite elemento iguais
		//Mantém a ordem de inserção
		//Set<String> times = new LinkedHashSet<>();
		// Não permite elemento iguais
		//Ordena os elementos
		Set<String> times = new TreeSet<>();

		times.add("Flamengo");
		times.add("Bangu");
		times.add("Atlético MG");
		times.add("Palmeiras");
		times.add("Botafogo");
		times.add("Flamengo");

		for (String time : times) {
			System.out.println(time);
		}
		//HashSet ignora os repetidos
			Set<Integer> numeros = new HashSet<>();
			numeros.add(20);
			numeros.add(20);
			numeros.add(30);
			numeros.add(40);
			System.out.println(numeros);
		}
	}