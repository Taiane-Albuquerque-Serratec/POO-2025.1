package aula8;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

public class Gato extends AnimalDeEstimacao{
	private String cor;
//	private List<Gato> gatos;


	public Gato(String nome, Integer idade, String cor) {
		super(nome, idade);
		this.cor = cor;
//		gatos = new ArrayList<> ();	

	}
	@Override
	public String toString() {
		return "\n Cor: " + cor;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
//	public List<Gato> getGatos() {
//		return gatos;
//	}
//	public void adicionarCachorro(Gato... gatos) {
//		this.gatos.addAll(Arrays.asList(gatos));
//	}
//	
		
	@Override
	public void imprimir() {
		super.imprimir();
	}
	
	
}
