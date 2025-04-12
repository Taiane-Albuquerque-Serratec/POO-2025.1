package Grupo8;

public class Telefone {
public String numero;

public Telefone(String numero) {
    this.numero = numero;
}

@Override
public String toString() {
    return numero;
}

public String getNumero() {
    return numero;
}

}