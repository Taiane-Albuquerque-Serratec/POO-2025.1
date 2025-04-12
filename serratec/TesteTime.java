package br.org.serratec;

public class TesteTime {
    public static void main(String[] args) {
        Time time = new Time("Vasco", "Carille", new Atleta[11]);
        
        Atleta atleta1 = new Atleta("Cr7", 38);
        Atleta atleta2 = new Atleta("Neymar Jr", 39);
        Atleta atleta3 = new Atleta("Gabb", 34);
        Atleta atleta4 = new Atleta("Bh", 27);
        Atleta atleta5 = new Atleta("Arrasca", 23);
        Atleta atleta6 = new Atleta("Leo", 32);
        Atleta atleta7 = new Atleta("Paquetá", 28);
        Atleta atleta8 = new Atleta("Vini Jr", 35);
        Atleta atleta9 = new Atleta("Gerson", 30);
        Atleta atleta10 = new Atleta("R10", 25);
        Atleta atleta11 = new Atleta("Fenômeno", 22);


        time.adicionarAtleta(atleta1);
        time.adicionarAtleta(atleta2);
        time.adicionarAtleta(atleta3);
        time.adicionarAtleta(atleta4);
        time.adicionarAtleta(atleta5);
        time.adicionarAtleta(atleta6);
        time.adicionarAtleta(atleta7);
        time.adicionarAtleta(atleta8);
        time.adicionarAtleta(atleta9);
        time.adicionarAtleta(atleta10);
        time.adicionarAtleta(atleta11);

        
        //imprime 3, porque não complementou as onze posições do vetor
        time.imprimirElenco();
        
        
        //exemplo de como imprimir dados
        String[]nomes = {"\nAna","\nCarlos"};
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
