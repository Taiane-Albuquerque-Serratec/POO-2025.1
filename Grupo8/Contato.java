package Grupo8;

import java.util.Arrays;


public class Contato {
    
    private String nome;
    private Telefone telefone[];
    private Endereco endereco;

//construtor
public Contato(String nome, Telefone[] telefone, Endereco endereco) {
    this.nome = nome;
    this.telefone = telefone;
    this.endereco = endereco;
}

@Override
public String toString() {
    return "\nNome:" + nome + "\nEndereco: " + endereco + "\nTelefone:" + Arrays.toString(telefone) ;
}

//ler telefones
public void adicionarTelefones(Telefone lerTelefones) {
    for (int x = 0; x < telefone.length; x++) {  //percorrer o vetor telefone
        if (telefone[x] == null) {
            telefone[x] = lerTelefones;
            break;
        }
    }
}

//mostrar telefones
public void mostrarTelefones(){
    for (Telefone telefone :telefone) {
        System.out.println(telefone);
        }
    }
}