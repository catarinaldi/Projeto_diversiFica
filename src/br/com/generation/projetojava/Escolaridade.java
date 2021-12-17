package br.com.generation.projetojava;

import java.util.Scanner;

public class Escolaridade {
	 
	
	 //CURSANDO FACULDADE 
	 String faculDataInicio1;
	 String faculDataFim1;
	 String nomeCursoFaculdade1;
	 String nomeFaculdade1;
	 String localFaculdade1;
	
	 //FACULDADE FINALIZADO
	 String faculdade;
	 String faculDataInicio;
	 String faculDataFim;
	 String nomeCursoFaculdade;
	 String nomeFaculdade;
	 String localFaculdade;
	 
	 
	 //POS CURSANDO
	 String posGraduacao1;
	 String posDataInicio1;
	 String posDataFim1;
	 String nomeCursoPos1;
	 String nomePos1;
	 String localPos1;
	 
	 //POS FINALIZADO
	 String posGraduacao;
	 String posDataInicio;
	 String posDataFim;
	 String nomeCursoPos;
	 String nomePos;
	 String localPos;
	 

	 //MESTRADO CURSANDO
	 String mestrado1;
	 String mestradoDataInicio1;
	 String mestradoDataFim1;
	 String cursoMestrado1;
	 String nomeMestrado1;
	 String localMestrado1;
	 
	 //MESTRADO FINALIZADO
	 String mestrado;
	 String mestradoDataInicio;
	 String mestradoDataFim;
	 String cursoMestrado;
	 String nomeMestrado;
	 String localMestrado;
	 
	//DOUTORADO CURSANDO
	 String doutorado1;
	 String doutoradoDataInicio1;
	 String doutoradoDataFim1;
	 String cursoDoutorado1;
	 String nomeDoutorado1;
	 String localDoutorado1;
		 
	 //DOUTORADO FINALIZADO
	 String doutorado;
	 String doutoradoDataInicio;
	 String doutoradoDataFim;
	 String cursoDoutorado;
	 String nomeDoutorado;
	 String localDoutorado;
	 
	 //METODOS
	 Scanner entrada = new Scanner(System.in);
	 
	 public void cadFaculdadeCursando() throws InterruptedException {

	 	 System.out.print("Informe o nome da Faculdade: ");			
		 nomeFaculdade1 = entrada.nextLine();
			
			
		 System.out.print("Informe o Curso que voc� est� cursando: ");
		 nomeCursoFaculdade1 = entrada.nextLine();
			
		 System.out.print("O local da Faculdade: ");
		 localFaculdade1 = entrada.nextLine();
			
			
		 System.out.print("Data do inicio do curso: ");
		 faculDataInicio1 = entrada.nextLine();
		 
		 System.out.print("Data que voc� ir� finalizar o curso: ");
		 faculDataFim1 = entrada.nextLine();
		 
	 }
	 
	 public void cadFaculdadeFinalizado() throws InterruptedException {

	 	 System.out.print("Informe o nome da Faculdade: ");			
		 nomeFaculdade = entrada.nextLine();
			
			
		 System.out.print("Informe o Curso que foi cursado: ");
		 nomeCursoFaculdade = entrada.nextLine();
			
		 System.out.print("O local da Faculdade: ");
		 localFaculdade = entrada.nextLine();
			
			
		 System.out.print("Data do inicio do curso: ");
		 faculDataInicio = entrada.nextLine();
		 
		 System.out.print("Data que voce finalizou o curso: ");
		 faculDataFim = entrada.nextLine();
		 
	 }
	 
	 public void cadPosGraduacaoCursando() throws InterruptedException {
		 
	 	 System.out.print("Informe o nome do lugar que est� fazendo a P�s: ");			
	 	 nomePos1 = entrada.nextLine();
			
			
		 System.out.print("Informe o Curso de P�s Gradua��o que voc� est� cursando: ");
		 nomeCursoPos1 = entrada.nextLine();
			
		 System.out.print("Local: ");
		 localPos1 = entrada.nextLine();
			
			
		 System.out.print("Data do inicio: ");
		 posDataInicio1 = entrada.nextLine();
		 
		 System.out.print("Data do termino do curso: ");
		 posDataFim1 = entrada.nextLine();
		 
	 }
	 
	 public void cadPosGraduacaoFinalizado() throws InterruptedException {

	 	 System.out.print("Informe o nome do lugar que est� fazendo a P�s: ");			
	 	 nomePos = entrada.nextLine();
			
			
		 System.out.print("Informe o Curso de P�s Gradua��o que voc� cursou: ");
		 nomeCursoPos = entrada.nextLine();
			
		 System.out.print("Local: ");
		 localPos = entrada.nextLine();
			
			
		 System.out.print("Data do inicio: ");
		 posDataInicio = entrada.nextLine();
		 
		 System.out.print("Data que voc� finalizou: ");
		 posDataFim = entrada.nextLine();
		 
	 }
	 
	 public void cadMestradoCursando() throws InterruptedException {
		 
	 	 System.out.print("Informe o nome do lugar que est� cursando o Mestrado: ");			
	 	 nomeMestrado1 = entrada.nextLine();
			
			
		 System.out.print("Informe o Curso de Mestrado que voc� est� cursando: ");
		 cursoMestrado1 = entrada.nextLine();
			
		 System.out.print("Local: ");
		 localMestrado1 = entrada.nextLine();
			
			
		 System.out.print("Data do inicio: ");
		 mestradoDataInicio1 = entrada.nextLine();
		 
		 System.out.print("Data que voc� finalizou: ");
		 mestradoDataFim1 = entrada.nextLine();
		 
	 }
	 
	 public void cadMestradoFinalizado() throws InterruptedException {

	 	 System.out.print("Informe o nome do lugar que voc� cursou o Mestrado: ");			
	 	 nomeMestrado = entrada.nextLine();
			
			
		 System.out.print("Informe o nome do curso de Mestrado que voc� cursou  ");
		 cursoMestrado = entrada.nextLine();
			
		 System.out.print("Local: ");
		 localMestrado = entrada.nextLine();
			
			
		 System.out.print("Data do inicio: ");
		 mestradoDataInicio = entrada.nextLine();
		 
		 System.out.print("Data que voc� finalizou: ");
		 mestradoDataFim = entrada.nextLine();
		 
	 }
	 
	 public void cadDoutoradoCursando() throws InterruptedException {
		 
	 	 System.out.print("Informe o nome do lugar que est� cursando o Doutorado: ");			
	 	 nomeDoutorado1 = entrada.nextLine();
			
			
		 System.out.print("Informe o Curso de Doutorado que voc� est� cursando: ");
		 cursoDoutorado1 = entrada.nextLine();
			
		 System.out.print("Local: ");
		 localDoutorado1 = entrada.nextLine();
			
			
		 System.out.print("Data do inicio: ");
		 doutoradoDataInicio1 = entrada.nextLine();
		 
		 System.out.print("Data que voc� finalizou: ");
		 doutoradoDataFim1 = entrada.nextLine();
		 
	 }
	 
	 public void cadDoutoradoFinalizado() throws InterruptedException {
	 
		 
	 	 System.out.print("Informe o nome do lugar que voc� cursou o Doutorado: ");			
	 	 nomeDoutorado = entrada.nextLine();
			
			
		 System.out.print("Informe o nome do curso de Doutorado que voc� cursou  ");
		 cursoDoutorado = entrada.nextLine();
			
		 System.out.print("Local: ");
		 localDoutorado = entrada.nextLine();
			
			
		 System.out.print("Data do inicio: ");
		 doutoradoDataInicio = entrada.nextLine();
		 
		 System.out.print("Data que voc� finalizou: ");
		 doutoradoDataFim = entrada.nextLine();
		 
	 }
	 
	 
}
