package Exercicios_linux;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 10/03/2021 
*/
public class LembreteDaRevisao {
/*
 PARTE 1 ------------------------------------------------------------------------------------------------------

COMMANDOS LINUX

CONTROL + C → Cancela o comando atual em funcionamento.
CONTROL + Z → Pausa o comando atual em funcionamento ou em segundo plano.
CONTROL + D → Faz o logout da sessão atual.
CONTROL + W → Apaga uma palavra na linha atual.
CONTROL + U → Apaga a linha inteira.
CONTROL + R → Busca um comando recente.
!! → Repete o ultimo comando.
Exit → Encerra o terminal.


PARTE 2 ------------------------------------------------------------------------------------------------------

USANDO O NANO TEMOS AS SEGUINTES TECLAS DE ATALHO

CRTL+ G → ou F1 Obtem ajuda no nano
CRTL+ X → sai do arquivo de ajuda do nano
CRTL+ J  → vai justificar o texto no nano
CRTL + U →  desfas as modificações e como o control z do windows
ALT + E  → Refaz o processo anterior
ALT + A → Ele vai marcando o texto
ALT + 6 → Ele vai copiar  o texto
CRTL + U → vai colar o texto
CRTL + T → Ele verifica a ortografia
CRTL + / → substitui palavras e como um replace
CRTL + O →  faz a gravação do texto

CAT + O → NOME DO ARQUIVO Mostra o conteudo do arquivo.
TAC  → Invert as linhas que foram digitadas
HEAD → Mostra as 10 primeiras linhas do arquivo de texto
TAIL → Mostra as 10 ultimas linhas do texto.
> → É utilizado para incrementar mais texto  e passar para um arquivo novo.
CAL → mostra o calendario do mês corrente
>> → Insere mais textos ao arquivo.
| → Conecta a saida de um comando a outro.
GREP → procura por um determinado texto dentro de um arquivo de texto
NOME DO ARQUIVO + MORE → Faz paginação
LESS → também faz paginação
& e&& → O primeiro quebra o processo de exibição ,o segundo mostra tudo sem quebrar a exibição.
FILE → mostra o tipo de arquivo
WHATIS → Determina a função que o comando faz
FIND → Tras o caminhodo arquivo 









PARTE 3-----------------------------------------------------------------------------------------------------------

/ → É o diretório raiz do linux
/bin → Binarios principais dos usuarios
/boot/ → Arquivos do sistema de boot
/dev/ → Arquivos de dispositivo
/etc/ → Arquivos de configuração do sistema
/home/ → Diretorios dos usuarios comuns do sistema
/lib / → Biblioteca essenciais do sistema e modulos do kernel
/media/ → Diretorios de montagem e dispositivo
/mnt/ → Diretorio de montagem do sistema mesmo que o média
/opt/ → Instalação de sistemas não oficiais da distribuição ou por conta do sitema
/sbin/ → Armazena arquivos executaveis que representam comandos administrativos EX:shutdown
/srv/ → Diretorios para dados de serviços fomentados pelo sistema
/tmp/ → Diretorios para arquivos temporarios
/usr/ → Segunda herança do sistema ficam os usuarios  comuns  do sistema a programa
/var/ → Diretorio com arquivos variaveis gerados pelos programas do sistema logs,impressoras email e cache
/root/ → Diretorios do sistema root.O usuario  que tem total poder sobre o sistema,podendo mudar suas configurações
/proc/ → Diretorio virtual controlado pelo sistema


PARTE 4 -----------------------------------------------------------------------------------------------------------

CAT PROC/CPUINFO → arquivo de informações do processador
LSCPUINFO→ Exibi informações do processador
CAT PROC/MENINFO → Exibi informações da memoria do computador
FREE → Exibe informações da memoria fisica e virtual
LSHW→ Exibe informações detalhadas todod os hadware do pc
LSHW -SHORT → Exibe informações de hardware
UNAME → Exibe o nome do kernel do sistema
UNAME -R →  Exibe a versão do kernel
UNAME -M Exibe a arquitetura do kernel
ARCH → Exibe a arquitetura do kernel
LSPCI → Exibe todas as placas pci conectadas
LSUSB → Exibe todos dispositivos usb conectados
DU -H ~ → Exibe o espaço que cada arquivo e pasta no diretorio pessoal consome no hd
REBOOT → Reinicia o sistema
SHUTDOWN -r → Reinicia o sisteam
SHUTDOWN -H NOW→ Desliga o sistema rapidamente



PARTE 5 -----------------------------------------------------------------------------------------------------------

A cada equipamento que esta conectado em nossa rede damos o nome de nó,então seu celular é um nó seu computador é outro nó e assim sucessivamente

Wan é uma rede de área mundial onde varios paises estão interligados
Man é uma rede que interliga varias metropoles ,uma cidade a outra cidade
Lan é uma rede local ex: a nossa ca temos uma rede local.

PROTOCOLO é uma linguagem de comunicação entre uma máquina e outra para que eles consigam se entender .

PROTOCOLO IPO → Protocolo de internet – Endereço IP → Numero que identifica seu computador em uma rede.

PROTOCOLO (ICMP) →Tem por objetivo prover mensagens de controle na comunicação entre nós.

DNS → Esse protocolo tem por função identificar endereços IP,ele mantem uma tabela de endereços dos caminhos de algumas redes.

INTERFACES DE REDE → São software ou hadware que fazem a comunicação entre as redes , ex:> a placa de rede ,as interfaces no linux estão localizadas no diretório /dev/ essas interfaces são  criada quando o software pede pox exemplo criar uma interface para o wif.

LOOPBACK  127.0.0.1→ É uma interface que você consegue fazer testes antes de subir seu software para o servidor.

IFCONFIG → Mostra o ip da nossa máquina

INET → É o endereço IP → Endereço da minha máquina

NT MASC  → É um número de 32 bits que separa  a rede publica da minha rede local

BROADCAST → É um endereço que se no caso eu enviar uma mensagem por esse endereço todos que estão nessa rede ira receber

INET → É uma sequenc ia de exadecimal ,porque pode ter muito mais computatores inserido na rede do que o ipv4

ETHER → Endereço fisico da sua placa de rede.

HOSTNAME → Retorna o nome do computador na rede

HOSTNAME  -I  → Retorna o endereço IP da máquina. hostname -I OBS:É menos I MAIUSCULO

                         -i → Minusculo retorna o LOOPBACK. Que é o endereço de teste você pode se comunica um cliente com o servidor no mesmo root

WHO → mostra como estamos logado na rede

WHOAMI → mostra o nome de como estou logado narede

PING → Envia mensagens de controle para um determinbado root,verifica se esse root esta ativo ou inativo para parar o comando ping podemos usar o control +z  ou utilizar o ping www.google.com -  w 4 vai verificar apenas 4  pacotes de dados

DIG → www.google.com → tras todas as informações do caminho de rede sobre o DNS

TRACEROUT → Mostra por quanto dispositivos possou para chegar no google.

dig www.google.com +short → Retorna o endereço ip do site que você esta pedindo

WHOIS → Tras em detalhes tudo de quem hospedou o site

FINGER → Mostra toda informação do usuario que esta logado no seu route


PARTE 6 -------------------------------------------------------------------------------------------------------------
Aumentar texto no linux → No terminal vá em preferencias ,perfil sem nome.
HISTORY → mostra um histórico dos comandos que você utilizou
HISTORY -C→ limpa o historico
ALIAS → pode ser usado para criar comandos,Ex: Posso pegar o comando clear e passar para apenas s assim: alias s=”clear”
NL → mostra o arquivo igual ao cat,porem mostra com o numero referente a cada linha.
WC -L → Conta quantas linhas tem o arquivo
WC -W→ Conta quantas palavras tem no arquivo
WC -C → mostra o numero de byts do arquivo
WC -M → mostra o numero de caracteres tem o arquivo
LS -A →  mostra os arquivos ocultos no diretorio
CPM → verifica se o arquivo esta vazio
DIFF → Mostra se o arquivo não esta vazio
SORT  -n→organiza o arquivo
LAST REBOOT → mostra todas informações de reinicialização do sistema 
ROUTW -N → mostra o roteamento
TIME → mostra o tempo de um processo ex: time traceroute
UPTIME → mostra o tempo que o sistema ta rodando

COWSAY→ cowsay “linux e bom”
                  cowsay  -d “vaquinha estragada”
                  cowsay -g “vaquinha com sifrao”
           
                   cowsay -f tux “vaquinha com sifrao”
                   cowsay -f vader “vaquinha com sifrao”
                   cowsay -f  vader-coala “vaquinha com sifrao”

CMATRIX → imita a tela do filme matrix

Comandos para desligar a máquina
INIT 0
TELNIT 0
HALT
SEQ 1  20

VIAI  ou vi é um editor de texto.

WHEREIS LS→ mostra a informação de onde esta o programa ls

LOAUT → Sai do local route



PARTE 7-------------------------------------------------------------------------------------------------------------
 
ADDUSER + Nome do Usuario → adiciona um usuario
SUDO → eleva o grau do usuario

Ex: sudo adduser fas


SU + NOME DO USUARIO → Como trocar de usuario no caso fas
PASSWD + NOME DO USUARIO no caso fas
         COMO FASER SENHAS SEGURAS  →  ZENIT
                                       POLAR

         VOU PEGAR MEU NOME E TROVA PELAS LETRAS QUE TEM LA EXEMPLO
                                       FIBAIL

LAST LOG → exibe informações de login de todos  usuarios do sistema 
LAST → Exibi uma listagem de entrada e saida do usuario no sistema
LOGNAME→ Exibi o nome do usuario atual logado no sistema
ID→ Mostra os grupos que o usuario esta inserido
USERDEL -R + NOME DO USUARIO → Remove um usuario e a pasta pessoal do mesmo
CAT /ETC/PASSWD → Exibe todos usuarios do sistema
CAT /ETC/GROUP  → Exibe todos os grupos do sistema
GROUPS → Mostra quais usuarios nosso grupo pertence
ADDGROUP → Adiciona um grupo de usuario
ADDUSER → Adiciona um usuario a um grupo
GPASSWD -A Também adiciona um usuario a um grupo
GPASSWD -D Remove um usuario de um grupo
GROUPDEL + NOME DO GRUPO → Remove o grupo

                                 PERMISSÕES
PERMISSÕES EM ARQUIVOS E DIRETORIOS 
SERVEM PARA RESTRINGIR ACESSOS COMO:
R - READ (LEITURA)
W – WRITE (ESCRITA)
X – EXECUTION (EXECUÇÃO)

LS -LH Exibe detalhe das permissões dos arquivos e diretórios

indicador  administrador   grupo   outros       root       grupo    tamanho   mês  dia    hora      Nome 
     d         rwx          r-x     r-x        fabiano    fabiano     4,0k    jul  13     19:40    ‘home’
     -         rw-          rw-     r--        fabiano    fabiano     2       fev  14     20:00    fas.txt

MUDAR AS PERMIÇÕES DE UM ARQUIVO – COMANDO CHMOD

MODO OCTAL E COMPOSTO POR NUMEROS SOBRE A BASE 8 OU SEJA DE  0 A 7 ONDE.
O PRIMEIRO DIGITO REPRESENTA O DONO DO FICHEIRO /DIRETÓRIO (U).
O SEGUNDO DIGITO REPRESENTA O GRUPO (G).
O TERCEIRO REPRESENTA OS OUTROS (O).
AS PERMISSÕES SÃO EXPECIFICADAS 


PARTE 8 ------------------------------------------------------------------------------------------------------------------------

COMPACTADORES

Compactadores são programas diminuem o tamanho de um arquivo ou programa.
Quanto maior a taxa de compactação menor ficara o tamanho do arquivo

Para compactar usa – se o gzip + o nome do arquivo
Para descompactar usa – se gunzip + o nome do arquivo.gzip
gzip -9 para utilizar uma taxa de compressão maior

zip + nome do local onde vai ficar guardado + nome do arquivo

bzip2 + nome do arquivo a se compactado
bzip2 -d + nome do arquivo a se descompactado

rar a nomerar aularedes.txt para compactar
rar x + nome do arquivo.rar

para arquiva arquivos usa – se o tar 

tar -cf arquivos.tar aula.txt vai.txt set.txt ….. para arquivar 

Para compactar pode – se usar zip + nome do arquivo

Para descompactar usa -se tar -xvf + nome do arquivo



PARTE 9 -------------------------------------------------------------------------------------------------------------
GERENCIAMENTO DE PACOTES 

Pacotes são programas colocados dentro de um arquivo  identificados por sua extenção,e incluem arquivos necessários para a instalação de programas.

São sistemas que possuem resolução automática de dependencia de pacotes,Eemplo
dpgk, apt e yum.

Exemplo: sudo apt install nmap por exemplo → apt é um gerenciador de pacote necessario para a instalação do git

Para fazer a atualização de um pacote usa -se o UPGRADE Exemplo:
sudo apt upgrade + nome do pacote que no caso é (nmap)

Para remover um pacote utilisa – se o comando remove Exemplo:
sudo apt remove nmap

FAZENDO ATUALIZAÇÃO DE SISTEMA

Primeiro é necessário passar para o usuario root
sudo su → É o comando necessário parea isso.

Sudo apt update && upgrade Faz a atualização do sistema.

SITES DE PACOTES

  pkgs.org
  rpm.pbone.net

INSTALAÇÕES DE PACOTES COM DPKG -I

sudo dpkg -i + o nome do pacote
sudo dpkg -I + o nome do pacote informações do pacote

COMO FAZER A REMOÇÃO DO PACOTE
sudo dpkg -r + o nome do pacote
   
INSTALAÇÃO DE PACOTES RPM

É Necessário rpm -ivh pacote.rpm

rpm -U nome do pacote faz a atualização do sistema

rpm -e   nome do pacote remove pacotes

TAMBÉM FAZ INSTALAÇÃO DE PACOTES RPM O COMANDO YUM

sudo yum install e nome do pacote
sudo yum upgrade e nome do pacote
sudo yum remove e o nome do pacote
 
 */
}
