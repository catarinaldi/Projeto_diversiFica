package MinhaParte;

import java.util.Scanner;

public class Exercutavel {

	public static void main(String[] args) {
		
		String nomeDaVaga;
		String area;
		String horario;
		String salario;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("========== Preencha os campos da vaga ==========");
		
		System.out.println("NOME DA VAGA: ");
		nomeDaVaga = read.nextLine();
		
		System.out.println("�REA: ");
		area = read.nextLine();
		
		System.out.println("HOR�RIO DA VAGA: ");
		horario = read.next();
		
		System.out.println("FAIXA SAL�RIAL: ");
		salario = read.next();
		
		System.out.println();
		System.out.println("|==========================================================================================================|");
		System.out.println();
		System.out.println(" |   Nome da vaga: " + nomeDaVaga + "| �rea: " + area + "| hor�rio: "
														+ horario + "| sal�rio: " + salario + " |");
		System.out.println();
		System.out.println("|==========================================================================================================|");
		
		read.close();
	}

}
