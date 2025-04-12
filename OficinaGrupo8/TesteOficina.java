package OficinaGrupo8;

import java.time.LocalDate;

public class TesteOficina {

    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("José");
        Carro c1 = new Carro("hb20", LocalDate.of(2025, 04, 10), p1, "sedan");
        c1.trocarOleo();
        System.out.println(c1.toString());
        c1.revisao();
        System.out.println(c1.toString());
        
             
        Proprietario p2 = new Proprietario("Marcos");
        Moto m1 = new Moto("Honda Biz", LocalDate.of(2025, 3, 10), m1);
        m1.revisao();
        System.out.println(m1.toString());
        m1.trocarOleo();
        System.out.println(m1.toString());
        m1.lavarVeiculo();
        System.out.println(m1.toString());

    }
}