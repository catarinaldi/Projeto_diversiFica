package br.com.generation.projetojava;

import java.util.Scanner;

public class Executavel {

	public void oferecendovaga () throws InterruptedException {
		
		String nomeDaVaga;
		String area;
		String horario;
		String salario;
		int opcao;
		
		Scanner entrada = new Scanner(System.in);
		PaginaInicial paginaInicial = new PaginaInicial();

		System.out.println("\n============= Cadastro de Vaga =============\n");
		
		System.out.println("Voc� deseja oferecer vaga ?");
		System.out.println("1. Sim");
		System.out.println("0. N�o");
		System.out.print("Informe a op��o:");
		opcao = entrada.nextInt();
		
		while(opcao != 1 && opcao != 0) {
			System.out.print("Informe a op��o:");
			opcao = entrada.nextInt();
		}
		if(opcao == 0 ) {
			System.out.println("\n=============P�gina Inicial=============\n");
			paginaInicial.inicial();		
			}
		
		while(opcao == 1) {
		System.out.println("========== Preencha os campos da vaga ==========");
		
		System.out.print("Nome da vaga: ");
		entrada.nextLine();
		nomeDaVaga = entrada.nextLine();
		
		System.out.print("Cargo: ");
		area = entrada.nextLine();
		
		System.out.print("Hor�rio da vaga: ");
		horario = entrada.nextLine();
		
		System.out.print("Faixa salarial: ");
		salario = entrada.nextLine();
		
		System.out.println();
		System.out.println("|==========================================================================================================|");
		System.out.println();
		System.out.println(" |   Nome da vaga: " + nomeDaVaga + "| cargo: " + area + "| hor�rio: "
														+ horario + "| sal�rio: " + salario + " |");
		System.out.println();
		System.out.println("|==========================================================================================================|");
		
		System.out.println("\n============= Vaga cadastrada com sucesso! =============\n");
		System.out.println("Deseja registrar outra vaga ?");
		System.out.println("1. Sim");
		System.out.println("0. Pagina Inicial");
		System.out.print("Informe a op��o");
		opcao = entrada.nextInt();
		while(opcao != 1 && opcao != 0) {
			System.out.print("Informe a op��o");
			opcao = entrada.nextInt();
			}
		}
		if(opcao == 0) {
			paginaInicial.inicial();	
		} 
		
		entrada.close();
	}

}
