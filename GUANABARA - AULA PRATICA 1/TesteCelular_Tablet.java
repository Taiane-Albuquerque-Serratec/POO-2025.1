package AulaPratica1;

public class TesteCelular_Tablet {

	public static void main(String[] args) {
		
		Celular c1 =  new Celular();
		
		c1.modelo = "Samsung J5";
		c1.cor = "Roxo";
		c1.bateria = 100f;
		c1.informacoesTecnicas = "Memória Ram: 16Gb - Memória interna: 128GB";
		c1.valor = 2998f;
		c1.nomeNovoProprietario = "Lhya Antunes";
		c1.cpfDadosProprietário = "123.456.789-00";
		c1.contatoDadosProprietario = "(24)90000-1111";
		
		c1.statusAparelho(); //dados do aparelho
				
		c1.carga(); //checagem da bateria
		
		c1.venda(); //checagem se vendido ou não e mostra valor de venda
		
		c1.entrega(); //chega liberação de entrega, com dependencia na carga de bateria
		
		c1.statusProprietario(); //se vendido, mostra dados do novo dono
	
		Celular c2 = new Celular();
		
		c2.modelo = "Motorola G30";
		c2.cor = "Branco Perolado";
		c2.bateria = 15f;
		c2.informacoesTecnicas = "Memória Ram: 64Gb - Memória interna: 1TB";
		c2.valor = 6990f;
		c2.nomeNovoProprietario = "Taiane Albuquerque";
		c2.cpfDadosProprietário = "400.500.600-00";
		c2.contatoDadosProprietario = "(24)80009-1213";
		
		c2.statusAparelho();//dados aparelho
		
	
		c2.venda(); //retorna vendido
		c2.entrega(); 
		
		c2.statusProprietario();
		
		Tablet t1 = new Tablet();
		t1.modelo = "Galaxy 10";
		t1.cor = "Preto e Prata Perolado";
		t1.bateria = 100f;
		t1.informacoesTecnicas = "Memória Ram: 32Gb - Memória interna: 128Gb";
		t1.valor = 3129f;
		t1.nomeNovoProprietario = "Fabiana Souza";
		t1.cpfDadosProprietário = "900.800.700-60";
		t1.contatoDadosProprietario = "(24)88884-88884";
		
		t1.statusAparelho();//dados aparelho
		
		t1.carga(); //carga ideal ou não
		
		t1.entrega();
		
		t1.statusProprietario();
	}

}
