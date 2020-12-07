programa
{
	
	funcao inicio()
	{
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
		cadeia aluno
		real notas[39]
		caracter opcao= 's'
		inteiro salva=0
		
		para (inteiro x=0; x< 39; x++)
		{
			se(x < 10){
				matriculas[x] = "G4-0"+(x+1)	
			}
			senao{
				matriculas[x] = "G4-"+(x+1)	
			}
		}
		
		/*para (inteiro x=0; x< 39; x++){
			escreva("\nmatricula:", matriculas[x], " - ",alunos[x])
		}
		*/
		enquanto(opcao == 'S' ou opcao == 's')
		{
		
			escreva("\nEscolha um aluno pela matricula:" )
			leia(aluno)
		
			para (inteiro x=0; x<39; x++) //molejão
			{
				se(aluno == matriculas[x])
				{
					escreva("Informe a nota do alune: ")
					leia(notas[x])
					salva = x
				}
			}
			escreva("Deseja continuar? (S) Sim ou (N) Não")
			leia(opcao)
		}
		
		se(opcao == 'N' ou opcao == 'n')
		{
			limpa()
			escreva("Matricula:"+matriculas[salva]+"Nome: "+alunos[salva]+"Sexo: "+sexoAlunos[salva]+"Nota:" +notas[salva])	
		}
	}
}
		
			
		
		
		
		



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1550; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */