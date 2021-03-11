package Exercicios_linux;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 18/02/2021 
*/
public class Exercicio_revisao_02 {
/*
    Exercícios de Revisão
	1) Crie uma pasta de nome Exercícios e Acesse a mesma
	   R:Passo 1:CRTL + ALT + T -> para abrir o terminal
	     Passo 2:ls -> para listar os arquivos do diretorio que você se encontra.
	     Passo 3:mkdir Exercicios -> cria a pasta Exercicios
	     Passo 4:ls -> lista os arquivos no diretório corrente
	     Passo 5:cd Exercicios -> entra no diretório Exercicios
	     
	2) Crie um arquivo vazio de nome lista_nomes.txt
	   R:Passo 1:touch lista_nomes.txt -> cria um arquivo vazio
	     Passo 2:ls -> lista os arquivos no diretório corrente
	     
	3) Abra este arquivo com o Editor Nano
	   R:nano lista_nomes.txt -> Abre o arquivo no editor nano
	   
	4) Digite 20 Nomes de Pessoas Conhecidas incluindo o seu, pulando de linha para cada nome inserido.
	 R:Fabiano
	   Suzana 
	   Tatiana
	   Rafael
	   Maria
	   João
	   Valdir
	   Weslei
	   Suziana
	   Antonio
	   Ditinha
	   Paulo
	   Mateus
	   Danilo
	   Caio
	   Rogeria
	   Zero
	   Peludinho
	   Clotilde
	   Francisco
	5) Salve o arquivo
	   R:Passo 1:CRTL + O -> Comando para salvar o texto
	     Passo 2:da enter
	     Passo 3:exit -> Sair do terminal
	     Passo 4:CRTL + ALT + T -> para abrir o terminal
	     Passo 5:cd Exercicios -> entra no diretório Exercicios
	   
	6) Exiba os 10 primeiros Nomes da Lista
	    R: Passo 5:cd Exercicios -> entra no diretório Exercicios
	       Passo 6:HEAD lista_nomes.txt -> lista os dez primeiros nomes da lista
	       
	7) Exiba os 10 ultimos Nomes da Lista
	   R: Passo 1:tail lista_nomes.txt 

	8) Procure no texto o seu nome
	   R:grep Fabiano lista_nomes.txt -> Grep procura por um determinado texto dentro de um arquivo
	   
	9) Crie um Arquivo chamado setembro.txt com a saida do comando cal.
	   R:Passo 1:cal Setembro 2021 > Setembro.txt Cria o arquivo e insere o calendario dentro dele
         Passo 2:ls lista os arquivos no diretório corrente
         
	10) Adicione o conteúdo do arquivo setembro.txt ao arquivo lista_nomes.txt
	    R:Passo 1:cat Setembro.txt >> lista_nomes.txt -> Adiciona o conteudo de um arquivo ao outro.
	      Passo 2:ls lista os arquivos no diretório corrente
	      Passo 3:cat lista_nomes.txt
	      
	11) Exiba o arquivo lista_nomes.txt com paginação
	    R:Passo 1:cat lista_nomes.txt more ou -> Exibe o conteudo do arquivo com paginação
	      Passo 2:less lista_nomes.txt Idem
	      
	12) Exiba o caminho do arquivos setembro.txt
	    R:find lista_nomes.txt ou pwd -> Mostra o caminho do arquivo

	13) Exiba o tipo do arquivo lista_nomes.txt
	    R:file lista_nomes.txt -> Devolve o tipo de arquivo
	    
	14) Exiba a explicação do comando ls
	    R:whatis ls -> Determina o que o comando faz

	15) Renomeie o Arquivo lista_nomes.txt para arquivo.txt
	    R:mv lista_nomes.txt arquivo.txt
	    
	16) Limpe o Terminal
	    R:clear
	    
	17) Saia do Terminal
	    R:exit
*/
}
