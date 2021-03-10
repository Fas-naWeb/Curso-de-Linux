package Exercicios_linux;
/*
	Autor: Fabiano Alves Santos
	Email: fasnaweb2020@gmail.com
	Data: 25/02/2021 
*/
public class Exercicio_revisao_05 {

	public static void main(String[] args) {
		/*
		   1) Crie um usuário chamado teste
		      R:passo 1: crtl+alt+t -> Para abrir o terminal
		        passo 2:ls -> Lista o diretório que você se encontra
		        passo 3:sudo adduser teste
		        
		   2) Crie um grupo chamado grupoteste
		      R: sudo addgroup grupoteste
		      
		   3) Adicione o usuario teste ao grupo teste
		      R: sudo adduser teste grupoteste
		      
		   4) Troque a senha do usuário teste
		      R: sudo passwd teste
		      
		   6) Troque o usuário atual para teste
		      R: su teste
		      
		   7) Exiba todos usuários do sistema
		      R: cat /etc/passwd
		      
		   8) Exiba todos os grupos do sistema
		      R: cat /etc/group
		      
		   9) Delete o usuário teste
		      R:sudo userdel -r teste
		      
		  10) Delete o usuário grupoteste
		      R:sudo groupdel grupoteste
		      
		  11) Troque para o usuário root
		      R:sudo su
		      
		  12) Criar um arquivo teste.txt
		      R: touch teste.txt
		      
		  13) Edite o nome deste arquivo com o nome deste curso.
		      R:cat teste.txt
		      
		  14) Mude as permissões deste arquivo para 111
		      R: chmod 111 teste.txt
		      
		  15) Saia do usuário root para seu computador
		      R:su fabiano
		      
		  16) Teste exibir o arquivo teste.tx no terminal
		      R:cat teste.txt
		      
		  17) Desligue o computador pelo terminal
		      R:shutdown -h now
		 */

	}

}
