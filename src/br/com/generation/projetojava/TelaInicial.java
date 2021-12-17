package MinhaParte;

import java.util.Scanner;

public class TelaInicial {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String Empregador, Empregado, ListaDeEmpresas;
		int opcao;
		
		System.out.println("=========Escolha uma das opções abaixo=======");
		
		System.out.println();
		System.out.println("1) - Empregador \n2) - Empregado \n3) - Lista de Empresas (Apenas olhar) \n0) - Início");
		
		System.out.println("Digite a opção: ");
		opcao = read.nextInt();
		
		
		while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0) {
			
			System.out.println("DIGITE A OPÇÃO VÁLIDA");
			opcao = read.nextInt();
		}
		
		if(opcao == 1 ) {
			System.out.println("EMPREGADOR");
		}
		else if(opcao == 2) {
			System.out.println("EMPREGADO");
		}
		else if(opcao == 3) {
			System.out.println("LISTA DE EMPRESAS");
		}
		else if(opcao == 0) {
			System.out.println("Início");
		}
	}
}
