package br.com.generation.projetojava;

import java.util.Scanner;

public class Formulario {
	
	 String selecaoPagina2;
	 String selecaoPagina;
	 String empresa ;
	 String empresaTrabalhada ;
	 String tempoTrabalhado ;
	 String experiencia;
	 String experienciaDeoutra;
	 String banheiro;
	 String palestra;
	 String acessibilidade;
	 String inclusivaVisual;
	 String inclusivaIntelectual;
	 String inclusivaAuditiva;
	 String inclusivaFisica;
	 String assedio;
	 String ambienteInclusivo;
	 
	 
	public void avaliacaoentrada () throws InterruptedException {
		PaginaInicial paginainicial = new PaginaInicial();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Deseja avaliar a empresa?");
		System.out.println("1. Sim ");
		System.out.println("0. Não | Voltar para a página inicial ");
		System.out.print("Insira uma das opções:");
		selecaoPagina2 = entrada.next();
		while(!selecaoPagina2.equals("1") && !selecaoPagina2.equals("0")) {
			System.out.print("Insira uma das opções:");
			selecaoPagina2 = entrada.next();
		}
		
		if(selecaoPagina2.equals("0")) {
			paginainicial.inicial();
		}
		
		System.out.println("\n=============AVALIAÇÃO DE EMPRESAS=============\n");
		System.out.println("Você trabalhou nessa empresa?");

		System.out.println("1. Sim");
		System.out.println("2. Não");
		System.out.print("Insira uma das opções:");
		empresa = entrada.next();
		while(!empresa.equals("1")  && !empresa.equals("2")) {
			System.out.println("Insira uma das opções: ");
			empresa = entrada.next();			
		}
		if (empresa.equals("1")) {
			System.out.print("Nome da empresa trabalhada: ");
			empresaTrabalhada = entrada.next();
			System.out.print("Quanto tempo trabalhou no local: ");
			tempoTrabalhado = entrada.next();
		}
		System.out.println();
		System.out.println("***************************************************");
		entrada.nextLine();
		
		System.out.println("Essa experiência é sua?");
		System.out.println("1. Sim");
		System.out.println("2. Não");

		System.out.print("Insira a opção: ");
		experiencia = entrada.nextLine();
		while(!experiencia.equals("1") && !experiencia.equals("2")) {
			System.out.print("Insira uma das opções: ");
			experiencia = entrada.next(); 
			}
		experiencia = "A experiência é da própria pessoa que está fazendo avaliação";
		System.out.println();
		System.out.println("***************************************************");
		if(experiencia.equals("2")) {
			experiencia = "";
			System.out.println("É de alguém que você conhece?");
			System.out.println("1. Sim");
			System.out.println("2. Não");
			System.out.print("Insira uma das opções: ");
			experienciaDeoutra = entrada.next();
			while(!experienciaDeoutra.equals("1") && !experienciaDeoutra.equals("2")) {
				System.out.print("Insira uma das opções: ");
				experienciaDeoutra = entrada.next();
			}
			if (experienciaDeoutra.equals("1")) {
				experienciaDeoutra = "Pessoa conhecida";

			}else {
				experienciaDeoutra = "Pessoa desconhecida";

			}

		}
		System.out.println();
		System.out.println("***************************************************");


		System.out.println("O local possui banheiro inclusivo?");

		System.out.println("1. Sim");
		System.out.println("2. Não");
		System.out.print("Insira uma das opções: ");
		banheiro = entrada.next();
		while(!banheiro.equals("1") && !banheiro.equals("2")) {
			System.out.println("Insira uma das opções: ");
			banheiro = entrada.next();			
		}
		if(banheiro.equals("1")) {
			banheiro = "Possui banheiro inclusivo";
		} else {
			banheiro = "Não possui banheiro inclusivo";
		}
		System.out.println();
		System.out.println("***************************************************");

		System.out.println("A empresa faz palestras ou educa seus funcionários sobre inclusão?");
		System.out.println("1. Sim");
		System.out.println("2. Não");
		System.out.print("Insira uma das opções: ");
		palestra = entrada.next();
		while(!palestra.equals("1") && !palestra.equals("2")) {
			System.out.print("Insira uma das opções: ");
			palestra = entrada.next();
		}
		if(palestra.equals("1")) {
			palestra = "A empresa é inclusiva";
		} else {
			palestra = "A empresa não é inclusiva";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		
		System.out.println("O local possui acessibilidade para pessoas com deficiências "
				+ " físicas (rampa com corrimão ou elevador)?");

		System.out.println("1. Sim");
		System.out.println("2. Não");
		System.out.print("Insira uma das opções: ");
		acessibilidade = entrada.next();
		while(!acessibilidade.equals("1") && !acessibilidade.equals("2")) {
			System.out.print("Insira uma das opções:");
			acessibilidade = entrada.next();
		}
		if(acessibilidade.equals("1")) {
			acessibilidade = "Empresa é acessível a todes";
		} 
		else {
			acessibilidade = "Empresa não é acessível";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("O local possui acessibilidade para pessoas com deficiência visual?");

		System.out.println("1. Sim");
		System.out.println("2. Não");
		System.out.print("Insira uma das opções: ");
		inclusivaVisual = entrada.next();
		while(!inclusivaVisual.equals("1") && !inclusivaVisual.equals("2")) {
			System.out.print("Insira uma das opções: ");
			inclusivaVisual = entrada.next();
		}
		if(inclusivaVisual.equals("1")) {
			inclusivaVisual = "Empresa tem fácil acesso a pessoas com deficiência visual";
		} 
		else {
			inclusivaVisual = "Empresa tem difícil acesso a pessoas com deficiência visual";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Possui acessibilidade para pessoas com deficiência intelectual?");

		System.out.println("1. Sim");
		System.out.println("2. Não");
		System.out.print("Insira uma das opções:");
		inclusivaIntelectual = entrada.next();
		while(!inclusivaIntelectual.equals("1") && !inclusivaIntelectual.equals("2")) {
			System.out.print("Insira uma das opções: ");
			inclusivaIntelectual = entrada.next();
		}
		if(inclusivaIntelectual.equals("1")) {
			inclusivaIntelectual = "Empresa tem fácil acesso a pessoas com deficiência intelectual";
		} 
		else {
			inclusivaIntelectual = "Empresa tem difícil acesso a pessoas com deficiência intelectual";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Possui acessibilidade para pessoas com deficiência auditiva?");

		System.out.println("1. Sim");
		System.out.println("2. Não");
		System.out.print("Insira uma das opções: ");
		inclusivaAuditiva = entrada.next();
		while(!inclusivaAuditiva.equals("1") && !inclusivaAuditiva.equals("2")) {
			System.out.print("Insira uma das opções: ");
			inclusivaAuditiva = entrada.next();
		}
		if(inclusivaAuditiva.equals("1")) {
			inclusivaAuditiva = "Empresa tem fácil acesso a pessoas com deficiência auditiva";
		} 
		else {
			inclusivaAuditiva = "Empresa tem difícil acesso a pessoas com deficiência auditiva";
		}
			
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Possui acessibilidade para pessoas com deficiência física?");

		System.out.println("1. Sim");
		System.out.println("2. Não");
		System.out.print("Insira uma das opções: ");
		inclusivaFisica = entrada.next();
		while(!inclusivaFisica.equals("1") && !inclusivaFisica.equals("2")) {
			System.out.print("Insira uma das opções: ");
			inclusivaFisica = entrada.next();
		}
		if(inclusivaFisica.equals("1")) {
			inclusivaFisica = "Empresa tem fácil acesso a pessoas com deficiência auditiva";
		} 
		else {
			inclusivaFisica = "Empresa tem difícil acesso a pessoas com deficiência auditiva";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Você sofreu algum tipo de assédio?");

		System.out.println("1. Sim");
		System.out.println("2. Não");
		System.out.print("Insira uma das opções:");
		assedio = entrada.next();
		while(!assedio.equals("1") && !assedio.equals("2")) {
			System.out.print("Insira uma das opções: ");
			assedio = entrada.next();
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		if(assedio.equals("1")) {
			System.out.println("Que tipo de assédio? (digite somente se você se sentir confortável)");
			assedio = entrada.next();
			
		} else {
			assedio = "Não sofreu assédio";
		}
		if(assedio.equals("1")) {
			System.out.println();
			System.out.println("***************************************************");			
		}
		
		System.out.println("Você acha o ambiente inclusivo para pessoas LGBTQIA+?");
		System.out.println("1. Sim");
		System.out.println("2. Não");
		System.out.print("Insira uma das opções:");
		entrada.nextLine();
		
		ambienteInclusivo = entrada.next();
		while(!ambienteInclusivo.equals("1") && !ambienteInclusivo.equals("2")) {
			System.out.print("Insira uma das opções: ");
			ambienteInclusivo = entrada.next(); 
		}
		if (ambienteInclusivo.equals("1")) {
			ambienteInclusivo = "Ambiente inclusivo" ;
		}	else
			ambienteInclusivo = "Ambiente não inclusivo";
		
		System.out.println();
		System.out.println("***************************************************");System.out.println("***************************************************");
		
		System.out.println("0. Páginal Inicial");
		System.out.println("9. Salvar Avaliação");
		System.out.print("Insira uma das opções:");
		selecaoPagina = entrada.next();
		while(!selecaoPagina.equals("0") && !selecaoPagina.equals("9")) {
			System.out.print("Insira uma das opções: ");	
			selecaoPagina = entrada.next();
		}
		if (selecaoPagina.equals("0")) {
			paginainicial.inicial();
		}
		else {
			
			System.out.println();
			System.out.println("***************************************************");
			
			System.out.println("=============Sua avaliação foi salva!=============");
		}
		
		verListaEmpresa();
		
		entrada.close();
		
	}
		public void verListaEmpresa () throws InterruptedException {
		PaginaInicial paginainicial = new PaginaInicial();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Deseja ver: LISTA DE EMPRESAS");
		System.out.println("1. Sim");
		System.out.println("0. Página Inicial");
		System.out.print("Insira uma das opções:");
		selecaoPagina = entrada.next();
		while(!selecaoPagina.equals("1") && !selecaoPagina.equals("0")) {
			System.out.print("Insira uma das opções:");
			selecaoPagina = entrada.next();
		}
		if (selecaoPagina.equals("1")) {
			System.out.println();
			System.out.println("***************************************************");
			
			System.out.println("=============LISTA DE EMPRESAS=============");
		}
		else {
			System.out.println();
			System.out.println("***************************************************");
			
			System.out.println("=============PÁGINA INICIAL=============");	
			
			paginainicial.inicial();
			}
		entrada.close();
		
	}	
	

}


