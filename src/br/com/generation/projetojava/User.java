package br.com.generation.projetojava;
 
import java.util.ArrayList;
import java.util.Scanner;

public class User {
	
	 String nome;
	 String email;
	 String senha ="";
	 String confirmarSenha = "";
	 String comunidades = "";
	 String sexualidade1;
	 String pcds;
	 String etnia1;
	 String cpf = "";
	 String genero1;
	 
	 int idade;
	 int genero;
	 int sexualidade;
	 int etnia;
	 int possuiPCD;
	 int pagina = 0;
	 int paginaUserCad = 0;
	 int menuUserCad = 0;
	 int menuCurriCad = 0;
	 int menuCurriPreencher = 0;
	 int menuProcuraEmprego = 0;
	 int menuConcluirCad = 0;
	 
	 //****************************
	 //Curriculum
	 String idioma;
	 String curso;
	 String escolaridade;
	 String nomeEmpresa;
	 String nomeCargo;
	 String localDeTrabalho;
	 String experienciaDeTrabalho;
	 String dataInicio;
	 String dataFim;

	 //****************************
	 //Curriculum --> Curso
	 String nomeCurso;
	 String dataInicioCurso;
	 String dataFimCurso;
	 String experienciaCurso;
	 
	 int continuaTrabalhando;
	 int possuiIdioma = 0;
	 int menuExperiencia = 0;
	 int numeroExperiencia = 0;
	 int nivelEscolaridade = 0;
	 int salvarCurriculum = 0;
	 
	 //****************************
	
	 //METODOS
	 Formulario f1 = new Formulario();
	 Escolaridade e1 = new Escolaridade();
	 PaginaInicial paginainicial = new PaginaInicial();
	
	 
	 
	public void cadastrar() throws InterruptedException {
		
		Scanner entrada = new Scanner(System.in);
		

		System.out.println("******************************************************");
		System.out.println("Criar conta de pessoa física");
		System.out.println("1. Cadastro");
		System.out.println("0. Página inicial");
		System.out.print("Insira uma das opções: ");
		paginaUserCad = entrada.nextInt();
		
		if(paginaUserCad == 0) {
			System.out.println("******************************************************");
			pagina = 0;
			paginainicial.inicial();
		}
		
		while(paginaUserCad == 1) {
			pagina = 1;
			System.out.println("******************************************************");
			System.out.println();
			
			System.out.println("=============CADASTRO DE PESSOA FÍSICA=============");
			
			
			System.out.print("Informe seu nome: ");
			entrada.nextLine();
			nome = entrada.nextLine();	
			
			System.out.print("Informe seu e-mail: ");
			email = entrada.nextLine();
			
			System.out.print("Informe sua idade: ");
			idade = entrada.nextInt();
			
			
			while (cpf.length() != 11) {
				System.out.print("Informe os números do CPF: ");
				cpf = entrada.next();
				if (cpf.length() != 11) {
						System.out.println("Valor inválido! Digite novamente ");
				}
			 }
			

			while (senha.length() < 8) {
				System.out.print("Digite sua senha: ");
				senha = entrada.next();
				if (senha.length() <= 7 ) {
					System.out.println("Informe uma senha maior que 8 caracteres");
				}
			 }
			
			while (!senha.equals(confirmarSenha)) {
				System.out.print("Confirme sua senha: ");
				confirmarSenha = entrada.next();
				if (confirmarSenha.length() <= 7) {
					System.out.println("Informe uma senha maior que 8 caracteres");
				}
				if (!senha.equals(confirmarSenha)) {
					System.out.println("As senhas precisam estar iguais");
				}
			 }
			
			System.out.println();
			System.out.println("******************************************************");
			
			System.out.println();
			
			while(genero != 1 && genero != 2 && genero != 3 && genero != 4 &&  genero != 5 && genero != 6 && genero != 7) {
				System.out.println("Escolha seu gênero: ");
				System.out.println("1. Homem cis ");
				System.out.println("2. Mulher cis ");
				System.out.println("3. Homem trans ");
				System.out.println("4. Mulher trans ");
				System.out.println("5. Não binário ");
				System.out.println("6. Outro ");
				System.out.println("7. Prefiro não dizer ");
				System.out.print("Insira uma das opções: ");
				genero = entrada.nextInt();
				if(genero == 1) {
					genero1 = "Homem cis";
				}
				if(genero == 2) {
					genero1 = "Mulher cis";
				}
				if(genero == 3) {
					genero1 = "Homem trans";	
				}
				if(genero == 4) {
					genero1 = "Mulher trans";	
				}
				if(genero == 5) {
					genero1 = "Não binário";	
				}
				if (genero == 6) {
					System.out.println("Informe seu gênero: ");
					genero1 = entrada.next();		
				}
				if (genero == 7) {
					genero1 = "Prefiro não dizer";		
				}
				
			}
			
			System.out.println();
			System.out.println("******************************************************");
			System.out.println();
			
			while(sexualidade != 1 && sexualidade != 2 && sexualidade != 3 && sexualidade != 4 && sexualidade != 5 && sexualidade != 6) {
				System.out.println("Escolha a sua sexualidade: ");
				System.out.println("1. Lésbica ");
				System.out.println("2. Gay ");
				System.out.println("3. Bissexual ");
				System.out.println("4. Assexual ");
				System.out.println("5. Outro ");
				System.out.println("6. Prefiro não dizer ");
				System.out.print("Insira uma das opções: ");
				sexualidade = entrada.nextInt();
				if(sexualidade == 1) {
					sexualidade1 = "Lésbica";
				}
				if(sexualidade == 2) {
					sexualidade1 = "Gay";	
				}
				if(sexualidade == 3) {
					sexualidade1 = "Bissexual";	
				}
				if(sexualidade == 4) {
					sexualidade1 = "Assexual";	
				}
				if (sexualidade == 5) {
					System.out.println("Informe sua sexualidade: ");
					sexualidade1 = entrada.next();		
				}
				if (sexualidade == 6) {
					sexualidade1 = "Prefiro não dizer";		
				}
				
			}
			System.out.println();
			System.out.println("******************************************************");
			
			while(etnia != 1 && etnia != 2 && etnia != 3 && etnia != 4 && etnia != 5 && etnia != 6 && etnia != 7) {
				System.out.println("Escolha sua Etnia: ");
				System.out.println("1. Branco ");
				System.out.println("2. Amarelo ");
				System.out.println("3. Pardo ");
				System.out.println("4. Negro ");
				System.out.println("5. Indígena ");
				System.out.println("6. Outros ");
				System.out.println("7. Prefiro não dizer ");
				System.out.print("Insira uma das opções: ");
				etnia = entrada.nextInt();
				if(etnia == 1) {
					etnia1 = "Branco";
				}
				if(etnia == 2) {
					etnia1 = "Amarelo";	
				}
				if(etnia == 3) {
					etnia1 = "Pardo";	
				}
				if(etnia == 4) {
					etnia1 = "Negro";	
				}
				if(etnia == 5) {
					etnia1 = "Indígena";	
				}
				if (etnia == 6) {
					System.out.println("Informe sua etnia: ");
					etnia1 = entrada.next();		
				}
				if (etnia == 7) {
					etnia1 = "Prefiro não dizer";		
				}
				
			}
			
			
			System.out.println("******************************************************");
				
			System.out.println("Você possui alguma deficiência física?");
			System.out.println("1. Sim");
			System.out.println("2. Não");
			System.out.print("Insira uma das opções: ");
			possuiPCD = entrada.nextInt();
			if(possuiPCD == 1) {
				System.out.print("Por favor, informe sua deficiência física: ");
				entrada.nextLine();
				pcds = entrada.nextLine();
			}else {
				pcds = "Não possui";
			}
			
			System.out.println();
			System.out.println("******************************************************");
			System.out.println("Verifique se as informações estão corretas");
			
			 System.out.println("Nome: " + nome );
			 System.out.println("Idade: " + idade);
			 System.out.println("E-mail: " + email);
			 System.out.println("CPF: " + cpf);
//			 System.out.println(senha);
//			 System.out.println(confirmarSenha);
			 System.out.println("Gênero: " + genero1);
			 System.out.println("Sexualidade: " + sexualidade1);
			 System.out.println("Etnia: " + etnia1);
			 System.out.println("Deficiência(s): " + pcds);
			 
			 System.out.println();
			 System.out.println("******************************************************");
			 System.out.println();
			 
			 
			 System.out.println("Caso tudo esteja correto, deseja salvar estas informações e concluir o cadastro?");
			 System.out.println("1. Sim");
			 System.out.println("2. Não");
			 System.out.println("0. Voltar para a página inicial");
			 System.out.print("Insira uma das opções: ");
			 menuConcluirCad = entrada.nextInt();
			 
			 if(menuConcluirCad == 1) {
				 System.out.println("Concluindo seu cadastro..");
				 Thread.sleep(400);
				 System.out.println("Concluindo seu cadastro....");
				 Thread.sleep(400);
				 System.out.println("Concluindo seu cadastro...........");
				 Thread.sleep(400);
				 System.out.println();
				 System.out.println("Cadastro concluído com sucesso!");
				 System.out.println();
				 menuProcuraEmprego = 1;
				 paginaUserCad = 2;
			 }
			 if(menuConcluirCad == 2) {
				etnia = 0;
				etnia1 = "";
				sexualidade = 0;
				sexualidade1 = "";
				genero = 0;
				genero1 = "";
				possuiPCD = 0;
				pcds = "";
				cpf = "";
				paginaUserCad = 1;
			 }
			 if(menuConcluirCad == 0) {				
				etnia = 0;
				etnia1 = "";
				sexualidade = 0;
				sexualidade1 = "";
				genero = 0;
				genero1 = "";
				possuiPCD = 0;
				pcds = "";
				cpf = "";
				paginainicial.inicial();
				//paginaUserCad = 1;
			 }
			 			  
			 System.out.println();
			 System.out.println("******************************************************");
			 System.out.println();
			 if(menuProcuraEmprego == 1) {
				System.out.println("Está procurando emprego: ");
				System.out.println("1. Sim ");
				System.out.println("2. Não ");
				System.out.print("Insira uma das opções: ");
				menuCurriCad = entrada.nextInt();
				Thread.sleep(400);
				if(menuCurriCad == 1) {
					menuCurriCad = 3;
					Thread.sleep(400);
				}
				if(menuCurriCad == 2) {
					f1.avaliacaoentrada();
					Thread.sleep(400);
				}
				
			 }
			if(menuCurriCad == 3) {
				System.out.println();
			    System.out.println("******************************************************");
				System.out.println("Fazendo login..");
				Thread.sleep(400);
				System.out.println("Fazendo login....");
				Thread.sleep(400);
				System.out.println("Fazendo login...........");
			    Thread.sleep(400);
			    System.out.println("******************************************************");
			    System.out.println();
			    System.out.println("Login efetuado com sucesso!");
				System.out.println();
				Thread.sleep(400);
				System.out.println("******************************************************");
				System.out.println();
				System.out.println("Bem vinde, " + nome);
				System.out.println();
				System.out.println("******************************************************");
				System.out.println();
				System.out.println("Currículo: ");
				System.out.println("1. Preencher currículo ");
				System.out.println("0. Página inicial ");	
				System.out.print("Insira uma das opções: ");
				menuCurriPreencher = entrada.nextInt();
				Thread.sleep(400);
			 }
			if (menuCurriPreencher == 0) {
				paginainicial.inicial();
			}
			else if(menuCurriPreencher == 1) {
				System.out.println("******************************************************");
				System.out.println();
				System.out.println("Bem vinde, " + nome + " ao construtor de currículo");
				System.out.println();
				System.out.println("Vamos começar a construção de seu currículo");
				System.out.println();
				 
				ArrayList<Idioma> idiomaCl = new ArrayList<>();
				
				System.out.print("Por favor, informe quantos idiomas você fala: ");
				int numeroIdioma = entrada.nextInt();
				entrada.nextLine();
				for(int i = 0; i < numeroIdioma; i++) {
					System.out.println("Informe o idioma (1 por vez): ");					
					idioma = entrada.nextLine();				
					idiomaCl.add(new Idioma(idioma));	
				 }
				
		         System.out.println("Informe seu nível de escolaridade");
		         System.out.println("1. Ensino médio - incompleto");
		         System.out.println("2. Ensino médio - completo");
		         System.out.println("3. Ensino superior - cursando");
		         System.out.println("4. Ensino superior - completo");
		         System.out.println("5. Pós-Graduação - cursando");
		         System.out.println("6. Pós-Graduação - completo");
		         System.out.println("7. Mestrado - cursando");
		         System.out.println("8. Mestrado - completo");
		         System.out.println("9. Doutorado - cursando");
		         System.out.println("10. Doutorado - completo");
		     	 System.out.print("Insira uma das opções: ");
		         nivelEscolaridade = entrada.nextInt();
		         
		         if(nivelEscolaridade == 1) {
		        	 e1.cadEnsinoMedioNaoFinalizado();
		        	 escolaridade = "Ensino médio - incompleto";
		         }
		         
		         if(nivelEscolaridade == 2) {
		        	 e1.cadEnsinoMedioFinalizado();
		        	 escolaridade = "Ensino médio - completo";
		        	 
		         }
		         
		         if(nivelEscolaridade == 3) {
		        	 e1.cadEnsinoMedioFinalizado();
		        	 e1.cadFaculdadeCursando();
		        	 escolaridade = "Ensino superior - cursando";
		         }
		         
		         if(nivelEscolaridade == 4) {
		        	 e1.cadEnsinoMedioFinalizado();
		        	 e1.cadFaculdadeFinalizado();
		        	 escolaridade = " Ensino superior - completo";
		         }
		         
		         if(nivelEscolaridade == 5) {
		        	 e1.cadEnsinoMedioFinalizado();
		        	 e1.cadFaculdadeFinalizado();
		        	 e1.cadPosGraduacaoCursando();
		        	 escolaridade = "Pós-graduação - cursando";
		         }
		         
		         if(nivelEscolaridade == 6) {
		        	 e1.cadEnsinoMedioFinalizado();
		        	 e1.cadFaculdadeFinalizado();
		        	 e1.cadPosGraduacaoFinalizado();
		        	 escolaridade = "Pós-graduação - completo";
		         }
		         
		         if(nivelEscolaridade == 7) {
		        	 e1.cadEnsinoMedioFinalizado();
		        	 e1.cadFaculdadeFinalizado();
		        	 e1.cadMestradoCursando();
		        	 escolaridade = "Mestrado - cursando";
		         }
		         
		         if(nivelEscolaridade == 8) {
		        	 e1.cadEnsinoMedioFinalizado();
		        	 e1.cadFaculdadeFinalizado();
		        	 e1.cadMestradoFinalizado();
		        	 escolaridade = "Mestrado - completo";
		         }
		         
		         if(nivelEscolaridade == 9) {
		        	 e1.cadEnsinoMedioFinalizado();
		        	 e1.cadFaculdadeFinalizado();
		        	 e1.cadDoutoradoCursando();
		        	 escolaridade = "Doutorado - cursando";
		         }
		         
		         if(nivelEscolaridade == 10) {
		        	 e1.cadEnsinoMedioFinalizado();
		        	 e1.cadFaculdadeFinalizado();
		        	 e1.cadDoutoradoFinalizado();
		        	 escolaridade = "Doutorado - completo";
		         }
				ArrayList<Curso> Curso1 = new ArrayList<>();
				
				System.out.print("Por favor, informe quantos cursos você possui: ");
				int numeroCurso = entrada.nextInt();
				entrada.nextLine();
				for(int i = 0; i < numeroCurso; i++) {
					System.out.println("Informe o nome do curso:  ");					
					nomeCurso = entrada.nextLine();
					
					System.out.print("Data início: ");
					dataInicioCurso = entrada.nextLine();
					
					System.out.print("Data fim: ");
					dataFimCurso = entrada.nextLine();
					
					System.out.println("Experiência obtida: ");
					experienciaCurso = entrada.nextLine();
					
					Curso1.add(new Curso(nomeCurso, dataInicioCurso, dataFimCurso, experienciaCurso));
					
					
				 }
				 
				ArrayList<Experiencia> experiencaPS = new ArrayList<>();
					
				System.out.print("Quantas experiências profissionais você deseja adicionar: ");
				int numeroExperiencia = entrada.nextInt();
				entrada.nextLine();
				
				for(int i = 0; i < numeroExperiencia; i++) {
					System.out.println("Digite o nome da empresa: ");
					nomeEmpresa = entrada.nextLine();
				
					
					System.out.println("Endereço da empresa: ");
					localDeTrabalho = entrada.nextLine();
					 
					System.out.println("Digite seu cargo: ");
					 nomeCargo = entrada.nextLine();
					 
					System.out.println("Informe a data de início: ");
				    dataInicio = entrada.nextLine();
				    
				    System.out.println("Informe a data que saiu ou se ainda está na empresa: ");
				    dataFim = entrada.nextLine();
					 
					System.out.println("Experiência obtida: ");
				    experienciaDeTrabalho = entrada.nextLine();
					 
					
				    experiencaPS.add(new Experiencia(nomeEmpresa, localDeTrabalho, nomeCargo, dataInicio, dataFim, experienciaDeTrabalho));
				}
			
				 Thread.sleep(400);
				 System.out.println("******************************************************");
				 System.out.println("Perfil");
				 System.out.println("Nome: " + nome );
				 System.out.println("Idade: " + idade);
				 System.out.println("E-mail: " + email);
				 System.out.println("CPF: " + cpf);
//				 System.out.println(senha);
//				 System.out.println(confirmarSenha);
				 System.out.println("Gênero: " + genero1);
				 System.out.println("Sexualidade: "+ sexualidade1);
				 System.out.println("Etnia: " + etnia1);
				 System.out.println("Pcds: " + pcds);
				 System.out.println("Escolaridade: " + escolaridade);
				 System.out.println("******************************************************");
				 System.out.println();
				 System.out.println("Idiomas");
				 System.out.println();
				 for(Idioma idioma: idiomaCl) {
					System.out.println(idioma);
					
		    	 }
				 System.out.println();
				 System.out.println("******************************************************");
				 System.out.println("Escolaridade");
				 if(nivelEscolaridade == 1) {
		        	 System.out.println("Nome da escola: " + e1.ensinoMedioNome1);
		        	 System.out.println("Local: " + e1.ensinoMediolocal1);
		        	 System.out.println("Data início: " + e1.ensinoMedioDataInicio1);
		        	 System.out.println("Até que série você estudou? " + e1.ensinoMedioDataFim1); 
		         }
				 
				 if(nivelEscolaridade == 2) {
					 System.out.println("Nome da escola: " + e1.ensinoMedioNome);
		        	 System.out.println("Local: " + e1.ensinoMediolocal);
		        	 System.out.println("Data início: " + e1.ensinoMedioDataInicio);
		        	 System.out.println("Data fim: " + e1.ensinoMedioDataFim);		        	 
		         }
				 
		         if(nivelEscolaridade == 3) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Ensino médio");
		        	 System.out.println("Nome da escola: " + e1.ensinoMedioNome);
		        	 System.out.println("Local: " + e1.ensinoMediolocal);
		        	 System.out.println("Data início: " + e1.ensinoMedioDataInicio);
		        	 System.out.println("Data fim: " + e1.ensinoMedioDataFim);
		        	 
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da faculdade: " + e1.nomeFaculdade1);
		        	 System.out.println("Nome do curso: " + e1.nomeCursoFaculdade1);
		        	 System.out.println("Local: " + e1.localFaculdade1);
		        	 System.out.println("Data início: " + e1.faculDataInicio1);
		        	 System.out.println("Data fim: " + e1.faculDataFim1);
		        	 
		         }
		         
		         if(nivelEscolaridade == 4) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Ensino médio");
		        	 System.out.println("Nome da escola: " + e1.ensinoMedioNome);
		        	 System.out.println("Local: " + e1.ensinoMediolocal);
		        	 System.out.println("Data início:  "+ e1.ensinoMedioDataInicio);
		        	 System.out.println("Data fim: " + e1.ensinoMedioDataFim);
		        	 
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da faculdade: " + e1.nomeFaculdade);
		        	 System.out.println("Nome do curso: " + e1.nomeCursoFaculdade);
		        	 System.out.println("Local: " + e1.localFaculdade);
		        	 System.out.println("Data início: " + e1.faculDataInicio);
		        	 System.out.println("Data fim: " + e1.faculDataFim);
		         }
		         
		         if(nivelEscolaridade == 5) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Ensino médio");
		        	 System.out.println("Nome da escola: " + e1.ensinoMedioNome);
		        	 System.out.println("Local: " + e1.ensinoMediolocal);
		        	 System.out.println("Data início: "+ e1.ensinoMedioDataInicio);
		        	 System.out.println("Data fim: "+ e1.ensinoMedioDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println();
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da faculdade: " + e1.nomeFaculdade);
		        	 System.out.println("Nome do curso: " + e1.nomeCursoFaculdade);
		        	 System.out.println("Local: " + e1.localFaculdade);
		        	 System.out.println("Data início: " + e1.faculDataInicio);
		        	 System.out.println("Data fim: " + e1.faculDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println();
		        	 System.out.println("Pós-graduação");
		        	 System.out.println("Nome da faculdade: " + e1.nomePos1);
		        	 System.out.println("Nome do curso: " + e1.nomeCursoPos1);
		        	 System.out.println("Local: " + e1.localPos1);
		        	 System.out.println("Data início: " + e1.posDataInicio1);
		        	 System.out.println("Data fim: " + e1.posDataFim1);
		         }
		         
		         if(nivelEscolaridade == 6) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Ensino médio");
		        	 System.out.println("Nome da escola: " + e1.ensinoMedioNome);
		        	 System.out.println("Local: " + e1.ensinoMediolocal);
		        	 System.out.println("Data início: " + e1.ensinoMedioDataInicio);
		        	 System.out.println("Data fim: " + e1.ensinoMedioDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da faculdade: " + e1.nomeFaculdade);
		        	 System.out.println("Nome do curso: " + e1.nomeCursoFaculdade);
		        	 System.out.println("Local: " + e1.localFaculdade);
		        	 System.out.println("Data início: " + e1.faculDataInicio);
		        	 System.out.println("Data fim: " + e1.faculDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Pós-graduação");
		        	 System.out.println("Nome da faculdade: " + e1.nomePos);
		        	 System.out.println("Nome do curso: " + e1.nomeCursoPos);
		        	 System.out.println("Local: " + e1.localPos);
		        	 System.out.println("Data início: " + e1.posDataInicio);
		        	 System.out.println("Data fim: " + e1.posDataFim);
		         }
		         
		         if(nivelEscolaridade == 7) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Ensino médio");
		        	 System.out.println("Nome da escola: " + e1.ensinoMedioNome);
		        	 System.out.println("Local: " + e1.ensinoMediolocal);
		        	 System.out.println("Data início: " + e1.ensinoMedioDataInicio);
		        	 System.out.println("Data fim: " + e1.ensinoMedioDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da faculdade: " + e1.nomeFaculdade);
		        	 System.out.println("Nome do curso: " + e1.nomeCursoFaculdade);
		        	 System.out.println("Local: " + e1.localFaculdade);
		        	 System.out.println("Data início: " + e1.faculDataInicio);
		        	 System.out.println("Data fim: " + e1.faculDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Mestrado");
		        	 System.out.println("Nome da faculdade: " + e1.nomeMestrado1);
		        	 System.out.println("Nome do curso: " + e1.cursoMestrado1);
		        	 System.out.println("Local: " + e1.localMestrado1);
		        	 System.out.println("Data início: " + e1.mestradoDataInicio1);
		        	 System.out.println("Data fim: " + e1.mestradoDataFim1);
		         }
		         
		         if(nivelEscolaridade == 8) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Ensino médio");
		        	 System.out.println("Nome da escola: " + e1.ensinoMedioNome);
		        	 System.out.println("Local: " + e1.ensinoMediolocal);
		        	 System.out.println("Data início: " + e1.ensinoMedioDataInicio);
		        	 System.out.println("Data fim: " + e1.ensinoMedioDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da Faculdade: " + e1.nomeFaculdade);
		        	 System.out.println("Nome do curso: " + e1.nomeCursoFaculdade);
		        	 System.out.println("Local: " + e1.localFaculdade);
		        	 System.out.println("Data início: " + e1.faculDataInicio);
		        	 System.out.println("Data fim: " + e1.faculDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Mestrado");
		        	 System.out.println("Nome da faculdade: " + e1.nomeMestrado);
		        	 System.out.println("Nome do curso: " + e1.cursoMestrado);
		        	 System.out.println("Local: " + e1.localMestrado1);
		        	 System.out.println("Data início: " + e1.mestradoDataInicio);
		        	 System.out.println("Data fim: " + e1.mestradoDataFim);
		         }
		         
		         if(nivelEscolaridade == 9) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Ensino médio");
		        	 System.out.println("Nome da Escola: " + e1.ensinoMedioNome);
		        	 System.out.println("Local: " + e1.ensinoMediolocal);
		        	 System.out.println("Data início: " + e1.ensinoMedioDataInicio);
		        	 System.out.println("Data fim: " + e1.ensinoMedioDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da faculdade: " + e1.nomeFaculdade);
		        	 System.out.println("Nome do curso: " + e1.nomeCursoFaculdade);
		        	 System.out.println("Local: " + e1.localFaculdade);
		        	 System.out.println("Data início: " + e1.faculDataInicio);
		        	 System.out.println("Data fim: " + e1.faculDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 
		        	 System.out.println("Doutorado");
		        	 System.out.println("Nome da faculdade: " + e1.nomeDoutorado1);
		        	 System.out.println("Nome do curso: " + e1.nomeDoutorado1);
		        	 System.out.println("Local: "+ e1.localDoutorado1);
		        	 System.out.println("Data início: "+ e1.doutoradoDataInicio1);
		        	 System.out.println("Data fim: "+ e1.doutoradoDataFim1);		        	 		        	 
		         }
		         
		         if(nivelEscolaridade == 10) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Ensino médio");
		        	 System.out.println("Nome da Escola: " + e1.ensinoMedioNome);
		        	 System.out.println("Local: " + e1.ensinoMediolocal);
		        	 System.out.println("Data início: " + e1.ensinoMedioDataInicio);
		        	 System.out.println("Data fim: " + e1.ensinoMedioDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da faculdade: " + e1.nomeFaculdade);
		        	 System.out.println("Nome do curso: " + e1.nomeCursoFaculdade);
		        	 System.out.println("Local: " + e1.localFaculdade);
		        	 System.out.println("Data início: " + e1.faculDataInicio);
		        	 System.out.println("Data fim: " + e1.faculDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 
		        	 System.out.println("Doutorado");
		        	 System.out.println("Nome da faculdade: " + e1.nomeDoutorado);
		        	 System.out.println("Nome do curso: " + e1.nomeDoutorado);
		        	 System.out.println("Local: " + e1.localDoutorado);
		        	 System.out.println("Data início: " + e1.doutoradoDataInicio);
		        	 System.out.println("Data fim: " + e1.doutoradoDataFim);		
		         }
				 System.out.println();
				 System.out.println("******************************************************");
				 System.out.println("Cursos");
				 if(numeroCurso == 0) {
					 System.out.print("Não possui curso"); 
					 System.out.println();
				 }
				for(Curso c1: Curso1) {
					System.out.println();
					System.out.println(c1);
		    	 }
				 System.out.println("******************************************************");
				 System.out.println("Experiências");
				 System.out.println();
				 if(numeroExperiencia == 0) {
					 System.out.print("Não possui experiência"); 
					 System.out.println();
				 }
				for(Experiencia exp: experiencaPS) {
					System.out.println();
					System.out.println(exp);
		    	 }	
				System.out.println("******************************************************");
				
				System.out.println("Deseja salvar o currículo?");
				System.out.println("1. Sim");
				System.out.println("2. Não");
				System.out.println("0. Voltar para a página inicial");
				System.out.print("Insira uma das opções: ");
				salvarCurriculum = entrada.nextInt();
				if (salvarCurriculum == 0) {
					paginainicial.inicial();
				}
				else if(salvarCurriculum == 1) {
					System.out.println();
				    System.out.println("******************************************************");
					System.out.println("Salvando currículo..");
					Thread.sleep(400);
					System.out.println("Salvando currículo....");
					Thread.sleep(400);
					System.out.println("Salvando currículo...........");
				    Thread.sleep(400);
				    System.out.println("******************************************************");
				    System.out.println();
				    System.out.println("Currículo salvo com sucesso!");
					System.out.println();
					System.out.println("******************************************************");
					Thread.sleep(400);
					System.out.println();
					System.out.println("Redirecionando para a lista de empresas");
					System.out.println();
					System.out.println("******************************************************");
					f1.verListaEmpresa();
				}
				
			}	
		}
	
		entrada.close();
		
	}
	
}
