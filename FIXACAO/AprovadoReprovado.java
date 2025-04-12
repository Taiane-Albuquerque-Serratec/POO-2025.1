package FIXACAO;

public class AprovadoReprovado {

	public static void main(String[] args) {
		double nota1 = 5;
		double nota2 = 8;	
		double media = ((nota1 + nota2)/2);
		
		if(media >= 7) {
			System.out.println("Aluno(a) aprovado(a)!");
		}else{
			System.out.println("Aluno(a) reprovado(a)!");
		}
	}
}