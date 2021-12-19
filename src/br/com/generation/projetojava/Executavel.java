package br.com.generation.projetojava;

import java.util.Scanner;

public class Executavel {

	public void oferecendovaga () throws InterruptedException {
		
		String nomeDaVaga;
		String area;
		String horario;
		String salario;
		int opcao;
		int repetir = 0 ;
		
		Scanner entrada = new Scanner(System.in);
		PaginaInicial paginaInicial = new PaginaInicial();
		
		
		System.out.println("\n=============Cadastro de Vaga=============\n");
		
		System.out.println("Voc� deseja oferecer uma vaga?");
		System.out.println("1. Sim");
		System.out.println("0. N�o");
		System.out.print("Informe a op��o: ");
		opcao = entrada.nextInt();
		
		while(opcao != 1 && opcao != 0) {
			System.out.print("Informe a op��o:");
			opcao = entrada.nextInt();
		}
		if(opcao == 0 ) {
			System.out.println("\n=============P�gina Inicial=============\n");
			paginaInicial.inicial();		
			}
		
		while(repetir == 1) {
		System.out.println("=============Preencha os campos da vaga=============");
		
		System.out.println("Nome da vaga: ");
		nomeDaVaga = entrada.nextLine();
		
		System.out.println("�rea: ");
		area = entrada.nextLine();
		
		System.out.println("Hor�rio da vaga: ");
		horario = entrada.next();
		
		System.out.println("Faixa salarial: ");
		salario = entrada.next();
		
		System.out.println();
		System.out.println("|==========================================================================================================|");
		System.out.println();
		System.out.println(" |   Nome da vaga: " + nomeDaVaga + "| �rea: " + area + "| hor�rio: "
														+ horario + "| sal�rio: " + salario + " |");
		System.out.println();
		System.out.println("|==========================================================================================================|");
		
		System.out.println("\n=============Vaga cadastrada com sucesso!=============\n");
		System.out.println("Deseja registrar outra vaga?");
		System.out.println("1. Sim");
		System.out.println("0. P�gina Inicial");
		System.out.print("Informe a op��o: ");
		repetir = entrada.nextInt();
		while(repetir != 1 && repetir != 0) {
			System.out.print("Informe a op��o: ");
			repetir = entrada.nextInt();
			}
		}
		
		paginaInicial.inicial();
		
		entrada.close();
	}

}
