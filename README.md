# Jogo de cartas slay the lascado
## sistema desenvolvido usando a ide vscode e linguagem java. O sistema consiste em um jogo de cartas com criaçao de decks e batalhas simuladas.

# Folder Structure
## O projeto esta distribuido em um sistemas de package no source
  packge:
- Console : entrada e saida de dados
- Models : classes de todos objetos
- Batalhas: calsses e models usadas pra implementar o modo batalha.
- Principal: onde se encontra o metodo main de execução do programa
- Sistema: contem todo fluxo de criacao de menus, listas, e consultas.
- Interface: contem algumas interfaces que fazem implementaçao dos metodos no modelo.
- save jogo: json com o save do jogo contendo os jogadors decks cartas.
- Lib: tem as blibliotecas que foram usadas pra salvar e ler os arquivos json.

# instruçoes de instalacao e execução

   Nessessario pegar os arquivos na pasta lib e adcionar no JRE System Library
   e  inicia o programa normalmente, compila e roda, seguindo o seguinte fluxo:

Se der tudo certo, na graça de deus e confiança no nosso codigo.

# caminho feliz:

## Menu login 
- Cadastra o jogador
- Seleciona login 
deposi de logado 
## Menu deck
- Cadastra deck
- Edita deck ( adiciona cartas ao deck)
Seleciona opcao no:
## Menu batalhas simuladas
- exibe o nome do jogador 
- Adciona o nome do inimigo
- iniciar batalha
    Quando iniciado a batalha o deck escolhido vai batalhar com um deque de mesmo tamanho (n vezes) ate que um dos desafiantes
chegue ao 0 ( zero ) de vida de jogador( ambos contem 50 de vida).
resultado da Batalha é mostrado na tela.
    As cartas Podem ser de ataque defesa ou suport, dependendo do tipo da carta. 
elas possuem tambem raridade( rara, comum, ou legendaria).

# Camninho com outras funçoes:

## Menu login 
- Cadastra o jogador
- Seleciona login 
depois de logado 
## Menu deck
seleciona uma das opçoes:
- Cadastra deck( pode cadastrar varios decks pra um mesmo jogador, porem um de cada vez)
- Edita deck (mostra os decks que o jogador possui bem como a opçao de adicionar cartas ao deck selecionado, ou apagar ou vizualizar todas as cartas, depois de editar clica em voltar pra o menu anterior , e clicar em voltar de novo pro menu anterior e clicar em sair pra quando sair salvar as alteracoes , vc faz isso caso nao queira ir direto pra batalha, ai essa seria a forma de salavar sem ir a batalha)
- excuir deck
## Menu batalhas simuladas( se escolhido mostra o menu de batalhas)
no menu d ebatalhas temos as opçoes 
- iniciar batalha
- Adiona o nome do jogador 
- Adciona o nome do inimigo
 So pode iniciar o jogo quando selecionar o inimigo( digitar o nome )
 e selecionar jogador.
 seleciona finalmente iniciar batalha.
 e segue no mata mata ate finalizar vida de jogador.
 terminou a batalha voce é direcionado ao menu batalhas clica em voltar ou sair 
 voce sai do menu batalhas e volta pra o de deck ,
 onde voce pode voltar pro menu inicial e sair. <<3>>

## Dependency Management

jackson-annotations-2.17.1.jar
jackson-core-2.17.1.jar
jackson-databind-2.17.1.jar
java-json.jar
json-simple-1.1.jar

## Nome dos Integrantes e as Branchs que desenvolveram
-Fernanda Luiza: BatalhaCartas;
-Fernanda Silva: masterAlternativa;
-Victor de Luca: MasterExcecao;
-Matheus Mafioletti: MasterRevisao (incluindo commite hash 45223f190c7ce45b5f10c77ae7b34dec2dc93bd4 ), main (dono do repo)

*Obs.: Matheus foi roubado e perdeu o computador, pegou um computador de Fernanda Silva emprestado e acabou commitando com o git dela que estava cadastrado na maquina!
Commites feitos na branch MasterRevisão foram feitos por ele.
