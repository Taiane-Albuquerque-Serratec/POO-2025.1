package OficinaGrupo8;

import java.time.LocalDate;

public class Veiculo implements Oficina {

protected String modelo;
protected Double valorCobrado = 0.0;
protected LocalDate dataConserto;
protected Proprietario proprietario;

// Construtor
public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
this.modelo = modelo;
this.dataConserto = dataConserto;
this.proprietario = proprietario;
}

// toString
@Override
public String toString() {
return "Modelo: " + modelo + ", valorCobrado: " + valorCobrado + ", dataConserto: " + dataConserto
+ ", proprietario: " + proprietario;
}

// Interface
@Override
public Double lavarVeiculo() {
return null;
}

@Override
public Double trocarOleo() {
return null;
}

@Override
public Double revisao() {
return null;
}

// Getters
public Double getValorCobrado() {
return valorCobrado;
	}

}
