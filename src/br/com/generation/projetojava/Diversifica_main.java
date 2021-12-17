package br.com.generation.projetojava;

import java.util.Scanner;

public class TelaInicio {
	
	public static void main (String [] args) throws InterruptedException {
		
		Scanner entrada = new Scanner(System.in);
		User user = new User();
		TelaInicial telaopcao = new TelaInicial();
		
		
		int pagina;
			
		System.out.println("****** Olá Bem Vindo ao Divesifica ******");
		
		
		System.out.println();
		
		System.out.println("1 : Criar Conta");
		System.out.println("2 : Lista de Empresas");
		System.out.print("Informe a opção:");
		pagina = entrada.nextInt();
		while(pagina != 1 && pagina != 2 ) {
			System.out.print("Informe a opção:");
			pagina = entrada.nextInt();
		}
		if(pagina == 1 ){
			//telaopcao.opcoesCadastro();	
		}
		else {
			System.out.println("LISTA DE EMPRESA");
		}
		
		
		entrada.close();
	}

}
