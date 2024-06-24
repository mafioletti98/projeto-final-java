package Sistema;

import java.util.ArrayList;
import java.util.List;

import Console.Console;
import Models.Jogador;
import Models.Carta;
import Models.CartasDoJogo;
import Models.Deck;

public class Sistema {
    // lista statica, pra que assim que inicializar o programa ja ter
    // uma lista ( mesmo que vazia) pra checar o login.
    static List<Jogador> jogadores = new ArrayList<Jogador>();
    static List<Deck> deks = new ArrayList<Deck>();
    static CartasDoJogo cartaDoJogo = new CartasDoJogo();

    static int posicaoindiceJogadorlogado;

    // menu inicial
    public static void menuFluxo() {

        int op;
        CartasDoJogo.InicializarListaDeCartas();

        do {
            System.out.println("Bem vindos ao  slay the lascado ");
            Menu.menuLogin();
            op = Console.lerInt();
            switch (op) {
                case 1:
                    verificarLogin();
                    break;
                case 2:
                    Cadastro.cadastrarJogador();
                    break;
                case 0:
                    sair();
                    break;

                default:
                    break;
            }

        } while (op == 0);

    }

    public static void sair() {
        System.out.println("Ate a proxima! ");
    }

    public static void cadastrarJogador() {
        Jogador jogadortemporario = new Jogador();
        System.out.println("Porfavor digite o nome de usuario: ");
        jogadortemporario.setNome(Console.lerString());
        jogadores.add(jogadortemporario);
        System.out.println("jogador cadastrado com sucesso!");
        menuFluxo();

    }

    public static void cadastrarDeck() {
        Deck deckTemporario = new Deck();
        System.out.println("Porfavor digite o nome do seu Deck: ");
        deckTemporario.setNomeDoDeck(Console.lerString());
        deckTemporario.setListadecartas(null);
        deks.add(deckTemporario);
        System.out.println("Deck cadastrado com sucesso!");
        menuFluxo();

    }

    public static void verificarLogin() {
        System.out.println("Porfavor digite o nome de usuario cadastrado: ");
        String jogadorAserBuscado = Console.lerString();

        for (int i = 0; i < jogadores.size(); i++) {

            if (jogadores.get(i).getNome().equals(jogadorAserBuscado)) {
                System.out.println("logado com sucesso!");
                posicaoindiceJogadorlogado = i;
                Menu.menuDeck();
            }
        }
        if (posicaoindiceJogadorlogado != 0) {
            menuFluxo();

        } else {
            System.out.println("jogador nao cadastrado!");
            System.out.println("Porfavor cadastre um usuario!");
            menuFluxo();
        }

    }

    public static void EditarDeckIncompleto() {

        List<Deck> decksCadastrados = jogadores.get(posicaoindiceJogadorlogado).getListaDeDeckesDoJogador();

        System.out.println("Selecionar deck incompleto para editar");
        int numeroDoDeckIncompleto = Console.lerInt();

        Deck deckParaEditar = decksCadastrados.get(numeroDoDeckIncompleto - 1);

        Menu.menuEditarDeckIncompleto();

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
        Menu.menuDeck();
    }

    public static void verDecksIncompletos() {
        Jogador jogadorLogado = jogadores.get(posicaoindiceJogadorlogado);
        List<Deck> deckDoJogador = jogadorLogado.getListaDeDeckesDoJogador();
        System.out.println("Decks Incompletos");
        for (int i = 0; i < deckDoJogador.size(); i++) {
            if (deckDoJogador.get(i).getListadecartas().size() < 15) {
                System.out.print("Deck numero: " + (i + 1));
                System.out.println(" " + deckDoJogador.get(i).getNomeDoDeck());
            }
        }
        Menu.menuDeck();
    }

    public static void verOpcoesDeCartas() {
        System.out.println("Cartas que podem ser selecionadas: ");
        for (int i = 0; i < CartasDoJogo.listaDecartas.size(); i++) {
            System.out.println((i + 1) + ". " + CartasDoJogo.listaDecartas.get(i).toString());
        }
    }

    // esse metodo adiciona uma nova carta , seja num deck novo ou em um deck criado
    // e incompleto.
    // pego o deck coloco uma carta dentro dele setto ele e depois devolvo pro menu.
    public static Deck adicionarCartaAoDeck(Deck deck) {

        List<Carta> listaDeCartasDoDeck = deck.getListadecartas();

        if (listaDeCartasDoDeck.size() < 15) {
            System.out.println("Digite o numero da carta que você quer adicionar no deck: ");
            int numeroDaCarta = Console.lerInt();

            List<Carta> listaDeCartasDoJogo = cartaDoJogo.listaDecartas;
            listaDeCartasDoDeck.add(listaDeCartasDoJogo.get(numeroDaCarta - 1));
            deck.setListadecartas(listaDeCartasDoJogo);
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

}
