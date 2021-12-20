package br.com.generation.projetojava;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaDados {

	public void listaEmpresas() throws InterruptedException {
		PaginaInicial paginainicial = new PaginaInicial();
		
		Dados empresa1 = new Dados("Empresa Unicórnio", "Cuidador Sr.", 09.00, 17.00, 5600.00, "LGBTQIA+; Equidade de gênero (transgênero); Étnico-racial");
		Dados empresa2 = new Dados("Fábrica do Noel", "Ajudante de caixa", 05.00, 12.00, 4100.00, "Étnico-racial; Equidade de gênero (mulher cis)");
		Dados empresa3 = new Dados("Empresa Elemento X", "Técnico de laboratório Pl.", 22.00, 06.00, 4500.00, "PCD (físico); PCD (auditivo e visual); LGBTQIA+");
		Dados empresa4 = new Dados("Fábrica do Willy Wonka", "Designer de produtos dourados", 06.00, 12.00, 4800.00, "Equidade de gênero (mulher cis); Equidade de gênero (transgênero); Étnico-racial");
		Dados empresa5 = new Dados("Empresa Era uma vez..", "Contador de histórias Jr.", 10.00, 18.00, 3800.00, "PCD (auditivo e visual); PCD (intelectual); LGBTQIA+");
		
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
		System.out.println("1. Ícones de inclusão | 2. Salário | 3. Não filtrar | 0. Página inicial");
		filtro = entrada.nextInt();
		
		while (filtro != 1 && filtro != 2 && filtro != 3 && filtro != 0) {
			System.out.println("\nOpção inválida!");
			System.out.println("Filtrar a lista por:");
			System.out.println("1. Ícones de inclusão | 2. Salário | 3. Não filtrar | 0. Página inicial");
			filtro = entrada.nextInt();
		} 
		
		if (filtro == 1) {
			System.out.println("\n============== Filtro por Ícone selecionado ==============");
			filtrarIcones();
		} else if (filtro == 2) {
			System.out.println("\n============== Filtro por Salário selecionado ==============");
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
		
		Dados empresa1 = new Dados("Empresa Unicórnio", "Cuidador Sr.", 09.00, 17.00, 5600.00, "LGBTQIA+; Equidade de gênero (transgênero); Étnico-racial;");
		Dados empresa2 = new Dados("Fábrica do Noel", "Ajudante de caixa", 05.00, 12.00, 4100.00, "Étnico-racial; Equidade de gênero (mulher cis)");
		Dados empresa3 = new Dados("Empresa Elemento X", "Técnico de laboratório Pl.", 22.00, 06.00, 4500.00, "PCD (físico); PCD (auditivo e visual); LGBTQIA+");
		Dados empresa4 = new Dados("Fábrica do Willy Wonka", "Designer de produtos dourados", 06.00, 12.00, 4800.00, "Equidade de gênero (mulher cis); Equidade de gênero (transgênero); Étnico-racial");
		Dados empresa5 = new Dados("Empresa Era uma vez..", "Contador de histórias Jr.", 10.00, 18.00, 3800.00, "PCD (auditivo e visual); PCD (intelectual); LGBTQIA+");
		
		ArrayList<Dados> dadosEmpresa = new ArrayList<>();
		dadosEmpresa.add(empresa1);
		dadosEmpresa.add(empresa2);
		dadosEmpresa.add(empresa3);
		dadosEmpresa.add(empresa4);
		dadosEmpresa.add(empresa5);
		
		System.out.println("\nSelecione o ícone de inclusão:");
		System.out.println("1. LGBTQIA+ | 2. Equidade de gênero (transgênero) | 3. Equidade de gênero (mulher cis) |"
				+ " 4. Étnico-racial | 5. PCD (físico) | 6. PCD (auditivo e visual) |"
				+ " 7. PCD (intelectual) | 8. Voltar | 0. Página inicial");
		filtro = entrada.nextInt();
		
		
		while (filtro != 1 && filtro != 2 && filtro != 3 && filtro != 4 && filtro != 5 && 
				filtro != 6 && filtro != 7 && filtro != 8 && filtro != 0) {
			System.out.println("\nOpção inválida!");
			System.out.println("Selecione o Ícone de inclusão:");
			System.out.println("1. LGBTQIA+ | 2. Equidade de gênero (transgênero) | 3. Equidade de gênero (mulher cis) |"
					+ " 4. Étnico-racial | 5. PCD (físico) | 6. PCD (auditivo e visual) |"
					+ " 7. PCD (intelectual) | 8. Voltar | 0. Página inicial");
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
			System.out.println("\n======= Mostrando empresas com filtro Equidade de gênero (transgênero): =======");
			System.out.println("\n** EMPRESA 1 **");
			System.out.println(dadosEmpresa.get(0));
			System.out.println("\n** EMPRESA 4 **");
			System.out.println(dadosEmpresa.get(3));
			enviarCurriculo();
		} else if (filtro == 3) {
			System.out.println("\n======= Mostrando empresas com filtro Equidade de gênero (mulher cis): =======");
			System.out.println("\n** EMPRESA 2 **");
			System.out.println(dadosEmpresa.get(1));
			System.out.println("\n** EMPRESA 4 **");
			System.out.println(dadosEmpresa.get(3));
			enviarCurriculo();
		} else if (filtro == 4) {
			System.out.println("\n======= Mostrando empresas com filtro Étnico-racial: =======");
			System.out.println("\n** EMPRESA 1 **");
			System.out.println(dadosEmpresa.get(0));
			System.out.println("\n** EMPRESA 2 **");
			System.out.println(dadosEmpresa.get(1));
			System.out.println("\n** EMPRESA 4 **");
			System.out.println(dadosEmpresa.get(3));
			enviarCurriculo();
		} else if (filtro == 5) {
			System.out.println("\n======= Mostrando empresas com filtro PCD (físico): =======");
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
		
		System.out.println("\n============== Você gostaria de: ==============");
		System.out.println("1. Enviar currículo | 2. Voltar para lista de empresas | 0. Ir para Página Inicial");
		filtro = entrada.nextInt();
		
		while(filtro != 1 && filtro != 2 && filtro != 0) {
			System.out.println("\nOpção inválida!");
			System.out.println("Você gostaria de:");
			System.out.println("1. Enviar currículo | 2. Voltar para lista de empresas | 0. Ir para página Inicial");
			filtro = entrada.nextInt();
		}
		if (filtro == 1) {
			System.out.println("\nCurrículo enviado com sucesso para estas empresas!");
			System.out.println("Você gostaria de:");
			System.out.println("1. Voltar para lista de empresas | 0. Ir para página inicial");
			selecionar = entrada.nextInt();
				
			while (selecionar != 1 && selecionar != 0) {
				System.out.println("\nOpção inválida!");
				System.out.println("Você gostaria de:");
				System.out.println("1. Voltar para lista de empresas | 0. Ir para página inicial");
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
		
		Dados empresa1 = new Dados("Empresa Unicórnio", "Cuidador Sr.", 09.00, 17.00, 5600.00, "LGBTQIA+; Equidade de gênero (transgênero); Étnico-racial;");
		Dados empresa2 = new Dados("Fábrica do Noel", "Ajudante de caixa", 05.00, 12.00, 4100.00, "Étnico-racial; Equidade de gênero (mulher cis)");
		Dados empresa3 = new Dados("Empresa Elemento X", "Técnico de laboratório Pl.", 22.00, 06.00, 4500.00, "PCD (físico); PCD (auditivo e visual); LGBTQIA+");
		Dados empresa4 = new Dados("Fábrica do Willy Wonka", "Designer de produtos dourados", 06.00, 12.00, 4800.00, "Equidade de gênero (mulher cis); Equidade de gênero (transgênero); Étnico-racial");
		Dados empresa5 = new Dados("Empresa Era uma vez..", "Contador de histórias Jr.", 10.00, 18.00, 3800.00, "PCD (auditivo e visual); PCD (intelectual); LGBTQIA+");
		
		ArrayList<Dados> dadosEmpresa = new ArrayList<>();
		dadosEmpresa.add(empresa1);
		dadosEmpresa.add(empresa2);
		dadosEmpresa.add(empresa3);
		dadosEmpresa.add(empresa4);
		dadosEmpresa.add(empresa5);
		
		System.out.println("\nFiltrar salários acima de:");
		System.out.println("1. R$ 1000,00 | 2. R$ 2000,00 | 3. R$ 3000,00 | 4. R$ 4000,00 | 5. R$ 5000,00 |"
				+ " 6. R$ 6000,00 | 0. Página inicial");
		filtro = entrada.nextInt();
		
		while (filtro != 1 && filtro != 2 && filtro != 3 && filtro != 4 && filtro != 5 && 
				filtro != 6 && filtro != 0) {
			System.out.println("\nOpção inválida!");
			System.out.println("Filtrar salários acima de:");
			System.out.println("1. R$ 1000,00 | 2. R$ 2000,00 | 3. R$ 3000,00 | 4. R$ 4000,00 | 5. R$ 5000,00 |"
					+ " 6. R$ 6000,00 | 0. Página inicial");
			filtro = entrada.nextInt();
		}
		if (filtro == 1) {
			System.out.println("\n======= Mostrando empresas com salário acima de R$ 1000,00: =======");
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
			System.out.println("\n======= Mostrando empresas com salário acima de R$ 2000,00: =======");
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
			System.out.println("\n======= Mostrando empresas com salário acima de R$ 3000,00: =======");
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
			System.out.println("\n======= Mostrando empresas com salário acima de R$ 4000,00: =======");
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
			System.out.println("\n======= Mostrando empresas com salário acima de R$ 5000,00: =======");
			System.out.println("\n** EMPRESA 1 **");
			System.out.println(dadosEmpresa.get(0));
			enviarCurriculo();
		} else if (filtro == 6) {
			System.out.println("\n======= Mostrando empresas com salário acima de R$ 6000,00: =======");
			System.out.println("\nNenhum resultado para a pesquisa!");
			System.out.println("Você gostaria de:");
			System.out.println("1. Voltar para a lista de empresas | 0. Voltar para a página inicial");
			filtro2 = entrada.nextInt();
			while (filtro2 != 1 && filtro2 != 0) {
				System.out.println("\nOpção inválida!");
				System.out.println("Você gostaria de:");
				System.out.println("1. Voltar para a lista de empresas | 0. Voltar para a página inicial");
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
