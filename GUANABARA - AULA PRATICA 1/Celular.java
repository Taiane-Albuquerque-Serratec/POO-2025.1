package AulaPratica1;

public class Celular {
	public String modelo;
	public String cor;
	public String informacoesTecnicas;
	public String nomeNovoProprietario;
	public String cpfDadosProprietário;
	public String contatoDadosProprietario;
	public float bateria;
	public float valor;
	public boolean statusVendido;
	public boolean statusCarregado;

	void statusAparelho() {
		System.out.println("===========================Dados do aparelho===================================\n");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor disponível: " + this.cor);
		System.out.println("Status da bateria: %" + this.bateria);
		System.out.println("Valor de venda: R$" + this.valor);
		System.out.println("Informações técnicas do aparelho: " + this.informacoesTecnicas + "\n");
		System.out.println("===============================================================================\n");

	}

	void statusProprietario() {
		if (this.statusVendido) {
			System.out.println(
					"\n" + "======================Dados do Novo Proprietário===============================\n");
			System.out.println("Novo proprietário do aparelho celular: " + this.nomeNovoProprietario);
			System.out.println("CPF do Adquirente do aparelho vendido: " + this.cpfDadosProprietário);
			System.out.println("Contato do Adquirente do aparelho vendido: " + this.contatoDadosProprietario + "\n");
			System.out.println("===============================================================================\n");
		} else {
			System.out.println("\nCelular ainda disponível para venda.");
		}
		System.out.println("===============================================================================\n");
	}

	void carga() {
	    if (this.bateria >= 100) {
	        this.statusCarregado = true;
	        System.out.println("Carregamento ideal realizado. Status da bateria em %" + bateria + " Pronto para ser vendido!" + "\n");
	    } else {
	        this.statusCarregado = false;
	        System.out.println("Carregamento não completado. Status da bateria em %" + bateria + " Carregamento ideal deverá ser concluído antes da venda!");
	    }
	}

	void venda() {
		if (!this.statusVendido) {
			this.statusVendido = true;
			System.out.println("Celular vendido com sucesso, pelo valor de: R$" + valor + ".\n");
		} else {
			System.out.println("Celular ainda disponível para venda!\n");

		}
	}

	void entrega() {
		if (this.statusVendido) {
			if (this.statusCarregado) {
				System.out.println(
						"Celular liberado para a entrega ao novo proprietário, " + this.nomeNovoProprietario + ".");
			} else {
				System.out.println(
						"Entrega permitida à " + this.nomeNovoProprietario + " após ser concluída 100% da carga.");
			}

		} else {
			System.out.println("Entrega não permitida. O celular ainda não foi vendido.");
		}
	}
	
	
	//ESSES METODOS SÓ USUARIA SE PRECISASSE MUDAR MANUALMENTE OU CRIAR UM MENU
// Ñ VOU UTLIZAR. DEPOIS FAÇO MAIS TESTES COM ELES
//	void carregado() {
//		this.statusCarregado = true;
//		}
//		
//
//	void descarregado() {
//		this.statusCarregado = false;
//		}
//		
//
//	void vendido() {
//		this.statusVendido = true;
//	}
//
//	void naoVendido() {
//		this.statusVendido = false;
//	}
//
//	void entregue() {
//		this.statusVendido = true;
//	}
//
//	void naoEntregue() {
//		this.statusVendido = false;
//	}

}
