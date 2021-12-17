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
	 
	 
	 
	 
	
	 String mestrado;
	 String doutorado;
	 
	 
	 
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
	
	
	 
	 
	public void cadastrar() throws InterruptedException {
		
		Scanner entrada = new Scanner(System.in);
		

		System.out.println("******************************************************");
		System.out.println("Criar conta pessoa fisica");
		System.out.println("1: Cadastro");
		System.out.println("0: Pagina inicial");
		paginaUserCad = entrada.nextInt();
		
		if(paginaUserCad == 0) {
			System.out.println("******************************************************");
			System.out.println("Pagina Inicial");
			pagina = 0;
		}
		
		while(paginaUserCad == 1) {
			pagina = 1;
			System.out.println("******************************************************");
			System.out.println();
			
			System.out.println("         Cadasto de Usúario       ");
			
			
			
			System.out.print("Informe seu Nome: ");
			entrada.nextLine();
			nome = entrada.nextLine();
			
		
		
			
			System.out.print("Informe seu E-mail: ");
			email = entrada.nextLine();
			
			System.out.print("Informe sua Idade: ");
			idade = entrada.nextInt();
			
			
			
			while (cpf.length() != 11) {
				System.out.print("Informe os Numeros do CPF: ");
				cpf = entrada.next();
				if (cpf.length() != 11) {
						System.out.println("Valor inválido! digite novamente");
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
				System.out.print("Confirme sua  senha: ");
				confirmarSenha = entrada.next();
				if (confirmarSenha.length() <= 7) {
					System.out.println("Informe uma senha maior que 8 caracteres");
				}
				if (!senha.equals(confirmarSenha)) {
					System.out.println("As senhas precisam estár iguais");
				}
			 }
			
			System.out.println();
			System.out.println("******************************************************");
			
			System.out.println();
			
			while(genero != 1 && genero != 2 && genero != 3 && genero != 4 &&  genero != 5 && genero != 6 && genero != 7) {
				System.out.println("Escolha seu Genero: ");
				System.out.println("1: Homem Cis ");
				System.out.println("2: Mulher Cis ");
				System.out.println("3: Homem Trans ");
				System.out.println("4: Mulher Trans ");
				System.out.println("5: Não Binario ");
				System.out.println("6: Outro ");
				System.out.println("7: Prefiro não dizer ");
				genero = entrada.nextInt();
				if(genero == 1) {
					genero1 = "Homem Cis";
				}
				if(genero == 2) {
					genero1 = "Mulher Cis";
				}
				if(genero == 3) {
					genero1 = "Homem Trans";	
				}
				if(genero == 4) {
					genero1 = "Mulher Trans";	
				}
				if(genero == 5) {
					genero1 = "Não Binario";	
				}
				if (genero == 6) {
					System.out.println("Informe seu genero: ");
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
				System.out.println("Escolha a sua Sexualidade: ");
				System.out.println("1: Lesbica ");
				System.out.println("2: Gay ");
				System.out.println("3: Bissexuais ");
				System.out.println("4: Assexuais ");
				System.out.println("5: Outro ");
				System.out.println("6: Prefiro não dizer ");
				sexualidade = entrada.nextInt();
				if(sexualidade == 1) {
					sexualidade1 = "Lesbica";
				}
				if(sexualidade == 2) {
					sexualidade1 = "Gays";	
				}
				if(sexualidade == 3) {
					sexualidade1 = "Bissexuais";	
				}
				if(sexualidade == 4) {
					sexualidade1 = "Assexuais";	
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
				System.out.println("1: Branco ");
				System.out.println("2: Amarelo ");
				System.out.println("3: Pardo ");
				System.out.println("4: Negro ");
				System.out.println("5: Indigena ");
				System.out.println("6: Outros ");
				System.out.println("7: Prefiro não dizer ");
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
					etnia1 = "Indigena";	
				}
				if (etnia == 6) {
					System.out.println("Informe sua etinia: ");
					etnia1 = entrada.next();		
				}
				if (etnia == 7) {
					etnia1 = "Prefiro não dizer";		
				}
				
			}
			
			
			System.out.println("******************************************************");
				
			System.out.println("Você possui alguma deficiência física?");
			System.out.println("1: Sim");
			System.out.println("2: Não");
			
			possuiPCD = entrada.nextInt();
			if(possuiPCD == 1) {
				System.out.print("Porfavor informe sua  deficiência física: ");
				entrada.nextLine();
				pcds = entrada.nextLine();
			}else {
				pcds = "Não Possui";
			}
			
			System.out.println();
			System.out.println("******************************************************");
			System.out.println("Verifique se as informações estão corretas");
			
			 System.out.println("Nome: "+nome );
			 System.out.println("Idade: "+idade);
			 System.out.println("E-mail: "+email);
			 System.out.println("CPF: "+ cpf);
//			 System.out.println(senha);
//			 System.out.println(confirmarSenha);
			 System.out.println("Genero"+ genero1);
			 System.out.println("Sexualidadeo: "+ sexualidade1);
			 System.out.println("Etnia: "+ etnia1);
			 System.out.println("Pcds: "+ pcds);
			 
			 System.out.println();
			 System.out.println("******************************************************");
			 System.out.println();
			 
			 
			 System.out.println("Caso esteja correta dejesa salvar estás informações e concluir o cadastro?");
			 System.out.println("1: Sim");
			 System.out.println("2: Não");
			 System.out.println("0: Voltar pra pagina inicial");
			 menuConcluirCad = entrada.nextInt();
			 
			 if(menuConcluirCad == 1) {
				 System.out.println("Concluindo seu cadastro.");
				 Thread.sleep(400);
				 System.out.println("Concluindo seu cadastro..");
				 Thread.sleep(400);
				 System.out.println("Concluindo seu cadastro......");
				 Thread.sleep(400);
				 System.out.println();
				 System.out.println("Cadastro Concluido com sucesso");
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
				paginaUserCad = 1;
			 }
			 			 
			 
			 System.out.println();
			 System.out.println("******************************************************");
			 System.out.println();
			 if(menuProcuraEmprego == 1) {
				System.out.println("Está procurando emprego: ");
				System.out.println("1: Sim ");
				System.out.println("2: Não ");
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
				System.out.println("Fazendo Login..");
				Thread.sleep(400);
				System.out.println("Fazendo Login....");
				Thread.sleep(400);
				System.out.println("Fazendo Login...........");
			    Thread.sleep(400);
			    System.out.println("******************************************************");
			    System.out.println();
			    System.out.println("Login efetuado com sucesso");
				System.out.println();
				Thread.sleep(400);
				System.out.println("******************************************************");
				System.out.println();
				System.out.println("Bem vindo: " +nome);
				System.out.println();
				System.out.println("******************************************************");
				System.out.println();
				System.out.println("Curriculum: ");
				System.out.println("1: Preencher Curriculo ");
				System.out.println("0: Pagina Inicial ");	
				menuCurriPreencher = entrada.nextInt();
				Thread.sleep(400);
			 }
			if(menuCurriPreencher == 1) {
				System.out.println("******************************************************");
				System.out.println();
				System.out.println("Bem vindo "+nome+" Ao Construtor de Curriculum");
				System.out.println();
				System.out.println("Vamos começar a construção de seu Curriculum");
				System.out.println();
				 
				ArrayList<Idioma> idiomaCl = new ArrayList<>();
				
				System.out.println("Porfavor informe Quantos idiomas você fala?");
				int numeroIdioma = entrada.nextInt();
				entrada.nextLine();
				for(int i = 0; i < numeroIdioma; i++) {
					System.out.println("Informe o Idioma: [1 por vez] ");					
					idioma = entrada.nextLine();				
					idiomaCl.add(new Idioma(idioma));
					
					
				 }
				
		         System.out.println("Informe seu nivel de escolaridade");
		         System.out.println("1: Ensino medio Incompleto");
		         System.out.println("2: Ensino medio Completo");
		         System.out.println("3: Ensino superior Cursando");
		         System.out.println("4: Ensino superior Completo");
		         System.out.println("5: Pós-Graduação Cursando");
		         System.out.println("6: Pós-Graduação Completo");
		         System.out.println("7: Mestrado Cursando");
		         System.out.println("8: Mestrado Completo");
		         System.out.println("9: Doutorado Cursando");
		         System.out.println("10: Doutorado Completo");
		         nivelEscolaridade = entrada.nextInt();
		         
		         if(nivelEscolaridade == 1) {
		        	 escolaridade = "Ensino medio Incompleto";
		         }
		         
		         if(nivelEscolaridade == 2) {
		        	 escolaridade = "Ensino medio Completo";
		        	 
		         }
		         
		         if(nivelEscolaridade == 3) {
		        	 e1.cadFaculdadeCursando();
		        	 escolaridade = "Ensino superior Cursando";
		         }
		         
		         if(nivelEscolaridade == 4) {
		        	 e1.cadFaculdadeFinalizado();
		        	 escolaridade = " Ensino superior Completo";
		         }
		         
		         if(nivelEscolaridade == 5) {
		        	 e1.cadFaculdadeFinalizado();
		        	 e1.cadPosGraduacaoCursando();
		        	 escolaridade = "Pós-Graduação Cursando";
		         }
		         
		         if(nivelEscolaridade == 6) {
		        	 e1.cadFaculdadeFinalizado();
		        	 e1.cadPosGraduacaoFinalizado();
		        	 escolaridade = "Pós-Graduação Completo";
		         }
		         
		         if(nivelEscolaridade == 7) {
		        	 e1.cadFaculdadeFinalizado();
		        	 e1.cadMestradoCursando();
		        	 escolaridade = "Mestrado Cursando";
		         }
		         
		         if(nivelEscolaridade == 8) {
		        	 e1.cadFaculdadeFinalizado();
		        	 e1.cadMestradoFinalizado();
		        	 escolaridade = "Mestrado Completo";
		         }
		         
		         if(nivelEscolaridade == 9) {
		        	 e1.cadFaculdadeFinalizado();
		        	 e1.cadDoutoradoCursando();
		        	 escolaridade = "Doutorado Cursando";
		         }
		         
		         if(nivelEscolaridade == 10) {
		        	 e1.cadFaculdadeFinalizado();
		        	 e1.cadDoutoradoFinalizado();
		        	 escolaridade = "Doutorado Completo";
		         }
				ArrayList<Curso> Curso1 = new ArrayList<>();
				
				System.out.println("Porfavor informe Quantos cursos você possui");
				int numeroCurso = entrada.nextInt();
				entrada.nextLine();
				for(int i = 0; i < numeroCurso; i++) {
					System.out.println("Informe o Nome do curso:  "+ i);					
					nomeCurso = entrada.nextLine();
					
					System.out.println("Informe a duração do curso:");
					
					System.out.print("Data Inicio:");
					dataInicioCurso = entrada.nextLine();
					
					System.out.print("Data Fim:");
					dataFimCurso = entrada.nextLine();
					
					System.out.println("Experiencia Obtida:");
					experienciaCurso = entrada.nextLine();
					
					Curso1.add(new Curso(nomeCurso, dataInicioCurso, dataFimCurso, experienciaCurso));
					
					
				 }
				 
				ArrayList<Experiencia> experiencaPS = new ArrayList<>();
					
				System.out.println("Quantas Experiencias Profissionais você deseja adicionar?");
				int numeroExperiencia = entrada.nextInt();
				entrada.nextLine();
				
				for(int i = 0; i < numeroExperiencia; i++) {
					System.out.println("Digite o nome da empresa: ");
					nomeEmpresa = entrada.nextLine();
				
					
					System.out.println("Endereço da empresa: ");
					localDeTrabalho = entrada.nextLine();
					 
					System.out.println("Digite seu cargo: ");
					 nomeCargo = entrada.nextLine();
					 
					System.out.println("Informe a data de inicio: ");
				    dataInicio = entrada.nextLine();
				    
				    System.out.println("Informe a data que saiu ou se ainda está na empresa: ");
				    dataFim = entrada.nextLine();
					 
					System.out.println("Informe sua experiencia: ");
				    experienciaDeTrabalho = entrada.nextLine();
					 
					
				    experiencaPS.add(new Experiencia(nomeEmpresa, localDeTrabalho, nomeCargo, dataInicio, dataFim, experienciaDeTrabalho));
				}
			
				 Thread.sleep(400);
				 System.out.println("******************************************************");
				 System.out.println("Perfil");
				 System.out.println("Nome: "+nome );
				 System.out.println("Idade: "+idade);
				 System.out.println("E-mail: "+email);
				 System.out.println("CPF: "+ cpf);
//				 System.out.println(senha);
//				 System.out.println(confirmarSenha);
				 System.out.println("Genero: "+ genero1);
				 System.out.println("Sexualidadeo: "+ sexualidade1);
				 System.out.println("Etnia: "+ etnia1);
				 System.out.println("Pcds: "+ pcds);
				 System.out.println("Escolaridade: "+ escolaridade);
				 System.out.println("******************************************************");
				 System.out.println();
				 System.out.println("Idiomas ");
				 System.out.println();
				 for(Idioma idioma: idiomaCl) {
					System.out.println(idioma);
					
		    	 }
				 System.out.println();
				 System.out.println("******************************************************");
				 System.out.println("Escolaridade");
		         if(nivelEscolaridade == 3) {
		        	 System.out.println("Nome da Faculdade: "+ e1.nomeFaculdade1);
		        	 System.out.println("Nome do Curso: "+ e1.nomeCursoFaculdade1);
		        	 System.out.println("Data Inicio: "+ e1.faculDataInicio1);
		        	 System.out.println("Data Fim: "+ e1.faculDataFim1);
		        	 
		         }
		         
		         if(nivelEscolaridade == 4) {
		        	 System.out.println("Nome da Faculdade: "+ e1.nomeFaculdade);
		        	 System.out.println("Nome do Curso: "+ e1.nomeCursoFaculdade);
		        	 System.out.println("Data Inicio: "+ e1.faculDataInicio);
		        	 System.out.println("Data Fim: "+ e1.faculDataFim);
		         }
		         
		         if(nivelEscolaridade == 5) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da Faculdade: "+ e1.nomeFaculdade);
		        	 System.out.println("Nome do Curso: "+ e1.nomeCursoFaculdade);
		        	 System.out.println("Data Inicio: "+ e1.faculDataInicio);
		        	 System.out.println("Data Fim: "+ e1.faculDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Mestrado");
		        	 System.out.println("Nome da Faculdade: "+ e1.nomePos1);
		        	 System.out.println("Nome do Curso: "+ e1.nomeCursoPos1);
		        	 System.out.println("Data Inicio: "+ e1.posDataInicio1);
		        	 System.out.println("Data Fim: "+ e1.posDataFim1);
		         }
		         
		         if(nivelEscolaridade == 6) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da Faculdade: "+ e1.nomeFaculdade);
		        	 System.out.println("Nome do Curso: "+ e1.nomeCursoFaculdade);
		        	 System.out.println("Data Inicio: "+ e1.faculDataInicio);
		        	 System.out.println("Data Fim: "+ e1.faculDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Mestrado");
		        	 System.out.println("Nome da Faculdade: "+ e1.nomePos);
		        	 System.out.println("Nome do Curso: "+ e1.nomeCursoPos);
		        	 System.out.println("Data Inicio: "+ e1.posDataInicio);
		        	 System.out.println("Data Fim: "+ e1.posDataFim);
		         }
		         
		         if(nivelEscolaridade == 7) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da Faculdade: "+ e1.nomeFaculdade);
		        	 System.out.println("Nome do Curso: "+ e1.nomeCursoFaculdade);
		        	 System.out.println("Data Inicio: "+ e1.faculDataInicio);
		        	 System.out.println("Data Fim: "+ e1.faculDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Mestrado");
		        	 System.out.println("Nome da Faculdade: "+ e1.nomeMestrado1);
		        	 System.out.println("Nome do Curso: "+ e1.cursoMestrado1);
		        	 System.out.println("Data Inicio: "+ e1.mestradoDataInicio1);
		        	 System.out.println("Data Fim: "+ e1.mestradoDataFim1);
		         }
		         
		         if(nivelEscolaridade == 8) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da Faculdade: "+ e1.nomeFaculdade);
		        	 System.out.println("Nome do Curso: "+ e1.nomeCursoFaculdade);
		        	 System.out.println("Data Inicio: "+ e1.faculDataInicio);
		        	 System.out.println("Data Fim: "+ e1.faculDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 System.out.println("Mestrado");
		        	 System.out.println("Nome da Faculdade: "+ e1.nomeMestrado);
		        	 System.out.println("Nome do Curso: "+ e1.cursoMestrado);
		        	 System.out.println("Data Inicio: "+ e1.mestradoDataInicio);
		        	 System.out.println("Data Fim: "+ e1.mestradoDataFim);
		         }
		         
		         if(nivelEscolaridade == 9) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da Faculdade: "+ e1.nomeFaculdade);
		        	 System.out.println("Nome do Curso: "+ e1.nomeCursoFaculdade);
		        	 System.out.println("Data Inicio: "+ e1.faculDataInicio);
		        	 System.out.println("Data Fim: "+ e1.faculDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 
		        	 System.out.println("Doutorado");
		        	 System.out.println("Nome da Faculdade: "+ e1.nomeDoutorado1);
		        	 System.out.println("Nome do Curso: "+ e1.nomeDoutorado1);
		        	 System.out.println("Data Inicio: "+ e1.doutoradoDataInicio1);
		        	 System.out.println("Data Fim: "+ e1.doutoradoDataFim1);		        	 		        	 
		         }
		         
		         if(nivelEscolaridade == 10) {
		        	 System.out.println("******************************************************");
		        	 System.out.println("Faculdade");
		        	 System.out.println("Nome da Faculdade: "+ e1.nomeFaculdade);
		        	 System.out.println("Nome do Curso: "+ e1.nomeCursoFaculdade);
		        	 System.out.println("Data Inicio: "+ e1.faculDataInicio);
		        	 System.out.println("Data Fim: "+ e1.faculDataFim);
		        	 
		        	 System.out.println("******************************************************");
		        	 
		        	 System.out.println("Doutorado");
		        	 System.out.println("Nome da Faculdade: "+ e1.nomeDoutorado);
		        	 System.out.println("Nome do Curso: "+ e1.nomeDoutorado);
		        	 System.out.println("Data Inicio: "+ e1.doutoradoDataInicio);
		        	 System.out.println("Data Fim: "+ e1.doutoradoDataFim);		
		         }
				 System.out.println();
				 System.out.println("******************************************************");
				 System.out.println("Cursos");
				 System.out.println();
				 if(numeroCurso == 0) {
					 System.out.print("Não possui Curso"); 
					 System.out.println();
				 }
				for(Curso c1: Curso1) {
					System.out.println();
					System.out.println(c1);
		    	 }
				 System.out.println("******************************************************");
				 System.out.println("Experiencias");
				 System.out.println();
				 if(numeroExperiencia == 0) {
					 System.out.print("Não possui experiencia"); 
					 System.out.println();
				 }
				for(Experiencia exp: experiencaPS) {
					System.out.println();
					System.out.println(exp);
		    	 }	
				System.out.println("******************************************************");
				
				System.out.println("Dejesa salvar o curriculum");
				System.out.println("1: sim");
				System.out.println("2: Não");
				System.out.println("0: Voltar pro inicio");
				salvarCurriculum = entrada.nextInt();
				if(salvarCurriculum == 1) {
					System.out.println();
				    System.out.println("******************************************************");
					System.out.println("Salvando Curriculum..");
					Thread.sleep(400);
					System.out.println("Salvando Curriculum.....");
					Thread.sleep(400);
					System.out.println("Salvando Curriculum.......");
				    Thread.sleep(400);
				    System.out.println("******************************************************");
				    System.out.println();
				    System.out.println("Curriculum salvo com sucesso");
					System.out.println();
					System.out.println("******************************************************");
					Thread.sleep(400);
					System.out.println();
					System.out.println("Redirecionando para a lista de Empresas");
					System.out.println();
					System.out.println("******************************************************");
					f1.verListaEmpresa();
				}
				
			}	
		}
	
		entrada.close();
		
	}
	
}
