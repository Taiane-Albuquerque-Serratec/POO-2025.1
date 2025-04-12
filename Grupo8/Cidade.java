package Grupo8;

public class Cidade {
public String nomeCidade;
public Estado estado;

public Cidade(String nomeCidade, Estado estado) {
    this.nomeCidade = nomeCidade;
    this.estado = estado;
}

@Override
public String toString() {
    return nomeCidade  + estado ;
}

public String getNomeCidade() {
    return nomeCidade;
}

public Estado getEstado() {
    return estado;
}

}