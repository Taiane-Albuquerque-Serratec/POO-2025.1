package aula8;

public class TesteAtleta {

	public static void main(String[] args) {
		
		Time time = new Time("Flamengo");
		
		Atleta a1 = new Atleta("Arrasca", 1.80);
		Atleta a2 = new Atleta("Bh", 1.70);
		Atleta a3 = new Atleta("Gabi", 1.85);
		
		time.adicionarAtleta(a1);
		time.adicionarAtleta(a2);
		time.adicionarAtleta(a3);
		
		System.out.println(time.getAtletas()); //atletas e dados

	}

}
