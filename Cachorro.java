package aula8;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

public class Cachorro extends AnimalDeEstimacao{
	private String raca;
//	private List<Cachorro> cachorros;
	
	public Cachorro(String nome, Integer idade, String raca) {
		super(nome, idade);
		this.raca = raca;
//		cachorros = new ArrayList<> ();	
	}
	
	@Override
	public String toString() {
		return "\n Raça: " + raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
//	public List<Cachorro> getCachorros() {
//		return cachorros;
//	}
//	public void adicionarCachorro(Cachorro... cachorros) {
//		this.cachorros.addAll(Arrays.asList(cachorros));
//	}
	
	@Override
	public void imprimir() {
		super.imprimir();
	}
	
}
