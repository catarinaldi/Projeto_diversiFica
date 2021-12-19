package br.com.generation.projetojava;

public class Experiencia {

		String nomeEmpresa;
		String nomeCargo;
		String localDeTrabalho;
		String dataInicio;
		String dataFim;
		String experienciaDeTrabalho;	
 
		public Experiencia(String nomeEmpresa, String nomeCargo, String localDeTrabalho, String dataInicio,
				String dataFim, String experienciaDeTrabalho) {
			super();
			this.nomeEmpresa = nomeEmpresa;
			this.nomeCargo = nomeCargo;
			this.localDeTrabalho = localDeTrabalho;
			this.dataInicio = dataInicio;
			this.dataFim = dataFim;
			this.experienciaDeTrabalho = experienciaDeTrabalho;
		}


		@Override
		public String toString() {
			return "\nNome da empresa: " + nomeEmpresa + "\nCargo: " + nomeCargo +  "\nLocal de trabalho: " + localDeTrabalho
					+ "\nData in�cio: " + dataInicio + "\nData fim: " + dataFim + "\nExperi�ncia: " + experienciaDeTrabalho;
		}
		
		
		
		
}

