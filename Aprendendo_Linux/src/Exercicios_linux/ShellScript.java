package Exercicios_linux;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 11/03/2021 
*/
public class ShellScript {
/*
   OQUE É SHELL SCRIPT ?
   Shell em computação é um interface de usuário para acessar
   os serviços de um sistema operacional.
   
   Script é uma linguagem de programação que executa no sistema em
   tempo de execução, muito utilizada para automação.
   
   MUDAR DE DIRETÓRIO
   Comando cd -> Serve para mudar de diretório
   
   cd / Abre o diretório raiz do sistema
   
   cd ~ Abre o diretório do usuário correte.O usuário logado naquele instante
   
   cd .. Volta um diretório
   
   LISTAR ARQUIVOS
   Comando serve para listar diretórios
   
   ls -l Lista arquivos em coluna detalhado
   
   ls -a Lista conteudo até os arquivos ocultos
   
   ls -s Lista o conteudo com tamanho alocado de cada arquivo em bloco.
   
   COMANDO TOUCH
   É utilizado para criar arquivos vazios ou alterar data e hora dos arquivos
   
   Criar arquivos multiplos 
   touch nomeFile1.txt nomeFile2.txt nomeFile3.txt
   
   Alterar hora de acesso
   touch -a nomeFile1.txt
   
   Alterar hora da modificação
   touch -m nomeFile1.txt
   
   Alterar hora de acesso sem criar um novo arquivo	
   touch -c nomeFile1.txt
   
   COMANDO CAT 
   Comando para visualizar o conteudo do arquivo
   
   cat nomeFile1.txt -> visualiza o conteudo do arquivo
   
   cat nomeFile1.txt > nomeFile2.txt -> Direciona o conteudo do primeiro arquivo para o segundo arquivo
   
   cat >> nomeFile1.txt
   
   MOVER ARQUIVOS
   O comando mv serve tanto para mover arquivos quanto para renomear arquivos
   
   mv nomeFile1.txt nomeFile2.txt -> renomeia o primeiro arquivo com o nome do segundo.
   
   SITUAÇÕES 
   -i Confirma a alteração
   -n Sem subistituição do arquivo
   -b Subistitua o arquivo
   
   COPIAR ARQUIVOS
   Permite copiar arquivos para outro local
   
   cp -i nomeFile1.txt /home/fabiano/eclipse
   
   CRIANDO DIRETÒRIOS
   
   mkdir nomeFile -> Cria diretórios
   
   rm nomeFile1.txt -> Remove arquivos
   
   rm -rf remove arquivos e diretoris sem fazer perguntas 
   
   PROCURA POR ARQUIVOS
   
   find nomeFile1.txt -> prrocura pelo arquivo nomeFile1.txt
   
   AJUDA SOBRE O COMANDO
   
   man ls
   man find 
   man ....
   
   COMPARAR DIFERENÇA ENTRE ARQUIVOS
   diff nomeFile1.txt nomeFile2.txt
   
   REMOVE DIRETÒRIOS
   
   rmdir nomeFile1 remove diretório vazio
   
   rm -rf nomeFile2 remove diretório que contem informações
   
   env mostra todas variáveis de ambiente
   
   
   
 */
}
