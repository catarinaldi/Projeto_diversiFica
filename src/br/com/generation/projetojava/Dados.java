package br.com.generation.projetojava;

public class Dados {

	String nomeEmpresa;
	String cargo;
	double horaEntrada;
	double horaSaida;
	double salario;
	String icones;
	
	public Dados(String nomeEmpresa, String cargo, double horaEntrada, double horaSaida, double salario,
			String icones) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.cargo = cargo;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.salario = salario;
		this.icones = icones;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public double getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(double horaSaida) {
		this.horaSaida = horaSaida;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getIcones() {
		return icones;
	}

	public void setIcones(String icones) {
		this.icones = icones;
	}

	public String toString() {
		return "Nome da Empresa: " + nomeEmpresa + " | Cargo: " + cargo + "\nHorário das " + horaEntrada
				+ " às " + horaSaida + " | Salário: R$ " + salario + "\nÍcones de inclusão: " + icones;
	}
	
}
