package aula8;

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class TesteAluno {

	public static void main(String[] args) {
		Set<Aluno> alunos = new TreeSet<>();
		alunos.add(new Aluno("Antônio César", "A@gmail.com", 42));
		alunos.add(new Aluno("Bruna Kain", "Ana@gmail.com", 38));
		alunos.add(new Aluno("Amanda Love", "Am@gmail.com", 21));
		alunos.add(new Aluno("Kammy Dutra", "Kammy@gmail.com", 56));
		alunos.add(new Aluno("Kammy Dutra", "Kammy@gmail.com", 56));
		//aqui tem dois iguais
		//fiz um source generate hashcode e equals
		//aí escolhi para ordenar por nome
		//o HashSet não permite repetidos, então ele ñ mostra no scan 
		for (Aluno a : alunos) {
			System.out.println(a);
		}
	}

}
