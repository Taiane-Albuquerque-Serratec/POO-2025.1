package AulaPratica1;

public class Caneta2 {

		public String modelo;
		public String cor;
		private float ponta;
		protected int carga;
		private boolean tampada;
		
		public void status() {
		
			System.out.println("Qual é a cor da caneta? " + this.cor);
			System.out.println("Está tampada? " + this.tampada);
			System.out.println("Qual o tipo de ponta? " + this.ponta);
			System.out.println("Quantos porcento de carga há na caneta? %" + this.carga);
			System.out.println("Qual é o modelo da caneta? " + this.modelo);
		
//pra chamar o objeto, uso this.nomedele, e aí ele substitui this por quem chamou, ex c1.cor
		}
//metodos - método tem () sempre!! e chamo ele no main

		public void rabiscar() {		
			if (this.tampada == true) {
				System.out.println("\nCaneta tampada! Não posso rabiscar... \n");			
			}else {
				System.out.println("\nCaneta destampada! Estou rabiscando... \n"); 
			}
		}
			
		public void tampar() {
			this.tampada = true;
		}
		public void destampar() {
			this.tampada = false;
		}
}