package br.com.generation.projetojava;

import java.util.Scanner;

public class Diversifica_main {
	
	public static void main (String [] args) throws InterruptedException {
		
		Scanner entrada = new Scanner(System.in);
		TelaInicial telaopcao = new TelaInicial();
		
		
		int pagina;
			
		System.out.println("=============Ol�! Bem vinde ao DivesiFica=============");
		
		
		System.out.println();
		
		System.out.println("1. Criar conta");
		System.out.println("2. Lista de empresas");
		System.out.print("Insira uma das op��es: ");
		pagina = entrada.nextInt();
		while(pagina != 1 && pagina != 2 ) {
			System.out.print("Informe a op��o: ");
			pagina = entrada.nextInt();
		}
		if(pagina == 1 ){
			telaopcao.opcoesCadastro();	
		}
		else {
			System.out.println("\n=============LISTA DE EMPRESAS=============\n");
		}
		
		
		entrada.close();
	}

}
