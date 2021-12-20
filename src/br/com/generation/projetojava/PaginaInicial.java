package br.com.generation.projetojava;
 
import java.util.Scanner;

	public class PaginaInicial {
	
		public void inicial () throws InterruptedException {
	
		Scanner entrada = new Scanner(System.in);
		
		TelaInicial telaopcao = new TelaInicial();
		TestaDados lista = new TestaDados();
		
	
		int pagina = 0;
		
		
		System.out.println("=============Olá! Bem vinde ao DivesiFica=============");
		
		
	
	
		System.out.println();
	
		System.out.println("1. Criar Conta");
		System.out.println("2. Lista de Empresas");
		System.out.print("Insira uma das opções: ");
		pagina = entrada.nextInt();
		while(pagina != 1 && pagina != 2 ) {
			System.out.print("Informe a opção: ");
			pagina = entrada.nextInt();
		}
		if(pagina == 1 ){
			telaopcao.opcoesCadastro();	
		}
		else {
			lista.listaEmpresas();
		}
	
	
		entrada.close();

	}

}