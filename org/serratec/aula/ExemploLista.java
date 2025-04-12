package org.serratec.aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploLista {
//metodos de LISTA 
	public static void main(String[] args) {
		List<String> times = new ArrayList<String>() ;
		times.add("Flamengo");
		times.add("Palmeiras");
		times.add("Internacional");
		System.out.println(times.size());
		
		times.set(3, "Atlético Pr");
		
		System.out.println("A lista têm Flamengo?" + (times.contains("Flamengo")?"Sim":"Não"));
		System.out.println("A lista está vazia?" + (times.isEmpty()?"Sim":"Não"));
		Collections.sort(times);
		Collections.shuffle(times);
		
		for (String time : times) {
			System.out.println(time);
		}
		
		Aluno a1 = new Aluno("Adriana", 33, "a@outlook.com");
		Aluno a2 = new Aluno("Adrian", 22, "ad@outlook.com");
		Aluno a3 = new Aluno("Camila", 21, "cami@outlook.com");
		List<Aluno> alunos = Arrays.asList(a1, a2); //arrays aceita valor nulo
		alunos.add(a3); //depois de criada a lista, o arrays ñ aceita nada, então dá erro
		alunos.set(0, a3);
		
		for(Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println("************OF*************");
		List<Aluno> alunosOf = List.of(a1, a2); //of ñ aceita nulo
	}
		}
