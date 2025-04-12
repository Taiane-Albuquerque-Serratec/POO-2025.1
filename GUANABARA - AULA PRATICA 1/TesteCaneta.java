package AulaPratica1;

public class TesteCaneta {
// dos 2 tipos de caneta
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.cor = "Azul";
		c1.carga = 70;
		c1.modelo = "Bic Cristal";
		c1.ponta = 0.7f; 
		c1.status();
		
		c1.tampar();
		//aqui não, pq tampa, aí chamo o rabiscar e dá erro
		c1.rabiscar();
		
		
//(0.7f) f representa real, pro codigo entender, pq senao 
//ele pega so o numero antes do ponto.

		Caneta c2 = new Caneta();
		
		c2.cor = "Verde";
		c2.carga = 65;
		c2.modelo = "Compactor 1.0";
		c2.ponta = 0.5f;
		c2.status();
		
		c2.destampar();
		//aqui rabisca pq destampa, ai chamo o rabiscar e dá certo
		c2.rabiscar();
		
	}

}
