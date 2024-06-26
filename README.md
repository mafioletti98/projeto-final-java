## Jogo de cartas slay the lascado
# sistema desenvolvido usando a ide vscode e linguagem java. O sistema consiste em um jogo de cartas com criaçao de decks e batalhas simuladas.

## Folder Structure
# O projeto esta distribuido em um sistemas de package no source
  packge:
- Console : entrada e saida de dados
- Models : classes de todos objetos
- Batalhas: calsses e models usadas pra implementar o modo batalha.
- Principal: onde se encontra o metodo main de execução do programa
- Sistema: contem todo fluxo de criacao de menus, listas, e consultas.
- Interface: contem algumas interfaces que fazem implementaçao dos metodos no modelo.
- save jogo: json com o save do jogo contendo os jogadors decks cartas.
- Lib: tem as blibliotecas que foram usadas pra salvar e ler os arquivos json.

## instruçoes de instalacao e execução

   # Nessessario pegar os arquivos na pasta lib e adcionar no JRE System Library
   # e  inicia o programa normalmente, compila e roda, seguindo o seguinte fluxo:

Se der tudo certo, na graça de deus e confiança no nosso codigo.

# caminho feliz:

# Menu login 
- Cadastra o jogador
- Seleciona login 
deposi de logado 
# Menu deck
- Cadastra deck
- Edita deck ( adiciona cartas ao deck)
Seleciona opcao 
# Menu batalhas simuladas
- Adiona o nome do jogador 
- Adciona o nome do inimigo
- iniciar batalha
    Quando iniciado a batalha o deck escolhido vai batalhar com um deque de mesmo tamanho (n vezes) ate que um dos desafiantes
chegue ao 0 ( zero ) de vida de jogador.
resultado da Batalha é mostrado na tela.
    As cartas Podem ser de ataque defesa ou suport, dependendo do tipo da carta. 
elas possuem tambem raridade( rara, comum, ou legendaria).

## Camninho com outras funçoes:

# Menu login 
- Cadastra o jogador
- Seleciona login 
deposi de logado 
# Menu deck
seleciona uma das opçoes:
- Cadastra deck( pode cadastrar varios decks pra um mesmo jogador, porem um de cada vez)
- Edita deck (mostra os decks que o jogador possui bem como a opçaode adiciona cartas ao deck selecionado, ou apagar ou vizualizar todas as cartas)
- excuir deck
# Menu batalhas simuladas( se escolhido mostra o menu de batalhas)
no menu d ebatalhas temos as opçoes 
- iniciar batalha
- Adiona o nome do jogador 
- Adciona o nome do inimigo
 so pode iniciar o jogo quando selecionar o inimigo( digitar o nome )
 e selecionar jogador.
 ai vai e seleciona finalmente iniciar batalha.

## Dependency Management

jackson-annotations-2.17.1.jar
jackson-core-2.17.1.jar
jackson-databind-2.17.1.jar
java-json.jar
json-simple-1.1.jar
