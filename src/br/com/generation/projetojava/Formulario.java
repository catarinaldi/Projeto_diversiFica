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
		System.out.println("0. N�o | Voltar para a p�gina inicial ");
		System.out.print("Insira uma das op��es:");
		selecaoPagina2 = entrada.next();
		while(!selecaoPagina2.equals("1") && !selecaoPagina2.equals("0")) {
			System.out.print("Insira uma das op��es:");
			selecaoPagina2 = entrada.next();
		}
		
		if(selecaoPagina2.equals("0")) {
			paginainicial.inicial();
		}
		
		System.out.println("\n=============AVALIA��O DE EMPRESAS=============\n");
		System.out.println("Voc� trabalhou nessa empresa?");

		System.out.println("1. Sim");
		System.out.println("2. N�o");
		System.out.print("Insira uma das op��es:");
		empresa = entrada.next();
		while(!empresa.equals("1")  && !empresa.equals("2")) {
			System.out.println("Insira uma das op��es: ");
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
		
		System.out.println("Essa experi�ncia � sua?");
		System.out.println("1. Sim");
		System.out.println("2. N�o");

		System.out.print("Insira a op��o: ");
		experiencia = entrada.nextLine();
		while(!experiencia.equals("1") && !experiencia.equals("2")) {
			System.out.print("Insira uma das op��es: ");
			experiencia = entrada.next(); 
			}
		experiencia = "A experi�ncia � da pr�pria pessoa que est� fazendo avalia��o";
		System.out.println();
		System.out.println("***************************************************");
		if(experiencia.equals("2")) {
			experiencia = "";
			System.out.println("� de algu�m que voc� conhece?");
			System.out.println("1. Sim");
			System.out.println("2. N�o");
			System.out.print("Insira uma das op��es: ");
			experienciaDeoutra = entrada.next();
			while(!experienciaDeoutra.equals("1") && !experienciaDeoutra.equals("2")) {
				System.out.print("Insira uma das op��es: ");
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
		System.out.println("2. N�o");
		System.out.print("Insira uma das op��es: ");
		banheiro = entrada.next();
		while(!banheiro.equals("1") && !banheiro.equals("2")) {
			System.out.println("Insira uma das op��es: ");
			banheiro = entrada.next();			
		}
		if(banheiro.equals("1")) {
			banheiro = "Possui banheiro inclusivo";
		} else {
			banheiro = "N�o possui banheiro inclusivo";
		}
		System.out.println();
		System.out.println("***************************************************");

		System.out.println("A empresa faz palestras ou educa seus funcion�rios sobre inclus�o?");
		System.out.println("1. Sim");
		System.out.println("2. N�o");
		System.out.print("Insira uma das op��es: ");
		palestra = entrada.next();
		while(!palestra.equals("1") && !palestra.equals("2")) {
			System.out.print("Insira uma das op��es: ");
			palestra = entrada.next();
		}
		if(palestra.equals("1")) {
			palestra = "A empresa � inclusiva";
		} else {
			palestra = "A empresa n�o � inclusiva";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		
		System.out.println("O local possui acessibilidade para pessoas com defici�ncias "
				+ " f�sicas (rampa com corrim�o ou elevador)?");

		System.out.println("1. Sim");
		System.out.println("2. N�o");
		System.out.print("Insira uma das op��es: ");
		acessibilidade = entrada.next();
		while(!acessibilidade.equals("1") && !acessibilidade.equals("2")) {
			System.out.print("Insira uma das op��es:");
			acessibilidade = entrada.next();
		}
		if(acessibilidade.equals("1")) {
			acessibilidade = "Empresa � acess�vel a todes";
		} 
		else {
			acessibilidade = "Empresa n�o � acess�vel";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("O local possui acessibilidade para pessoas com defici�ncia visual?");

		System.out.println("1. Sim");
		System.out.println("2. N�o");
		System.out.print("Insira uma das op��es: ");
		inclusivaVisual = entrada.next();
		while(!inclusivaVisual.equals("1") && !inclusivaVisual.equals("2")) {
			System.out.print("Insira uma das op��es: ");
			inclusivaVisual = entrada.next();
		}
		if(inclusivaVisual.equals("1")) {
			inclusivaVisual = "Empresa tem f�cil acesso a pessoas com defici�ncia visual";
		} 
		else {
			inclusivaVisual = "Empresa tem dif�cil acesso a pessoas com defici�ncia visual";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Possui acessibilidade para pessoas com defici�ncia intelectual?");

		System.out.println("1. Sim");
		System.out.println("2. N�o");
		System.out.print("Insira uma das op��es:");
		inclusivaIntelectual = entrada.next();
		while(!inclusivaIntelectual.equals("1") && !inclusivaIntelectual.equals("2")) {
			System.out.print("Insira uma das op��es: ");
			inclusivaIntelectual = entrada.next();
		}
		if(inclusivaIntelectual.equals("1")) {
			inclusivaIntelectual = "Empresa tem f�cil acesso a pessoas com defici�ncia intelectual";
		} 
		else {
			inclusivaIntelectual = "Empresa tem dif�cil acesso a pessoas com defici�ncia intelectual";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Possui acessibilidade para pessoas com defici�ncia auditiva?");

		System.out.println("1. Sim");
		System.out.println("2. N�o");
		System.out.print("Insira uma das op��es: ");
		inclusivaAuditiva = entrada.next();
		while(!inclusivaAuditiva.equals("1") && !inclusivaAuditiva.equals("2")) {
			System.out.print("Insira uma das op��es: ");
			inclusivaAuditiva = entrada.next();
		}
		if(inclusivaAuditiva.equals("1")) {
			inclusivaAuditiva = "Empresa tem f�cil acesso a pessoas com defici�ncia auditiva";
		} 
		else {
			inclusivaAuditiva = "Empresa tem dif�cil acesso a pessoas com defici�ncia auditiva";
		}
			
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Possui acessibilidade para pessoas com defici�ncia f�sica?");

		System.out.println("1. Sim");
		System.out.println("2. N�o");
		System.out.print("Insira uma das op��es: ");
		inclusivaFisica = entrada.next();
		while(!inclusivaFisica.equals("1") && !inclusivaFisica.equals("2")) {
			System.out.print("Insira uma das op��es: ");
			inclusivaFisica = entrada.next();
		}
		if(inclusivaFisica.equals("1")) {
			inclusivaFisica = "Empresa tem f�cil acesso a pessoas com defici�ncia auditiva";
		} 
		else {
			inclusivaFisica = "Empresa tem dif�cil acesso a pessoas com defici�ncia auditiva";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Voc� sofreu algum tipo de ass�dio?");

		System.out.println("1. Sim");
		System.out.println("2. N�o");
		System.out.print("Insira uma das op��es:");
		assedio = entrada.next();
		while(!assedio.equals("1") && !assedio.equals("2")) {
			System.out.print("Insira uma das op��es: ");
			assedio = entrada.next();
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		if(assedio.equals("1")) {
			System.out.println("Que tipo de ass�dio? (digite somente se voc� se sentir confort�vel)");
			assedio = entrada.next();
			
		} else {
			assedio = "N�o sofreu ass�dio";
		}
		if(assedio.equals("1")) {
			System.out.println();
			System.out.println("***************************************************");			
		}
		
		System.out.println("Voc� acha o ambiente inclusivo para pessoas LGBTQIA+?");
		System.out.println("1. Sim");
		System.out.println("2. N�o");
		System.out.print("Insira uma das op��es:");
		entrada.nextLine();
		
		ambienteInclusivo = entrada.next();
		while(!ambienteInclusivo.equals("1") && !ambienteInclusivo.equals("2")) {
			System.out.print("Insira uma das op��es: ");
			ambienteInclusivo = entrada.next(); 
		}
		if (ambienteInclusivo.equals("1")) {
			ambienteInclusivo = "Ambiente inclusivo" ;
		}	else
			ambienteInclusivo = "Ambiente n�o inclusivo";
		
		System.out.println();
		System.out.println("***************************************************");System.out.println("***************************************************");
		
		System.out.println("0. P�ginal Inicial");
		System.out.println("9. Salvar Avalia��o");
		System.out.print("Insira uma das op��es:");
		selecaoPagina = entrada.next();
		while(!selecaoPagina.equals("0") && !selecaoPagina.equals("9")) {
			System.out.print("Insira uma das op��es: ");	
			selecaoPagina = entrada.next();
		}
		if (selecaoPagina.equals("0")) {
			paginainicial.inicial();
		}
		else {
			
			System.out.println();
			System.out.println("***************************************************");
			
			System.out.println("=============Sua avalia��o foi salva!=============");
		}
		
		verListaEmpresa();
		
		entrada.close();
		
	}
		public void verListaEmpresa () throws InterruptedException {
		PaginaInicial paginainicial = new PaginaInicial();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Deseja ver: LISTA DE EMPRESAS");
		System.out.println("1. Sim");
		System.out.println("0. P�gina Inicial");
		System.out.print("Insira uma das op��es:");
		selecaoPagina = entrada.next();
		while(!selecaoPagina.equals("1") && !selecaoPagina.equals("0")) {
			System.out.print("Insira uma das op��es:");
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
			
			System.out.println("=============P�GINA INICIAL=============");	
			
			paginainicial.inicial();
			}
		entrada.close();
		
	}	
	

}


