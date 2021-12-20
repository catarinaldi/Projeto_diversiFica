package br.com.generation.projetojava;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaDados {

	public void listaEmpresas() throws InterruptedException {
		PaginaInicial paginainicial = new PaginaInicial();
		
		Dados empresa1 = new Dados("Empresa Unic�rnio", "Cuidador Sr.", 09.00, 17.00, 5600.00, "LGBTQIA+; Equidade de g�nero (transg�nero); �tnico-racial");
		Dados empresa2 = new Dados("F�brica do Noel", "Ajudante de caixa", 05.00, 12.00, 4100.00, "�tnico-racial; Equidade de g�nero (mulher cis)");
		Dados empresa3 = new Dados("Empresa Elemento X", "T�cnico de laborat�rio Pl.", 22.00, 06.00, 4500.00, "PCD (f�sico); PCD (auditivo e visual); LGBTQIA+");
		Dados empresa4 = new Dados("F�brica do Willy Wonka", "Designer de produtos dourados", 06.00, 12.00, 4800.00, "Equidade de g�nero (mulher cis); Equidade de g�nero (transg�nero); �tnico-racial");
		Dados empresa5 = new Dados("Empresa Era uma vez..", "Contador de hist�rias Jr.", 10.00, 18.00, 3800.00, "PCD (auditivo e visual); PCD (intelectual); LGBTQIA+");
		
		ArrayList<Dados> dadosEmpresa = new ArrayList<>();
		dadosEmpresa.add(empresa1);
		dadosEmpresa.add(empresa2);
		dadosEmpresa.add(empresa3);
		dadosEmpresa.add(empresa4);
		dadosEmpresa.add(empresa5);
		
		System.out.println("\n=================== LISTA DE EMPRESAS: ===================\n");
		
		for (int i = 0; i < dadosEmpresa.size(); i++) {
			System.out.println("** EMPRESA " + (i+1) + " **");
			System.out.println(dadosEmpresa.get(i));
			System.out.println("");
		}
		
		filtrarLista();
	}
	
	public void filtrarLista() throws InterruptedException {
		PaginaInicial paginainicial = new PaginaInicial();

		Scanner entrada = new Scanner(System.in);
		int filtro;
		
		System.out.println("=========================================================");
		System.out.println("Filtrar a lista por:");
		System.out.println("1. �cones de inclus�o | 2. Sal�rio | 3. N�o filtrar | 0. P�gina inicial");
		filtro = entrada.nextInt();
		
		while (filtro != 1 && filtro != 2 && filtro != 3 && filtro != 0) {
			System.out.println("\nOp��o inv�lida!");
			System.out.println("Filtrar a lista por:");
			System.out.println("1. �cones de inclus�o | 2. Sal�rio | 3. N�o filtrar | 0. P�gina inicial");
			filtro = entrada.nextInt();
		} 
		
		if (filtro == 1) {
			System.out.println("\n============== Filtro por �cone selecionado ==============");
			filtrarIcones();
		} else if (filtro == 2) {
			System.out.println("\n============== Filtro por Sal�rio selecionado ==============");
			filtrarSalario();
		} else if (filtro == 3) {
			System.out.println("\n=============== Nenhum filtro selecionado ===============");
			enviarCurriculo();
		} else {
			paginainicial.inicial();

		}
	}
	
	public void filtrarIcones() throws InterruptedException {
		PaginaInicial paginainicial = new PaginaInicial();

		Scanner entrada = new Scanner(System.in);
		int filtro;
		
		Dados empresa1 = new Dados("Empresa Unic�rnio", "Cuidador Sr.", 09.00, 17.00, 5600.00, "LGBTQIA+; Equidade de g�nero (transg�nero); �tnico-racial;");
		Dados empresa2 = new Dados("F�brica do Noel", "Ajudante de caixa", 05.00, 12.00, 4100.00, "�tnico-racial; Equidade de g�nero (mulher cis)");
		Dados empresa3 = new Dados("Empresa Elemento X", "T�cnico de laborat�rio Pl.", 22.00, 06.00, 4500.00, "PCD (f�sico); PCD (auditivo e visual); LGBTQIA+");
		Dados empresa4 = new Dados("F�brica do Willy Wonka", "Designer de produtos dourados", 06.00, 12.00, 4800.00, "Equidade de g�nero (mulher cis); Equidade de g�nero (transg�nero); �tnico-racial");
		Dados empresa5 = new Dados("Empresa Era uma vez..", "Contador de hist�rias Jr.", 10.00, 18.00, 3800.00, "PCD (auditivo e visual); PCD (intelectual); LGBTQIA+");
		
		ArrayList<Dados> dadosEmpresa = new ArrayList<>();
		dadosEmpresa.add(empresa1);
		dadosEmpresa.add(empresa2);
		dadosEmpresa.add(empresa3);
		dadosEmpresa.add(empresa4);
		dadosEmpresa.add(empresa5);
		
		System.out.println("\nSelecione o �cone de inclus�o:");
		System.out.println("1. LGBTQIA+ | 2. Equidade de g�nero (transg�nero) | 3. Equidade de g�nero (mulher cis) |"
				+ " 4. �tnico-racial | 5. PCD (f�sico) | 6. PCD (auditivo e visual) |"
				+ " 7. PCD (intelectual) | 8. Voltar | 0. P�gina inicial");
		filtro = entrada.nextInt();
		
		
		while (filtro != 1 && filtro != 2 && filtro != 3 && filtro != 4 && filtro != 5 && 
				filtro != 6 && filtro != 7 && filtro != 8 && filtro != 0) {
			System.out.println("\nOp��o inv�lida!");
			System.out.println("Selecione o �cone de inclus�o:");
			System.out.println("1. LGBTQIA+ | 2. Equidade de g�nero (transg�nero) | 3. Equidade de g�nero (mulher cis) |"
					+ " 4. �tnico-racial | 5. PCD (f�sico) | 6. PCD (auditivo e visual) |"
					+ " 7. PCD (intelectual) | 8. Voltar | 0. P�gina inicial");
			filtro = entrada.nextInt();
		}
		
		if (filtro == 1) {
			System.out.println("\n======= Mostrando empresas com filtro LGBTQIA+: =======");
			System.out.println("\n** EMPRESA 1 **");
			System.out.println(dadosEmpresa.get(0));
			System.out.println("\n** EMPRESA 3 **");
			System.out.println(dadosEmpresa.get(2));
			System.out.println("\n** EMPRESA 5 **");
			System.out.println(dadosEmpresa.get(4));
			enviarCurriculo();
		} else if (filtro == 2) {
			System.out.println("\n======= Mostrando empresas com filtro Equidade de g�nero (transg�nero): =======");
			System.out.println("\n** EMPRESA 1 **");
			System.out.println(dadosEmpresa.get(0));
			System.out.println("\n** EMPRESA 4 **");
			System.out.println(dadosEmpresa.get(3));
			enviarCurriculo();
		} else if (filtro == 3) {
			System.out.println("\n======= Mostrando empresas com filtro Equidade de g�nero (mulher cis): =======");
			System.out.println("\n** EMPRESA 2 **");
			System.out.println(dadosEmpresa.get(1));
			System.out.println("\n** EMPRESA 4 **");
			System.out.println(dadosEmpresa.get(3));
			enviarCurriculo();
		} else if (filtro == 4) {
			System.out.println("\n======= Mostrando empresas com filtro �tnico-racial: =======");
			System.out.println("\n** EMPRESA 1 **");
			System.out.println(dadosEmpresa.get(0));
			System.out.println("\n** EMPRESA 2 **");
			System.out.println(dadosEmpresa.get(1));
			System.out.println("\n** EMPRESA 4 **");
			System.out.println(dadosEmpresa.get(3));
			enviarCurriculo();
		} else if (filtro == 5) {
			System.out.println("\n======= Mostrando empresas com filtro PCD (f�sico): =======");
			System.out.println("\n** EMPRESA 3 **");
			System.out.println(dadosEmpresa.get(2));
			enviarCurriculo();
		} else if (filtro == 6) {
			System.out.println("\n======= Mostrando empresas com filtro PCD (auditivo e visual): =======");
			System.out.println("\n** EMPRESA 3 **");
			System.out.println(dadosEmpresa.get(2));
			System.out.println("\n** EMPRESA 5 **");
			System.out.println(dadosEmpresa.get(4));
			enviarCurriculo();
		} else if (filtro == 7) {
			System.out.println("\n======= Mostrando empresas com filtro PCD (intelectual): =======");
			System.out.println("\n** EMPRESA 5 **");
			System.out.println(dadosEmpresa.get(4));
			enviarCurriculo();
		} else if (filtro == 8) {
			listaEmpresas();
		} else {
			paginainicial.inicial();

		}
	}
	
	public void enviarCurriculo() throws InterruptedException {
		PaginaInicial paginainicial = new PaginaInicial();

		Scanner entrada = new Scanner(System.in);
		int filtro;
		int selecionar;
		
		System.out.println("\n============== Voc� gostaria de: ==============");
		System.out.println("1. Enviar curr�culo | 2. Voltar para lista de empresas | 0. Ir para P�gina Inicial");
		filtro = entrada.nextInt();
		
		while(filtro != 1 && filtro != 2 && filtro != 0) {
			System.out.println("\nOp��o inv�lida!");
			System.out.println("Voc� gostaria de:");
			System.out.println("1. Enviar curr�culo | 2. Voltar para lista de empresas | 0. Ir para p�gina Inicial");
			filtro = entrada.nextInt();
		}
		if (filtro == 1) {
			System.out.println("\nCurr�culo enviado com sucesso para estas empresas!");
			System.out.println("Voc� gostaria de:");
			System.out.println("1. Voltar para lista de empresas | 0. Ir para p�gina inicial");
			selecionar = entrada.nextInt();
				
			while (selecionar != 1 && selecionar != 0) {
				System.out.println("\nOp��o inv�lida!");
				System.out.println("Voc� gostaria de:");
				System.out.println("1. Voltar para lista de empresas | 0. Ir para p�gina inicial");
				selecionar = entrada.nextInt();
			}
			if (selecionar == 1) {
				listaEmpresas();
			} else {
				paginainicial.inicial();

			}
		} else if (filtro == 2) {
			listaEmpresas();
		} else {
			paginainicial.inicial();

		}
	}
	
	public void filtrarSalario() throws InterruptedException {
		PaginaInicial paginainicial = new PaginaInicial();

		Scanner entrada = new Scanner(System.in);
		int filtro;
		int filtro2;
		
		Dados empresa1 = new Dados("Empresa Unic�rnio", "Cuidador Sr.", 09.00, 17.00, 5600.00, "LGBTQIA+; Equidade de g�nero (transg�nero); �tnico-racial;");
		Dados empresa2 = new Dados("F�brica do Noel", "Ajudante de caixa", 05.00, 12.00, 4100.00, "�tnico-racial; Equidade de g�nero (mulher cis)");
		Dados empresa3 = new Dados("Empresa Elemento X", "T�cnico de laborat�rio Pl.", 22.00, 06.00, 4500.00, "PCD (f�sico); PCD (auditivo e visual); LGBTQIA+");
		Dados empresa4 = new Dados("F�brica do Willy Wonka", "Designer de produtos dourados", 06.00, 12.00, 4800.00, "Equidade de g�nero (mulher cis); Equidade de g�nero (transg�nero); �tnico-racial");
		Dados empresa5 = new Dados("Empresa Era uma vez..", "Contador de hist�rias Jr.", 10.00, 18.00, 3800.00, "PCD (auditivo e visual); PCD (intelectual); LGBTQIA+");
		
		ArrayList<Dados> dadosEmpresa = new ArrayList<>();
		dadosEmpresa.add(empresa1);
		dadosEmpresa.add(empresa2);
		dadosEmpresa.add(empresa3);
		dadosEmpresa.add(empresa4);
		dadosEmpresa.add(empresa5);
		
		System.out.println("\nFiltrar sal�rios acima de:");
		System.out.println("1. R$ 1000,00 | 2. R$ 2000,00 | 3. R$ 3000,00 | 4. R$ 4000,00 | 5. R$ 5000,00 |"
				+ " 6. R$ 6000,00 | 0. P�gina inicial");
		filtro = entrada.nextInt();
		
		while (filtro != 1 && filtro != 2 && filtro != 3 && filtro != 4 && filtro != 5 && 
				filtro != 6 && filtro != 0) {
			System.out.println("\nOp��o inv�lida!");
			System.out.println("Filtrar sal�rios acima de:");
			System.out.println("1. R$ 1000,00 | 2. R$ 2000,00 | 3. R$ 3000,00 | 4. R$ 4000,00 | 5. R$ 5000,00 |"
					+ " 6. R$ 6000,00 | 0. P�gina inicial");
			filtro = entrada.nextInt();
		}
		if (filtro == 1) {
			System.out.println("\n======= Mostrando empresas com sal�rio acima de R$ 1000,00: =======");
			System.out.println("\n** EMPRESA 1 **");
			System.out.println(dadosEmpresa.get(0));
			System.out.println("\n** EMPRESA 2 **");
			System.out.println(dadosEmpresa.get(1));
			System.out.println("\n** EMPRESA 3 **");
			System.out.println(dadosEmpresa.get(2));
			System.out.println("\n** EMPRESA 4 **");
			System.out.println(dadosEmpresa.get(3));
			System.out.println("\n** EMPRESA 5 **");
			System.out.println(dadosEmpresa.get(4));
			enviarCurriculo();
		} else if (filtro == 2) {
			System.out.println("\n======= Mostrando empresas com sal�rio acima de R$ 2000,00: =======");
			System.out.println("\n** EMPRESA 1 **");
			System.out.println(dadosEmpresa.get(0));
			System.out.println("\n** EMPRESA 2 **");
			System.out.println(dadosEmpresa.get(1));
			System.out.println("\n** EMPRESA 3 **");
			System.out.println(dadosEmpresa.get(2));
			System.out.println("\n** EMPRESA 4 **");
			System.out.println(dadosEmpresa.get(3));
			System.out.println("\n** EMPRESA 5 **");
			System.out.println(dadosEmpresa.get(4));
			enviarCurriculo();
		} else if (filtro == 3) {
			System.out.println("\n======= Mostrando empresas com sal�rio acima de R$ 3000,00: =======");
			System.out.println("\n** EMPRESA 1 **");
			System.out.println(dadosEmpresa.get(0));
			System.out.println("\n** EMPRESA 2 **");
			System.out.println(dadosEmpresa.get(1));
			System.out.println("\n** EMPRESA 3 **");
			System.out.println(dadosEmpresa.get(2));
			System.out.println("\n** EMPRESA 4 **");
			System.out.println(dadosEmpresa.get(3));
			System.out.println("\n** EMPRESA 5 **");
			System.out.println(dadosEmpresa.get(4));
			enviarCurriculo();
		} else if (filtro == 4) {
			System.out.println("\n======= Mostrando empresas com sal�rio acima de R$ 4000,00: =======");
			System.out.println("\n** EMPRESA 1 **");
			System.out.println(dadosEmpresa.get(0));
			System.out.println("\n** EMPRESA 2 **");
			System.out.println(dadosEmpresa.get(1));
			System.out.println("\n** EMPRESA 3 **");
			System.out.println(dadosEmpresa.get(2));
			System.out.println("\n** EMPRESA 4 **");
			System.out.println(dadosEmpresa.get(3));
			enviarCurriculo();
		} else if (filtro == 5) {
			System.out.println("\n======= Mostrando empresas com sal�rio acima de R$ 5000,00: =======");
			System.out.println("\n** EMPRESA 1 **");
			System.out.println(dadosEmpresa.get(0));
			enviarCurriculo();
		} else if (filtro == 6) {
			System.out.println("\n======= Mostrando empresas com sal�rio acima de R$ 6000,00: =======");
			System.out.println("\nNenhum resultado para a pesquisa!");
			System.out.println("Voc� gostaria de:");
			System.out.println("1. Voltar para a lista de empresas | 0. Voltar para a p�gina inicial");
			filtro2 = entrada.nextInt();
			while (filtro2 != 1 && filtro2 != 0) {
				System.out.println("\nOp��o inv�lida!");
				System.out.println("Voc� gostaria de:");
				System.out.println("1. Voltar para a lista de empresas | 0. Voltar para a p�gina inicial");
				filtro2 = entrada.nextInt();
			}
			if (filtro2 == 1) {
				listaEmpresas();
			} else {
				paginainicial.inicial();
			}
		}
		
	}

}
