package org.serratec.aula;

import java.util.Scanner;

public class TesteAluno {
	public static void main(String[] args) {
//		Aluno[] a = {new Aluno("A", 1, "B"), new Aluno("Cler", 2, "Cler@email")};
		Aluno[] alunos = new Aluno[3];

		Scanner sc = new Scanner(System.in);

			System.out.println("*****************Seja bem-vindo(a)!***********************\n");
			System.out.println("Digite as informações dos alunos: \n");
			
		for (int i = 0; i < alunos.length; i++) {

			System.out.print("Nome do aluno: ");
			String nome = sc.nextLine();

			System.out.print("Idade do aluno: ");
			int idade = sc.nextInt();
			sc.nextLine(); //pula linha ou pode see sc.next

			System.out.print("Email do aluno: ");
			String email = sc.nextLine();

			System.out.println("Aluno cadastrado com sucesso:");

			alunos[i] = new Aluno(nome, idade, email);
		}

		sc.close();

		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i]);
		}
			System.out.println("****************************************");
		for (Aluno a : alunos) {
			System.out.println(a);
		}
	}
}