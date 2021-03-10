package Exercicios_linux;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 10/03/2021 
*/
public class Exercicio_revisao_06 {

	public static void main(String[] args) {
		/*
		  1) Crie um arquivo chamado compactar.txt
		     R: passo 1:ctrl + alt + t -> Para abrir o terminal
		        passo 2:ls -> Para listar o diretório em que você se encontra
		        passo 3:touch compactar.txt
		        passo 4:ls -> Para listar o diretório em que você se encontra e verificar se o arquivo foi criado realmente.
		      
		  2) Edite este arquivo com os nomes dos compactadores
		     R:cat > compactar.txt
		       gzip,zip,bzip2,rar
		       Se caso você quizer verificar se o arquivo foi gravado digite 
		       cat e o nome do arquivo Ex: cat compactar.txt
		       
		  3) Compacta este arquivo com zip
		     R:zip arquivos.zip compactar.txt
		     
		  4) Descompacta o arquivo
		     R:unzip arquivos.zip
		     
		  5) Compacta o arquivo com rar
		     R:rar a arquivos2.rar compactar.txt
		     
		  6) Descompacta o arquivo
             R:rar -x arquivo2.rar		  
               
		  7) Compacta o arquivo com gzip
		     R:gzip compactar.txt
		       
		  8) Descompacta o arquivo
		     R:gunzip compactar.txt.gz
		     
		  9) Compacta este arquivo com bsip2
		     R:bzip2 compactar.txt
		     
		 10) Descompacta o arquivo
		     R:bzip2 -d compactar.txt.bz2
		     
		 11) Realize o arquivamento com tar
		     R:tar -cf arquivandoArquivos.tar arquivos.zip arquivos2.rar compactar.txt.bz2
		     
		 12) Compacta o arquivo tar com gzip
		     R:gzip arquivandoArquivos.tar
		     
		 13) Descompacta este arquivo
		     R:gunzip arquivandoArquivos.tar
		     
		 14) Saia do terminal
		     R:	exit
		     
		 15) Exiba o arquivo compactar.txt
		     R:passo 1:unzip arquivos.zip
		       passo 2:ls
		       passo 3:cat compactar.txt
		       
		 16) Execute o comando int 0 para desligar o computador
		     R:int 0.
		*/

	}

}
