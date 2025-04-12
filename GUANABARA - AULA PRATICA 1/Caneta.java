package AulaPratica1;

public class Caneta {

		public String modelo;
		public String cor;
		public float ponta;
		public int carga;
		public boolean tampada;
		
		void status() {
		
			System.out.println("Qual é a cor da caneta? " + this.cor);
			System.out.println("Está tampada? " + this.tampada);
			System.out.println("Qual o tipo de ponta? " + this.ponta);
			System.out.println("Quantos porcento de carga há na caneta? %" + this.carga);
			System.out.println("Qual é o modelo da caneta? " + this.modelo);
		
//pra chamar o objeto, uso this.nomedele, e aí ele substitui this por quem chamou, ex c1.cor
		}
//metodos - método tem () sempre!! e chamo ele no main

		void rabiscar() {		
			if (this.tampada == true) {
				System.out.println("\nCaneta tampada! Não posso rabiscar... \n");			
			}else {
				System.out.println("\nCaneta destampada! Estou rabiscando... \n"); 
			}
		}
			
		void tampar() {
			this.tampada = true;
		}
		void destampar() {
			this.tampada = false;
		}
}