package Grupo8;

public class Vendedor {

    //Atributos
    protected String nome;
    protected String cpf;
    private static double totalVendas; //Acres

    //Construtor
    public Vendedor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //toString
    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static double getTotalVendas() {
        return totalVendas;
    }

    public static void setTotalVendas(double venda) { //acres
        Vendedor.totalVendas += venda;
    }

    
    


}