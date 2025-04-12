package Grupo8;

import java.util.Scanner;

public class TesteVendedor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int op =0;
               
        Fixo fx1 = new Fixo("Joana", "123456798", 2000., 0.03);
        Fixo fx2 = new Fixo("Maria", "987654322", 2000., 0.03);
        //FreeLancer fl1 = new FreeLancer("Jose", "6549517532", 5, 250.);
        //FreeLancer fl2 = new FreeLancer("Joca", "3579514654", 10, 150.);
              
        do{
            MenuVendas.exibirOpcoes(fx1, fx2);
            op = sc.nextInt();
            System.out.println("---------------------------------------");
            
            if (op != 3){
                MenuVendas.calcSalario(fx1,fx2,op,sc);
            }
            
        }while(op != 3);
        
        MenuVendas.exibirSalarios(fx1, fx2);
        MenuVendas.exibirTotalVendas(Vendedor.getTotalVendas());

        sc.close();
    }
}