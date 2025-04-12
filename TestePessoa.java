package exercicios;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
						 
		pessoa1.setNome("Manoel");
		pessoa1.setPeso(67.8);
		pessoa1.setAltura(1.72);
		
		pessoa2.setNome("Ana");
		pessoa2.setPeso(77.8);
		pessoa2.setAltura(1.69);
		
		pessoa3.setNome("Bia");
		pessoa3.setPeso(53.2);
		pessoa3.setAltura(1.70);
		
		System.out.println(pessoa1.getNome() + ", Você está " + pessoa1.resultado());        						 
		System.out.println(pessoa2.getNome() + ", Você está " + pessoa2.resultado()); 
		System.out.println(pessoa3.getNome() + ", Você está " + pessoa3.resultado());  


	}
}