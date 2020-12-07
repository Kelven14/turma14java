programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		// DEClARAÇÃO DE VARIAVEL
		cadeia alunos[39] = { "Allen de Lima Vieira", "André de Brito Silva da Costa","Bárbara Liboni Guerra",	
						"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
						"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
						"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
						"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
						"Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso",
						"GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
						"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
						"Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
						"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros",
						"Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães",
						"Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
						"Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda" }
		

		caracter sexoAlunos[39] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F',
		'F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}
		
		cadeia matriculas[39]
		real notas[39]
		cadeia situacao[39]
		cadeia aluno
		caracter opcao= 's'
		inteiro salva=0
		inteiro painel
		inteiro encontra=0,encontra4=0,encontra5=0
		inteiro notaLimite
		inteiro tampa
		inteiro k=0


		//AJUSTE DE MATRICULA
		para (inteiro x=0; x< 39; x++)
		{
			se(x < 9){
				matriculas[x] = "G4-0"+(x+1)	
			}
			senao{
				matriculas[x] = "G4-"+(x+1)	
			}
		}
		para (inteiro x=0; x< 39; x++)
		{	
			se(notas[x]==0 e sexoAlunos[x]=='M'){
				situacao[x]="REPROVADO"
			}
			senao{
				situacao[x]="REPROVADA"
			}
		}



		//lOOP PRINCIPAL
		faca
		{
			//PAINEL PRINCIPAL
			linha()
			escreva("                     SISTEMA ESCOLAR")
			linha()
			escreva("              Selecione uma das opções abaixo: ")
			linha()
			escreva("1-Inserir nota de um aluno\n2-Exibir a lista de Homens\n3-Exibir a lista de Mulheres\n")
			escreva("4-Exibir a lista de Aprovados ou Aprovadas\n5-Exibir a lista de Reprovados ou Reprovadas\n")
			escreva("6-Lista por nota\n")
			escreva("Selecione 0 para sair!\n")
			leia(painel)
			
			
			se(painel==1)
			{
						
				faca
				{
					linha()
					escreva("Escolha um aluno pela matricula.\nPara isso Digite um Código de mátricula válido, exemplo: G4-XX, onde XX varia de 01 a 39: " )
					leia(aluno)
					aluno=Texto.caixa_alta(aluno)
					linha()
				
					para (inteiro x=0; x<39; x++) //molejão
					{
						se(aluno == matriculas[x])
						{
							se(sexoAlunos[x]=='M'){
								escreva("Nome do aluno: "+alunos[x]+"\nInforme uma nota de 0 a 10: ")
								leia(notas[x])
								salva=x
								se(notas[x]<=5)
								{
									situacao[x]="REPROVADO"
								}
								senao se(notas[x]>5 e notas[x]<8)
								{
									situacao[x]="RECUPERAÇÃO"	
								}
								senao{
									situacao[x]="APROVADO"	
								}
							}
							senao se (sexoAlunos[x]=='F')
							{
								escreva("Nome da aluna: "+alunos[x]+"\nInforme uma nota de 0 a 10: ")
								leia(notas[x])
								salva=x
								se(notas[x]<=5)
								{
									situacao[x]="REPROVADA"
								}
								senao se(notas[x]>5 e notas[x]<8)
								{
									situacao[x]="RECUPERAÇÃO"	
								}
								senao{
									situacao[x]="APROVADA"	
								}
								
							}
						encontra=1	
						}
						//Acrescentar
	
					}
					se(encontra==0)
					{
						escreva("Aluno não encontrado, Digite um código de mátricula válido!\n")
					}
					escreva("Deseja continuar? (S) Sim ou (N) Não\n")
					leia(opcao)
					
				}enquanto(opcao == 'S' ou opcao == 's')
				
				se((opcao == 'N' ou opcao == 'n') e encontra==1)
				{	
					linha()
					escreva("Matricula: "+matriculas[salva]+"\tNome: "+alunos[salva]+"\t\tSexo: "+sexoAlunos[salva]+"\t\tNota:" +notas[salva]+"\tSituação:"+situacao[salva])	
				}	

				
			}//Final da Opcao 1
			
			senao se (painel==2)
			{		linha()
					escreva("Lista de Homens:")
					para (inteiro x=0; x< 39; x++)
					{
						se(sexoAlunos[x] == 'M')
						{
							escreva("\nMatricula: "+matriculas[x]+"\tSexo: "+sexoAlunos[x]+"\t\tNota:" +notas[x]+"\tSituação:"+situacao[x]+"\tNome: "+alunos[x])	
						}
					}
				
						
				//GIDEÃO
			}//Final da Opcao 2

			
			senao se (painel==3)
			{
				linha()
				escreva("Lista de Mulheres:")
					para (inteiro x=0; x< 39; x++)
					{
						se(sexoAlunos[x] == 'F')
						{
							escreva("\nMatricula: "+matriculas[x]+"\tSexo: "+sexoAlunos[x]+"\t\tNota:" +notas[x]+"\tSituação:"+situacao[x]+"\tNome: "+alunos[x])					
						}
					}

				//VERONICA
			}//Final da Opcao 3

			
			senao se (painel==4)
			{
				escreva("\nLISTA DOS ALUNOS APROVADOS E ALUNAS APROVADAS: ")
				 para(inteiro x = 0; x < 39; x++)
			 	{
			  		se(situacao[x] =="APROVADO" ou situacao[x] == "APROVADA")
			  		{
			  			escreva("\nMatricula: "+matriculas[x]+"\tSexo: "+sexoAlunos[x]+"\t\tNota:" +notas[x]+"\tNome: "+alunos[x])	
			  			 encontra4=1	
			  		} 	
			  		
			 	}
			 	se(encontra4==0)
				{
					escreva("Lista vazia")
				}
				
				//JJ
			}//Final da Opcao 4

			
			senao se (painel==5)
			{
				escreva("\nLISTA DOS ALUNOS REPROVADOS E ALUNAS REPROVADAS: \n")
				para(inteiro kc = 0; kc < 39; kc++) 
				{
					se(situacao[kc] == "REPROVADO" ou situacao[kc] == "REPROVADA") 
					{	
						escreva("\nMatricula: "+matriculas[kc]+"\tSexo: "+sexoAlunos[kc]+"\t\tNota:" +notas[kc]+"\tNome: "+alunos[kc])	
					     encontra5=1	
					}
						
					
				}
				se(encontra5==0)
				{
					escreva("Lista vazia")
				}
				//BEYMAR
			}//Final da Opcao 5
			senao se (painel==6)
			{	
				linha()
				escreva("Escreva uma nota limite: ")
				leia(notaLimite)
				escreva("Deseja ver as notas acima ou abaixo dessa nota limite. [1]Acima ou [2]Abaixo: ")
				leia(tampa)
				linha()
				se(tampa==1){
					
					escreva("Lista de alunos e alunas com nota maior que "+notaLimite+": \n")
					para (inteiro x=0; x< 39; x++){
		
						se(notas[x]>=notaLimite){
							
							escreva("Matricula: "+matriculas[x]+"\tSexo: "+sexoAlunos[x]+"\t\tNota:" +notas[x]+"\tSituação:"+situacao[x]+"\tNome: "+alunos[x]+"\n")	
						}
						senao{
							k=1
						}
						
					}
					se(k==1)
					{
						escreva("Não existe uma nota maior que "+notaLimite)
					}
				}

				se(tampa==2){
					escreva("Lista de alunos e alunas com nota menor que "+notaLimite+": \n")
					para (inteiro x=0; x< 39; x++)
					{
						se(notas[x]<=notaLimite)
						{
							escreva("Matricula: "+matriculas[x]+"\tSexo: "+sexoAlunos[x]+"\t\tNota:" +notas[x]+"\tSituação:"+situacao[x]+"\tNome: "+alunos[x]+"\n")			
						}
					}
				}
			
			}//Final da Opcao 6


				
		}enquanto(painel!=0)//FINAAL DO LOOP PRINCIPAL
	}//Final da funcão INICIO


	funcao linha(){
		escreva("\n----------------------------------------------------------------\n")
	}
	funcao pula(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5665; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */