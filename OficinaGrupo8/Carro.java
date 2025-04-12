package OficinaGrupo8;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Carro extends Veiculo {

private String categoria;


// Constructor
public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
	super(modelo, dataConserto, proprietario);
	this.categoria = categoria;
}

@Override
public Double lavarVeiculo() {
valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
return super.lavarVeiculo();
}

@Override
public Double trocarOleo() {
if (dataConserto.getDayOfWeek() == DayOfWeek.SATURDAY) {
valorCobrado += TipoServico.OLEO.getValorPorServico() - 50.;
} else {
valorCobrado += TipoServico.OLEO.getValorPorServico();
}
return super.trocarOleo();
}

@Override
public Double revisao() {
if (dataConserto.getMonthValue() == 8) {
valorCobrado += TipoServico.REVISAO.getValorPorServico() * 0.9;
} else {
valorCobrado += TipoServico.REVISAO.getValorPorServico();

return super.revisao();
}
	return valorCobrado += TipoServico.REVISAO.getValorPorServico() ;
	
}

// Getters
public String getCategoria() {
return categoria;
}

}