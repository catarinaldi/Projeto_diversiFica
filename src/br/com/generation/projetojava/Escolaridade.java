package br.com.generation.projetojava;

import java.util.Scanner;

public class Escolaridade {
	
	
	//Ensino Medio não finalizado
	 String ensinoMedioDataInicio1;
	 String ensinoMedioDataFim1;
	 String ensinoMedioNome1;
	 String ensinoMediolocal1;
	
	 //Ensino médio finalizado
	 String ensinoMedioDataInicio;
	 String ensinoMedioDataFim;
	 String ensinoMedioNome;
	 String ensinoMediolocal;
	 
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
	 
	 public void cadEnsinoMedioNaoFinalizado() throws InterruptedException {	 
	 
	 	 System.out.print("Informe o nome da escola: ");			
	 	 ensinoMedioNome1 = entrada.nextLine();
			
		 System.out.print("O local da escola: ");
		 ensinoMediolocal1 = entrada.nextLine();
			
			
		 System.out.print("Data do início da escola: ");
		 ensinoMedioDataInicio1 = entrada.nextLine();
		 
		 System.out.print("Informe até que série você estudou: ");
		 ensinoMedioDataFim1 = entrada.nextLine();
		 
	 }
	 
	 public void cadEnsinoMedioFinalizado() throws InterruptedException {
	 
		 System.out.print("Informe o nome da escola: ");			
		 ensinoMedioNome = entrada.nextLine();
			
		 System.out.print("Local da escola: ");
		 ensinoMediolocal = entrada.nextLine();
			
			
		 System.out.print("Data início: ");
		 ensinoMedioDataInicio = entrada.nextLine();
		 
		 System.out.print("Data fim: ");
		 ensinoMedioDataFim = entrada.nextLine();
		 
	 }
	 
	 public void cadFaculdadeCursando() throws InterruptedException {

	 	 System.out.print("Informe o nome da faculdade: ");			
		 nomeFaculdade1 = entrada.nextLine();
			
			
		 System.out.print("Informe o nome do curso: ");
		 nomeCursoFaculdade1 = entrada.nextLine();
			
		 System.out.print("O local da faculdade: ");
		 localFaculdade1 = entrada.nextLine();
			
			
		 System.out.print("Data início: ");
		 faculDataInicio1 = entrada.nextLine();
		 
		 System.out.print("Data fim: ");
		 faculDataFim1 = entrada.nextLine();
		 
	 }
	 
	 public void cadFaculdadeFinalizado() throws InterruptedException {

	 	 System.out.print("Informe o nome da faculdade: ");			
		 nomeFaculdade = entrada.nextLine();
			
			
		 System.out.print("Informe o nome do curso: ");
		 nomeCursoFaculdade = entrada.nextLine();
			
		 System.out.print("O local da faculdade: ");
		 localFaculdade = entrada.nextLine();
			
			
		 System.out.print("Data início: ");
		 faculDataInicio = entrada.nextLine();
		 
		 System.out.print("Data fim: ");
		 faculDataFim = entrada.nextLine();
		 
	 }
	 
	 public void cadPosGraduacaoCursando() throws InterruptedException {
		 
	 	 System.out.print("Informe o nome da faculdade que está estudando a pós: ");			
	 	 nomePos1 = entrada.nextLine();
			
			
		 System.out.print("Informe nome do curso de pós-graduação: ");
		 nomeCursoPos1 = entrada.nextLine();
			
		 System.out.print("Local: ");
		 localPos1 = entrada.nextLine();
			
			
		 System.out.print("Data início: ");
		 posDataInicio1 = entrada.nextLine();
		 
		 System.out.print("Data fim: ");
		 posDataFim1 = entrada.nextLine();
		 
	 }
	 
	 public void cadPosGraduacaoFinalizado() throws InterruptedException {

	 	 System.out.print("Informe o nome da faculdade que estudou a pós: ");			
	 	 nomePos = entrada.nextLine();
			
			
		 System.out.print("Informe o nome do curso de pós-graduação: ");
		 nomeCursoPos = entrada.nextLine();
			
		 System.out.print("Local: ");
		 localPos = entrada.nextLine();
			
			
		 System.out.print("Data início: ");
		 posDataInicio = entrada.nextLine();
		 
		 System.out.print("Data fim: ");
		 posDataFim = entrada.nextLine();
		 
	 }
	 
	 public void cadMestradoCursando() throws InterruptedException {
		 
	 	 System.out.print("Informe o nome da faculdade que está estudando o mestrado: ");			
	 	 nomeMestrado1 = entrada.nextLine();
			
			
		 System.out.print("Informe o nome do curso de mestrado: ");
		 cursoMestrado1 = entrada.nextLine();
			
		 System.out.print("Local: ");
		 localMestrado1 = entrada.nextLine();
			
			
		 System.out.print("Data início: ");
		 mestradoDataInicio1 = entrada.nextLine();
		 
		 System.out.print("Data fim: ");
		 mestradoDataFim1 = entrada.nextLine();
		 
	 }
	 
	 public void cadMestradoFinalizado() throws InterruptedException {

	 	 System.out.print("Informe o nome da faculdade que estudou o mestrado: ");			
	 	 nomeMestrado = entrada.nextLine();
			
			
		 System.out.print("Informe o nome do curso de mestrado: ");
		 cursoMestrado = entrada.nextLine();
			
		 System.out.print("Local: ");
		 localMestrado = entrada.nextLine();
			
			
		 System.out.print("Data início: ");
		 mestradoDataInicio = entrada.nextLine();
		 
		 System.out.print("Data fim: ");
		 mestradoDataFim = entrada.nextLine();
		 
	 }
	 
	 public void cadDoutoradoCursando() throws InterruptedException {
		 
	 	 System.out.print("Informe o nome da faculdade que está estudando o doutorado: ");			
	 	 nomeDoutorado1 = entrada.nextLine();
			
			
		 System.out.print("Informe o nome do curso de doutorado: ");
		 cursoDoutorado1 = entrada.nextLine();
			
		 System.out.print("Local: ");
		 localDoutorado1 = entrada.nextLine();
			
			
		 System.out.print("Data início: ");
		 doutoradoDataInicio1 = entrada.nextLine();
		 
		 System.out.print("Data fim: ");
		 doutoradoDataFim1 = entrada.nextLine();
		 
	 }
	 
	 public void cadDoutoradoFinalizado() throws InterruptedException {
	 
		 
	 	 System.out.print("Informe o nome da faculdade que estudou o doutorado: ");			
	 	 nomeDoutorado = entrada.nextLine();
			
			
		 System.out.print("Informe o nome do curso de doutorado: ");
		 cursoDoutorado = entrada.nextLine();
			
		 System.out.print("Local: ");
		 localDoutorado = entrada.nextLine();
			
			
		 System.out.print("Data início: ");
		 doutoradoDataInicio = entrada.nextLine();
		 
		 System.out.print("Data fim: ");
		 doutoradoDataFim = entrada.nextLine();
		 
	 }
	 
	 
}
