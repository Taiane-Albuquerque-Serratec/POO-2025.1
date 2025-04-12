package AulaPratica1;

public class TesteCaneta2 {
	public static void main(String[] args) {
		Caneta2 c1 = new Caneta2();
		
		c1.modelo = "Bic Cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f;
		c1.carga = 80;
		//c1.tampada = false;
		c1.destampar();
		c1.status();
		c1.rabiscar();
	
// consegui utlizar c1.carga, porque o teste está dentro de uma Classe , que usa a classe Caneta2 
//mas, ñ consegui usar ponta, porque ela tá privada
//não consegui usar o metodo rabiscar, porque o privei, aí só consigo usar na classe que ele tá
//mudei para publico e coloquei tampada como true, dai rabiscar rodou.		
//mudei para true, retornou tampa fechada, não rabiscando.
		
//OS METODOS PUBLICOS E PROTECTED PODEM SER USADOS NA MAIN, MAS, OS PRIVATE NÃO!!

//coloquei a variavel tampada como private
//e a unica forma de tamopar e destampar, foi mudando a visibilidade de tampada e destampada para public
//fazendo isso, chamei o metodo destampar e aí ele rabiscou, pq está publico lá agr.
//tampar é publico, mas tampada é privada
// só que tampar e destampar estão dentro da mesma classe de tampada
//desse modo, acesso o metodo e consigo usar
	}

}
