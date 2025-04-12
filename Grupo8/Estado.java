package Grupo8;

public class Estado {
public String nomeEstado;
public String sigla;

public Estado(String nomeEstado, String sigla) {
    this.nomeEstado = nomeEstado;
    this.sigla = sigla;

}

@Override
public String toString() {
    return "\nEstado: " + nomeEstado + "\nSigla: " + sigla ;
}

public String getNomeEstado() {
    return nomeEstado;
}
public String getSigla() {
    return sigla;
}

}