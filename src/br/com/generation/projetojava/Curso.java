package br.com.generation.projetojava;

public class Curso {

	
	String nomeCurso;
	String dataInicioCurso;
	String dataFimCurso;
	String experienciaCurso;
	public Curso(String nomeCurso, String dataInicioCurso, String dataFimCurso, String experienciaCurso) {
		super();
		this.nomeCurso = nomeCurso;
		this.dataInicioCurso = dataInicioCurso;
		this.dataFimCurso = dataFimCurso;
		this.experienciaCurso = experienciaCurso;
	}
	@Override
	public String toString() {
		return "\nCurso: " + nomeCurso + "\nData início: " + dataInicioCurso + "\nData fim: "
				+ dataFimCurso + "\nExperiência obtida: " + experienciaCurso;
	}
	
	
}
