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
		System.out.println("0 - Não | Voltar para pagina inicial ");
		System.out.print("Insira uma das  opção :");
		selecaoPagina2 = leia.next();
		while(!selecaoPagina2.equals("1") && !selecaoPagina2.equals("0")) {
			System.out.print("Insira uma das opção :");
			selecaoPagina2 = leia.next();
		}
		
		if(selecaoPagina2.equals("0")) {
			System.out.println("*********** Pagina Inicial *************");
		}
		
		System.out.println("**********   Olá você está no campo de avaliação   *************");
		System.out.println("\n");
		System.out.println("Você trabalhou na empresa?");

		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira uma das opção :");
		empresa = leia.next();
		while(!empresa.equals("1")  && !empresa.equals("2")) {
			System.out.println("Insira uma das opção :");
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
		
		System.out.println("Essa experiência é sua ?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");

		System.out.print("Insira a opção :");
		experiencia = leia.nextLine();
		while(!experiencia.equals("1") && !experiencia.equals("2")) {
			System.out.print("Insira uma das opção :");
			experiencia = leia.next(); 
			}
		experiencia = "A experiência é da própria pessoa que está fazendo avaliação";
		System.out.println();
		System.out.println("***************************************************");
		if(experiencia.equals("2")) {
			experiencia = "";
			System.out.println("É de alguem que você conhece ?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			System.out.print("Insira uma das opção :");
			experienciaDeoutra = leia.next();
			while(!experienciaDeoutra.equals("1") && !experienciaDeoutra.equals("2")) {
				System.out.print("Insira uma das opção :");
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
		System.out.println("2 - Não");
		System.out.print("Insira uma das opção :");
		banheiro = leia.next();
		while(!banheiro.equals("1") && !banheiro.equals("2")) {
			System.out.println("Insira uma das opção :");
			banheiro = leia.next();			
		}
		if(banheiro.equals("1")) {
			banheiro = "Possui banheiro";
		} else {
			banheiro = "Não possui banheiro";
		}
		System.out.println();
		System.out.println("***************************************************");

		System.out.println("A empresa faz palestra ou educa seus funcionarios sobre inclusão?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira uma das opção :");
		palestra = leia.next();
		while(!palestra.equals("1") && !palestra.equals("2")) {
			System.out.print("Insira uma das opção :");
			palestra = leia.next();
		}
		if(palestra.equals("1")) {
			palestra = "A empresa é inclusiva";
		} else {
			palestra = "A empresa não é inclusiva";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		
		System.out.println("O local possui acessibilidade para pessoas com deficiências "
				+ " físicas de mobilidade? rampa? elevador? corrimão, acesso a todos os locais (incluindo banheiro) com cadeiras de rodas?");

		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira uma das opção :");
		acessibilidade = leia.next();
		while(!acessibilidade.equals("1") && !acessibilidade.equals("2")) {
			System.out.print("Insira uma das opção :");
			acessibilidade = leia.next();
		}
		if(acessibilidade.equals("1")) {
			acessibilidade = "Empresa é acessível a todos";
		} 
		else {
			acessibilidade = "Empresa não é acessível";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("O local possui acessibilidade para pessoas com deficiência visual?");

		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira uma das opção :");
		inclusivaVisual = leia.next();
		while(!inclusivaVisual.equals("1") && !inclusivaVisual.equals("2")) {
			System.out.print("Insira uma das opção :");
			inclusivaVisual = leia.next();
		}
		if(inclusivaVisual.equals("1")) {
			inclusivaVisual = "Empresa tem facil acesso a pessoas com deficiência visual";
		} 
		else {
			inclusivaVisual = "Empresa tem difícil acesso a pessoas com deficiência visual";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Possui acessibilidade para pessoas com deficiência intelectual?");

		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira uma das opção :");
		inclusivaIntelectual = leia.next();
		while(!inclusivaIntelectual.equals("1") && !inclusivaIntelectual.equals("2")) {
			System.out.print("Insira uma das opção :");
			inclusivaIntelectual = leia.next();
		}
		if(inclusivaIntelectual.equals("1")) {
			inclusivaIntelectual = "Empresa tem facil acesso a pessoas com deficiência Intelectual";
		} 
		else {
			inclusivaIntelectual = "Empresa tem difícil acesso a pessoas com deficiência Intelectual";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Possui acessibilidade para pessoas com deficiência auditiva?");

		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira uma das opção :");
		inclusivaAuditiva = leia.next();
		while(!inclusivaAuditiva.equals("1") && !inclusivaAuditiva.equals("2")) {
			System.out.print("Insira uma das opção :");
			inclusivaAuditiva = leia.next();
		}
		if(inclusivaAuditiva.equals("1")) {
			inclusivaAuditiva = "Empresa tem facil acesso a pessoas com deficiência auditiva";
		} 
		else {
			inclusivaAuditiva = "Empresa tem difícil acesso a pessoas com deficiência auditiva";
		}
			
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Possui acessibilidade para pessoas com deficiência física?");

		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira uma das opção :");
		inclusivaFisica = leia.next();
		while(!inclusivaFisica.equals("1") && !inclusivaFisica.equals("2")) {
			System.out.print("Insira uma das opção :");
			inclusivaFisica = leia.next();
		}
		if(inclusivaFisica.equals("1")) {
			inclusivaFisica = "Empresa tem facil acesso a pessoas com deficiência auditiva";
		} 
		else {
			inclusivaFisica = "Empresa tem difícil acesso a pessoas com deficiência auditiva";
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		System.out.println("Você sofreu algum tipo de assédio?");

		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira uma das opção :");
		assedio = leia.next();
		while(!assedio.equals("1") && !assedio.equals("2")) {
			System.out.print("Insira uma das opção :");
			assedio = leia.next();
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		if(assedio.equals("1")) {
			System.out.println("Que tipo de assédio ?");
			assedio = leia.next();
			
		} else {
			assedio = "Não sofreu assédio";
		}
		if(assedio.equals("1")) {
			System.out.println();
			System.out.println("***************************************************");			
		}
		
		System.out.println("Você acha o ambiente inclusivo para pessoas LGBTQIA+?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira uma das opção :");
		leia.nextLine();
		
		ambienteInclusivo = leia.next();
		while(!ambienteInclusivo.equals("1") && !ambienteInclusivo.equals("2")) {
			System.out.print("Insira uma das opção :");
			ambienteInclusivo = leia.next(); 
		}
		if (ambienteInclusivo.equals("1")) {
			ambienteInclusivo = "Ambiente inclusivo" ;
		}	else
			ambienteInclusivo = "Ambiente não inclusivo";
		
		System.out.println();
		System.out.println("***************************************************");System.out.println("***************************************************");
		
		System.out.println("0 - Paginal Inicial");
		System.out.println("9- Salvar Avaliação");
		System.out.print("Insira uma das opção :");
		selecaoPagina = leia.next();
		while(!selecaoPagina.equals("0") && !selecaoPagina.equals("9")) {
			System.out.print("Insira uma das opção :");	
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
			
			System.out.println("********   Sua Avaliação foi salva  **********");
		}
		
		verListaEmpresa();
		
		leia.close();
		
	}
		public void verListaEmpresa () {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Deseja ver LISTA DE EMPRESAS");
		System.out.println("1 - Sim");
		System.out.println("0 - Pagina Inicial");
		System.out.print("Insira uma das opção :");
		selecaoPagina = leia.next();
		while(!selecaoPagina.equals("1") && !selecaoPagina.equals("0")) {
			System.out.print("Insira uma das opção :");
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


