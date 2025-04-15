package aula8;

//import java.util.ArrayList;
//import java.util.List;

public class TesteMetodos {

	public static void main(String[] args) {
		
		  	Cachorro c1 = new Cachorro("Rex ", 3, "Poodle");
	        System.out.println("\nDados Doguinho: " + "\nNome: "  + c1.getNome() +"\nIdade: " + c1.getIdade() + "\nRaça: " + c1.getRaca());

	        Cachorro c2 = new Cachorro("Mel ", 7, "Lulu da Pomerânia");
	        System.out.println("\nDados Doguinho: " + "\nNome: "  + c2.getNome() +"\nIdade: " + c2.getIdade() + "\nRaça: " + c2.getRaca());

	        Cachorro c3 = new Cachorro("Perseu ", 5, "Dálmata");
	        System.out.println("\nDados Doguinho: " + "\nNome: "  + c3.getNome() +"\nIdade: " + c3.getIdade() + "\nRaça: " + c3.getRaca());

	        Gato g1 = new Gato("Mia", 2, "Branco");
	        System.out.println("\nDados Gatinho: " + "\nNome: "  + g1.getNome() +"\nIdade: " + g1.getIdade() + "\nRaça: " + g1.getCor());

	        Gato g2 = new Gato("Léo", 4, "Laranja Caramelo");
	        System.out.println("\nDados Gatinho: " + "\nNome: "  + g2.getNome() +"\nIdade: " + g2.getIdade() + "\nRaça: " + g2.getCor());

	        Gato g3 = new Gato("Bella", 3, "Preto e manchas marrons");
	        System.out.println("\nDados Gatinho: " + "\nNome: "  + g3.getNome() +"\nIdade: " + g3.getIdade() + "\nRaça: " + g3.getCor());


//	        List<Object> dog = new ArrayList<>();
//			dog.add(c1);
//			
	}	
}