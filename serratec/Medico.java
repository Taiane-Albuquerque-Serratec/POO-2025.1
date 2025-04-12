package br.org.serratec;
    //variaveis
public class Medico {
    protected String crm;
    protected String nome;
    protected Double salario;

    //construtor
    public Medico(String crm, String nome, Double salario) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
    }
    //polimorfismo sobrescrita
    @Override
    public String toString() {
        return "crm:" + crm + ", nome:" + nome + ", salario:" + salario;
    }
    //getters
    public String getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Double calcularSalario() {
        return salario = salario + salario * 1.05;
    }

    // polimorfismo Overload sobrecarga
    public Double calcularSalario(Double valor) {
        return salario = salario + salario * valor/100;
    }

}



