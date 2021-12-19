package br.com.generation.projetojava;


import java.util.Scanner;

public class Cadastro_Empregador {
	/*Cadastro Empregador - diversiFica
	 * Autore: catarina
	 * Data: 14/12/2021
	 */	
	
	public  void cadastroEmpresa() throws InterruptedException {
		
//			=============DECLARAÇÃO DE MÉTODOS ==============	
		Scanner entrada = new Scanner(System.in);
		PaginaInicial paginaInicial = new PaginaInicial ();
		Executavel oferecendoVaga = new Executavel ();

//			=============DECLARAÇÃO DE VARIÁVEIS=============			
		
		String nomeEmpresa , CNPJ = "" , email  ;
		int num = 10, opc = 0, cadastro, i = 0, j = 0;
		int[] formularioDiversidade = new int[8];
		boolean valorRepetido = false;
		
//			=============ENTRANDO NA PÁGINA DE CADASTRO=============
		
		System.out.println("Selecione 1 para a página 'Cadastro do empregador'");
		cadastro = entrada.nextInt();
		if (cadastro != 1) {
			System.out.println("\n=============Opção inválida!=============\n");
		} else {
			
		System.out.println("\n=============CADASTRO DO EMPREGADOR=============\n");
		
//			=============CADASTRO: INFOS BÁSICAS=============
		
		System.out.println("Nome da empresa: ");
		nomeEmpresa = entrada.next();
	
//			=============CNPJ RESTRINGIDO A 14 CARACTERES=============
		
		while (CNPJ.length() != 14) {
			System.out.println("CNPJ (apenas números (14)): ");
			CNPJ = entrada.next();
			if (CNPJ.length() != 14) {
					System.out.println("Valor inválido!");
			}
		}
		
		System.out.println("Email: ");
		email = entrada.next();
		
//			=============SELEÇÃO DE INCLUSÕES SEM NÚMERO ERRADO OU REPETIDO=============
		
			while (num != 0) {
				System.out.println("Selecione qual(is) o(s) ícone(s) de inclusão você participa na sua empresa: ");
				System.out.println("1. Sexualidade; \n2. Gênero; \n3. Deficiência Física; \n4. Deficiência Auditiva;"
						+ "\n5. Deficiência Visual; \n6. Deficiência Intelectual; \n7. Etnica; \n8. Todos acima; \n0. Pressione 0 para sair");
				num = entrada.nextInt();
			
			if (num == 0) {
				System.out.println("\n=============Cadastro completo!=============\n");	
			} else {
				if (num > 8) {
					System.out.println("\n=============Valor inválido!=============\n");
				} else {
					for (j = 0; j < formularioDiversidade.length; j++) {
						if (num == formularioDiversidade[j]) {
							valorRepetido = true;
						}
					}
					if (valorRepetido == true) {
						System.out.println("\n=============Opção inválida!=============\n");
						valorRepetido = false;
					}else {
						formularioDiversidade[i] = num;
						i++;
					}			
				}	
			}		
		}
				
//				=============MOSTRANDO VALORES SELECIONADOS NO FORMULÁRIO=============
		
		System.out.print("Valores selecionados: " + formularioDiversidade[i] + " | ");
		for (i = 0; i < formularioDiversidade.length; i++) {
			System.out.print(formularioDiversidade[i] + " | ");
		}
		
		System.out.println("\n");
		
//		=============CADASTRO FINALIZADO: REDIRECIONAMENTO PARA OUTRAS PÁGINAS=============
		
		while (opc != 1 && opc != 2) {
			System.out.println("Pressione: \n1. Para voltar para a página inicial; \n2. Para cadastrar uma vaga");
			opc = entrada.nextInt();
			
			if(opc == 1) {
				System.out.println("\n=============Página Inicial=============\n");
				paginaInicial.inicial();
			} else if (opc == 2) {
				System.out.println("\n=============Página de Cadastro de Vaga=============\n");
				
				oferecendoVaga.oferecendovaga();
			} else {
				System.out.println("\n=============Opção inválida!=============\n");
			}
		}

		
		entrada.close();


		}
	}
}
