package aula8;

public class Loja {
	private String nomeLoja;
	private String animais;


	public Loja(String nomeLoja, String animais) {
		super();
		this.nomeLoja = nomeLoja;
		this.animais = animais;
	}

	@Override
	public String toString() {
		return "Nome Loja :" + nomeLoja + " \nAnimais: ";
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public String getAnimais() {
		return animais;
	}
	
	public void adicionarAnimal(Animal animal) {
		}

	public void listarAnimal() {
	}
	
	public void adotarAnimal(int index) {
	}
	
}