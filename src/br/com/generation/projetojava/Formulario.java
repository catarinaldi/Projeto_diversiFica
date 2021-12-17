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
	 
	
	
	public void avaliacaoentrada () {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Deseja avaliar a empresa ?");
		System.out.println("1 - Sim ");
		System.out.println("0 - N�o | Voltar para pagina inicial ");
		System.out.print("Insira uma das  op��o :");
		selecaoPagina2 = leia.next();
		while(!selecaoPagina2.equals("1") && !selecaoPagina2.equals("0")) {
			System.out.print("Insira uma das op��o :");
			selecaoPagina2 = leia.next();
		}
		
		if(selecaoPagina2.equals("0")) {
			System.out.println("*********** Pagina Inicial *************");
		}
		
		System.out.println("**********   Ol� voc� est� no campo de avalia��o   *************");
		System.out.println("\n");
		System.out.println("Voc� trabalhou na empresa?");

		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira uma das op��o :");
		empresa = leia.next();
		while(!empresa.equals("1")  && !empresa.equals("2")) {
			System.out.println("Insira uma das op��o :");
			empresa = leia.next();			
		}
		if (empresa.equals("1")) {
			System.out.print("Nome da empresa trabalhada: ");
			empresaTrabalhada = leia.next();
			System.out.print("Quanto tempo trabalhou no local: ");
			tempoTrabalhado = leia.next();
		}
		System.out.println();
		System.out.println("***************************************************");
		leia.nextLine();
		
		System.out.println("Essa experi�ncia � sua ?");
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");

		System.out.print("Insira a op��o :");
		experiencia = leia.nextLine();
		while(!experiencia.equals("1") && !experiencia.equals("2")) {
			System.out.print("Insira uma das op��o :");
			experiencia = leia.next(); 
			}
		experiencia = "A experi�ncia � da pr�pria pessoa que est� fazendo avalia��o";
		System.out.println();
		System.out.println("***************************************************");
		if(experiencia.equals("2")) {
			experiencia = "";
			System.out.println("� de alguem que voc� conhece ?");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			System.out.print("Insira uma das op��o :");
			experienciaDeoutra = leia.next();
			while(!experienciaDeoutra.equals("1") && !experienciaDeoutra.equals("2")) {
				System.out.print("Insira uma das op��o :");
				experienciaDeoutra = leia.next(); 
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

		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira uma das op��o :");
		banheiro = leia.next();
		while(!banheiro.equals("1") && !banheiro.equals("2")) {
			System.out.println("Insira uma das op��o :");
			banheiro = leia.next();			
		}
		if(banheiro.equals("1")) {
			banheiro = "Possui banheiro";
		} else {
			banheiro = "N�o possui banheiro";
		}
		System.out.println();
		System.out.println("***************************************************");

		System.out.println("A empresa faz palestra ou educa seus funcionarios sobre inclus�o?");
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira uma das op��o :");
		palestra = leia.next();
		while(!palestra.equals("1") && !palestra.equals("2")) {
			System.out.print("Insira uma das op��o :");
			palestra = leia.next();
		}
		if(palestra.equals("1")) {
			palestra = "A empresa � inclusiva";
		} else {
			palestra = "A empresa n�o � inclusiva";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		
		System.out.println("O local possui acessibilidade para pessoas com defici�ncias "
				+ " f�sicas de mobilidade? rampa? elevador? corrim�o, acesso a todos os locais (incluindo banheiro) com cadeiras de rodas?");

		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira uma das op��o :");
		acessibilidade = leia.next();
		while(!acessibilidade.equals("1") && !acessibilidade.equals("2")) {
			System.out.print("Insira uma das op��o :");
			acessibilidade = leia.next();
		}
		if(acessibilidade.equals("1")) {
			acessibilidade = "Empresa � acess�vel a todos";
		} 
		else {
			acessibilidade = "Empresa n�o � acess�vel";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("O local possui acessibilidade para pessoas com defici�ncia visual?");

		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira uma das op��o :");
		inclusivaVisual = leia.next();
		while(!inclusivaVisual.equals("1") && !inclusivaVisual.equals("2")) {
			System.out.print("Insira uma das op��o :");
			inclusivaVisual = leia.next();
		}
		if(inclusivaVisual.equals("1")) {
			inclusivaVisual = "Empresa tem facil acesso a pessoas com defici�ncia visual";
		} 
		else {
			inclusivaVisual = "Empresa tem dif�cil acesso a pessoas com defici�ncia visual";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Possui acessibilidade para pessoas com defici�ncia intelectual?");

		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira uma das op��o :");
		inclusivaIntelectual = leia.next();
		while(!inclusivaIntelectual.equals("1") && !inclusivaIntelectual.equals("2")) {
			System.out.print("Insira uma das op��o :");
			inclusivaIntelectual = leia.next();
		}
		if(inclusivaIntelectual.equals("1")) {
			inclusivaIntelectual = "Empresa tem facil acesso a pessoas com defici�ncia Intelectual";
		} 
		else {
			inclusivaIntelectual = "Empresa tem dif�cil acesso a pessoas com defici�ncia Intelectual";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Possui acessibilidade para pessoas com defici�ncia auditiva?");

		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira uma das op��o :");
		inclusivaAuditiva = leia.next();
		while(!inclusivaAuditiva.equals("1") && !inclusivaAuditiva.equals("2")) {
			System.out.print("Insira uma das op��o :");
			inclusivaAuditiva = leia.next();
		}
		if(inclusivaAuditiva.equals("1")) {
			inclusivaAuditiva = "Empresa tem facil acesso a pessoas com defici�ncia auditiva";
		} 
		else {
			inclusivaAuditiva = "Empresa tem dif�cil acesso a pessoas com defici�ncia auditiva";
		}
			
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Possui acessibilidade para pessoas com defici�ncia f�sica?");

		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira uma das op��o :");
		inclusivaFisica = leia.next();
		while(!inclusivaFisica.equals("1") && !inclusivaFisica.equals("2")) {
			System.out.print("Insira uma das op��o :");
			inclusivaFisica = leia.next();
		}
		if(inclusivaFisica.equals("1")) {
			inclusivaFisica = "Empresa tem facil acesso a pessoas com defici�ncia auditiva";
		} 
		else {
			inclusivaFisica = "Empresa tem dif�cil acesso a pessoas com defici�ncia auditiva";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Voc� sofreu algum tipo de ass�dio?");

		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira uma das op��o :");
		assedio = leia.next();
		while(!assedio.equals("1") && !assedio.equals("2")) {
			System.out.print("Insira uma das op��o :");
			assedio = leia.next();
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		if(assedio.equals("1")) {
			System.out.println("Que tipo de ass�dio ?");
			assedio = leia.next();
			
		} else {
			assedio = "N�o sofreu ass�dio";
		}
		if(assedio.equals("1")) {
			System.out.println();
			System.out.println("***************************************************");			
		}
		
		System.out.println("Voc� acha o ambiente inclusivo para pessoas LGBTQIA+?");
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira uma das op��o :");
		leia.nextLine();
		
		ambienteInclusivo = leia.next();
		while(!ambienteInclusivo.equals("1") && !ambienteInclusivo.equals("2")) {
			System.out.print("Insira uma das op��o :");
			ambienteInclusivo = leia.next(); 
		}
		if (ambienteInclusivo.equals("1")) {
			ambienteInclusivo = "Ambiente inclusivo" ;
		}	else
			ambienteInclusivo = "Ambiente n�o inclusivo";
		
		System.out.println();
		System.out.println("***************************************************");System.out.println("***************************************************");
		
		System.out.println("0 - Paginal Inicial");
		System.out.println("9- Salvar Avalia��o");
		System.out.print("Insira uma das op��o :");
		selecaoPagina = leia.next();
		while(!selecaoPagina.equals("0") && !selecaoPagina.equals("9")) {
			System.out.print("Insira uma das op��o :");	
			selecaoPagina = leia.next();
		}
		if (selecaoPagina.equals("0")) {
			
			System.out.println();
			System.out.println("***************************************************");
			
			System.out.println("*********   PAGINA INICIAL   ***********");
		}
		else {
			
			System.out.println();
			System.out.println("***************************************************");
			
			System.out.println("********   Sua Avalia��o foi salva  **********");
		}
		
		verListaEmpresa();
		
		leia.close();
		
	}
		public void verListaEmpresa () {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Deseja ver LISTA DE EMPRESAS");
		System.out.println("1 - Sim");
		System.out.println("0 - Pagina Inicial");
		System.out.print("Insira uma das op��o :");
		selecaoPagina = leia.next();
		while(!selecaoPagina.equals("1") && !selecaoPagina.equals("0")) {
			System.out.print("Insira uma das op��o :");
			selecaoPagina = leia.next();
		}
		if (selecaoPagina.equals("1")) {
			System.out.println();
			System.out.println("***************************************************");
			
			System.out.println("**********  LISTA DE EMPRESA ***************");
		}
		else {
			System.out.println();
			System.out.println("***************************************************");
			
			System.out.println("*********   PAGINA INICIAL   ***********");	
			}
		leia.close();
		
	}	
	

}


