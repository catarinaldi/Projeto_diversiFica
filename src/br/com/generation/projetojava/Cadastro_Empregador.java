package br.com.generation.projetojava;

import java.util.Scanner;

public class Cadastro_Empregador {
	/*Cadastro Empregador - diversiFica
	 * Autore: catarina
	 * Data: 14/12/2021
	 */	
	
	public  void cadastroEmpresa() throws InterruptedException {
		
//			=============DECLARA��O DE M�TODOS ==============	
		Scanner entrada = new Scanner(System.in);
		PaginaInicial paginaInicial = new PaginaInicial ();
		Executavel oferecendoVaga = new Executavel ();

//			=============DECLARA��O DE VARI�VEIS=============			
		
		String nomeEmpresa , CNPJ = "" , email  ;
		int num = 10, opc = 0, cadastro, i = 0, j = 0;
		int[] formularioDiversidade = new int[8];
		boolean valorRepetido = false;
		
//			=============ENTRANDO NA P�GINA DE CADASTRO=============
		
		System.out.println("Selecione 1 para a p�gina 'Cadastro do empregador'");
		cadastro = entrada.nextInt();
		if (cadastro != 1) {
			System.out.println("\n=============Op��o inv�lida!=============\n");
		} else {
			
		System.out.println("\n=============CADASTRO DO EMPREGADOR=============\n");
		
//			=============CADASTRO: INFOS B�SICAS=============
		
		System.out.println("Nome da empresa: ");
		nomeEmpresa = entrada.next();
	
//			=============CNPJ RESTRINGIDO A 14 CARACTERES=============
		
		while (CNPJ.length() != 14) {
			System.out.println("CNPJ (apenas n�meros (14)): ");
			CNPJ = entrada.next();
			if (CNPJ.length() != 14) {
					System.out.println("Valor inv�lido!");
			}
		}
		
		System.out.println("Email: ");
		email = entrada.next();
		
//			=============SELE��O DE INCLUS�ES SEM N�MERO ERRADO OU REPETIDO=============
		
			while (num != 0) {
				System.out.println("Selecione qual(is) o(s) �cone(s) de inclus�o voc� participa na sua empresa: ");
				System.out.println("1. Sexualidade; \n2. G�nero; \n3. Defici�ncia F�sica; \n4. Defici�ncia Auditiva;"
						+ "\n5. Defici�ncia Visual; \n6. Defici�ncia Intelectual; \n7. Etnica; \n8. Todos acima; \n0. Pressione 0 para sair");
				num = entrada.nextInt();
			
			if (num == 0) {
				System.out.println("\n=============Cadastro completo!=============\n");	
			} else {
				if (num > 8) {
					System.out.println("\n=============Valor inv�lido!=============\n");
				} else {
					for (j = 0; j < formularioDiversidade.length; j++) {
						if (num == formularioDiversidade[j]) {
							valorRepetido = true;
						}
					}
					if (valorRepetido == true) {
						System.out.println("\n=============Op��o inv�lida!=============\n");
						valorRepetido = false;
					}else {
						formularioDiversidade[i] = num;
						i++;
					}			
				}	
			}		
		}
				
//				=============MOSTRANDO VALORES SELECIONADOS NO FORMUL�RIO=============
		
		System.out.print("Valores selecionados: " + formularioDiversidade[i] + " | ");
		for (i = 0; i < formularioDiversidade.length; i++) {
			System.out.print(formularioDiversidade[i] + " | ");
		}
		
		System.out.println("\n");
		
//		=============CADASTRO FINALIZADO: REDIRECIONAMENTO PARA OUTRAS P�GINAS=============
		
		while (opc != 1 && opc != 2) {
			System.out.println("Pressione: \n1. Para voltar para a p�gina inicial; \n2. Para cadastrar uma vaga");
			opc = entrada.nextInt();
			
			if(opc == 1) {
				System.out.println("\n=============P�gina Inicial=============\n");
				paginaInicial.inicial();
			} else if (opc == 2) {
				System.out.println("\n=============P�gina de Cadastro de Vaga=============\n");
				
				oferecendoVaga.oferecendovaga();
			} else {
				System.out.println("\n=============Op��o inv�lida!=============\n");
			}
		}

		
		entrada.close();


		}
	}
}
