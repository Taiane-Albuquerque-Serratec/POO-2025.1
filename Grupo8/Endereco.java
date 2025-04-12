package Grupo8;

public class Endereco {
public String rua;
public String bairro;
public String cep;
public Cidade cidade;

public Endereco(String rua, String bairro, String cep, Cidade cidade) {
    this.rua = rua;
    this.bairro = bairro;
    this.cep = cep;
    this.cidade = cidade;
}

@Override
public String toString() {
    return "\nEndereco: " + rua + " \nBairro: " + bairro + " \nCep: " + cep + " \nCidade: " + cidade ;
}

public String getRua() {
    return rua;
}

public String getBairro() {
    return bairro;
}

public String getCep() {
    return cep;
}

public Cidade getCidade() {
    return cidade;
}

}