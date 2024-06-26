package Sistema;

import java.util.ArrayList;
import java.util.List;

import Console.Console;
import Models.Jogador;
import Batalhas.CartaDaBatalha;

import Batalhas.JogadorDaBatalha;
import Models.Carta;
import Models.CartasDoJogo;
import Models.Deck;

public class Sistema {

    // lista statica, pra que assim que inicializar o programa ja ter uma lista (
    // mesmo que vazia) pra checar o login.

    static List<Deck> decks = new ArrayList<>();
    static CartasDoJogo cartaDoJogo = new CartasDoJogo();
    static List<Jogador> jogadores = new ArrayList<>();

    // o -1 é pra caso o jogador que começa com indice 0, mas na posicao 1 , posiçao
    // 1 menos 1 = zero. que é onde ta ojogador na lista.

    static int posicaoindiceJogadorlogado = -1;

    // menu inicial com todo o fluxo de inicializaçao, e escolha de opçao do menu de
    // login.

    public static void menuFluxo(List<Jogador> listaDeJogadores) {
        int op;
        cartaDoJogo.InicializarListaDeCartas();

        if (listaDeJogadores != null) {

            // Carregando os jogadores salvos
            // jogadores = listaDeJogadores;
            jogadores.addAll(listaDeJogadores);
        }

        System.out.println("Bem vindos ao slay the lascado ");

        do {

            Menu.menuLogin();
            op = Console.lerInt();
            switch (op) {
                case 1:
                    verificarLogin();
                    break;
                case 2:
                    Jogador novoJogador = Cadastro.cadastrarJogador();
                    jogadores.add(novoJogador);
                    // jogadores.add(Cadastro.cadastrarJogador());
                    break;
                case 0:
                    sair();
                    break;
                default:
                    break;
            }

        } while (op != 0);
    }

    // menu pra escolher opçao de acoes que deseja executar envolvendo deck
    public static void menuOpcaoDeckFluxo() {
        int op;
        do {
            Menu.menuDeck();
            op = Console.lerInt();
            switch (op) {
                case 1:
                    jogadores.get(posicaoindiceJogadorlogado).addDeckDoJogador(Cadastro.cadastrarNovoDeck());
                    editarDeck();
                    break;
                case 2:
                    verDecksCadastrados();
                    // deve mostrar cartasdodeke5
                    break;
                case 3:
                    verDecksIncompletos();
                    break;
                case 4:
                    editarDeck();
                    break;
                case 5:
                    // Menu de Batalha , escolha de opçoes bem como acoes pra executar a batalha
                    separarDeckDeBatalhaEComeçarMenuBatalha();
                    break;
                case 0:
                    break;

                default:
                    System.out.println("digite uma opçao valida");
                    break;
            }
        } while (op != 0);

    }

    public static void sair() {
        System.out.println("Ate a proxima! ");
        salvarArquivo();
    }

    public static void verificarLogin() {
        System.out.println("Porfavor digite o nome de usuario cadastrado: ");
        String jogadorAserBuscado = Console.lerString();

        for (int i = 0; i < jogadores.size(); i++) {

            if (jogadores.get(i).getNome().equals(jogadorAserBuscado)) {
                posicaoindiceJogadorlogado = i;
            }
        }
        if (posicaoindiceJogadorlogado != -1) {
            System.out.println("logado com sucesso!");
            menuOpcaoDeckFluxo();
        } else {
            System.out.println("jogador nao cadastrado!");
            System.out.println("Porfavor cadastre um usuario!");
        }

    }

    public static void editarDeck() {

        List<Deck> decksCadastrados = jogadores.get(posicaoindiceJogadorlogado).getListaDeDeckesDoJogador();

        System.out.println("Selecionar deck para editar");
        verDecksCadastrados();
        int numeroDoDeckIncompleto = Console.lerInt();

        Deck deckParaEditar = decksCadastrados.get(numeroDoDeckIncompleto - 1);

        int op;
        do {
            Menu.menuEditarDeckIncompleto();
            op = Console.lerInt();
            switch (op) {
                case 1:
                    adicionarCartaAoDeck(deckParaEditar);
                    break;
                case 2:
                    removerCartaDoDeck(deckParaEditar);
                    break;
                case 3:
                    visualizarCartasDoDeck(deckParaEditar);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("digite uma opçao valida");
                    break;
            }
        } while (op != 0);

        jogadores.get(posicaoindiceJogadorlogado).getListaDeDeckesDoJogador().set(numeroDoDeckIncompleto - 1,
                deckParaEditar);

    }

    public static void verDecksCadastrados() {
        Jogador jogadorLogado = jogadores.get(posicaoindiceJogadorlogado);
        List<Deck> deckDoJogador = jogadorLogado.getListaDeDeckesDoJogador();
        System.out.println("Decks Cadastrados");
        for (int i = 0; i < deckDoJogador.size(); i++) {
            System.out.print("Deck numero: " + (i + 1));
            System.out.println(" " + deckDoJogador.get(i).getNomeDoDeck());
        }
    }

    public static void verDecksIncompletos() {
        Jogador jogadorLogado = jogadores.get(posicaoindiceJogadorlogado);
        List<Deck> deckDoJogador = jogadorLogado.getListaDeDeckesDoJogador();
        System.out.println("Decks Incompletos");
        for (int i = 0; i < deckDoJogador.size(); i++) {
            if (deckDoJogador.get(i).getListadecartas() == null
                    || deckDoJogador.get(i).getListadecartas().size() < 15) {
                System.out.print("Deck numero: " + (i + 1));
                System.out.println(" " + deckDoJogador.get(i).getNomeDoDeck());
            }
        }
    }

    public static void verOpcoesDeCartas() {
        System.out.println("Cartas que podem ser selecionadas: ");
        for (int i = 0; i < cartaDoJogo.listaDecartas.size(); i++) {
            System.out.println((i + 1) + ". " + cartaDoJogo.listaDecartas.get(i).toString());
        }
    }

    // esse metodo adiciona uma nova carta , seja num deck novo ou em um deck criado
    // e incompleto.
    // pego o deck coloco uma carta dentro dele setto ele e depois devolvo pro menu.
    public static Deck adicionarCartaAoDeck(Deck deck) {

        List<Carta> listaDeCartasDoDeck = deck.getListadecartas();

        if (listaDeCartasDoDeck == null) {
            listaDeCartasDoDeck = new ArrayList<Carta>();
        }

        if (listaDeCartasDoDeck.size() < 15) {
            verOpcoesDeCartas();
            System.out.println("Digite o numero da carta que você quer adicionar no deck: ");
            int numeroDaCarta = Console.lerInt();

            List<Carta> listaDeCartasDoJogo = cartaDoJogo.getCarta();

            listaDeCartasDoDeck.add(listaDeCartasDoJogo.get(numeroDaCarta - 1));

            deck.setListadecartas(listaDeCartasDoDeck);
        } else {
            System.out.println("O deck esta completo!");
        }
        return deck;
    }

    public static void visualizarCartasDoDeck(Deck deck) {
        List<Carta> listaDeCartasDoDeck = deck.getListadecartas();
        for (int i = 0; i < listaDeCartasDoDeck.size(); i++) {
            System.out.println((i + 1) + ". " + listaDeCartasDoDeck.get(i).toString());
        }
    }

    public static Deck removerCartaDoDeck(Deck deck) {

        List<Carta> listaDeCartasDoDeck = deck.getListadecartas();

        System.out.println("Digite o numero da carta que você quer remover no deck: ");
        int numeroDaCarta = Console.lerInt();
        listaDeCartasDoDeck.remove(numeroDaCarta - 1);
        deck.setListadecartas(listaDeCartasDoDeck);

        return deck;
    }

    public static void salvarArquivo() {
        SaveJogoLerJson.saveDoArquivoJson(jogadores);
    }

    public static void separarDeckDeBatalhaEComeçarMenuBatalha() {

        System.out.println("Digite o numero do deck que você quer batalhar: ");
        verDecksCadastrados();
        int numeroDoDeck = Console.lerInt() - 1;

        Jogador jogadorLogado = jogadores.get(posicaoindiceJogadorlogado);
        List<Deck> deckDoJogador = jogadorLogado.getListaDeDeckesDoJogador();

        if (numeroDoDeck >= 0 && numeroDoDeck < deckDoJogador.size()) {
            List<Batalhas.CartaDaBatalha> listaCartas = new ArrayList<>();
            for (int i = 0; i < deckDoJogador.get(numeroDoDeck).getListadecartas().size(); i++) {

                int atkOuDefesa = deckDoJogador.get(numeroDoDeck).getListadecartas().get(i).getPoder();
                int tipoDeCarta = deckDoJogador.get(numeroDoDeck).getListadecartas().get(i).getTipo();

                if (tipoDeCarta == 1) {
                    Batalhas.CartaDaBatalha novaCarta = new CartaDaBatalha(atkOuDefesa, 0);
                    listaCartas.add(novaCarta);
                } else if (tipoDeCarta == 2) {
                    Batalhas.CartaDaBatalha novaCarta = new CartaDaBatalha(0, atkOuDefesa);
                    listaCartas.add(novaCarta);
                } else {
                    Batalhas.CartaDaBatalha novaCarta = new CartaDaBatalha(atkOuDefesa, atkOuDefesa);
                    listaCartas.add(novaCarta);
                }
            }

            Batalhas.SistemaDeBatalha.executar(
                    new JogadorDaBatalha(200, jogadores.get(posicaoindiceJogadorlogado).getNome()),
                    null, listaCartas);
        }

    }

}
