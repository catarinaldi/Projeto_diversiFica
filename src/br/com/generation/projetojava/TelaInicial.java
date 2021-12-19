package br.com.generation.projetojava;
 
import java.util.Scanner;

public class TelaInicial {

	public  void opcoesCadastro () throws InterruptedException {
		PaginaInicial pagina = new PaginaInicial ();
		User cadastro = new User ();
		Cadastro_Empregador empresa = new Cadastro_Empregador ();
		Scanner entrada = new Scanner(System.in);
		
		
		int opcao;
		
		System.out.println("=============Escolha uma das op��es abaixo:=============");
		
		System.out.println();
		System.out.println("1. Empregador \n2. Empregado \n3. Lista de Empresas (Apenas olhar) \n0. P�gina inicial");
		
		System.out.print("Insira uma das op��es: ");
		opcao = entrada.nextInt();
		
		
		while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0) {
			
			System.out.println("DIGITE UMA OP��O V�LIDA!");
			opcao = entrada.nextInt();
		}
		
		if(opcao == 1 ) {
			empresa.cadastroEmpresa();
		}
		else if(opcao == 2) {
			cadastro.cadastrar();
			
		}
		else if(opcao == 3) {
			System.out.println("=============LISTA DE EMPRESAS=============");
		}
		else  {
			pagina.inicial();
		}
		entrada.close();
	}
}
