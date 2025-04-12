package org.serratec.exemplos;

public enum PeriodoCurso {
	INTEGRAL("Terça e Quinta", 80, 3000.), 
	NOTURNO("Sexta", 80 ,3000.), 
	TARDE("Segunda e Quarta", 20, 500.);

	private String dias;
	private Integer cargaHorario;
	private Double valor;
	
	//construtor do enum é para definir a ordem dos atributos

	private PeriodoCurso(String dias, Integer cargaHorario, Double valor) {
		this.dias = dias;
		this.cargaHorario = cargaHorario;
		this.valor = valor;
	}

	public String getDias() {
		return dias;
	}

	public Integer getCargaHorario() {
		return cargaHorario;
	}

	public Double getValor() {
		return valor;
	}

	

}