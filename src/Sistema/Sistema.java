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
    List<Jogador> jogadores = new ArrayList<Jogador>();
    List<Deck> decks = new ArrayList<Deck>();
    CartasDoJogo cartaDoJogo = new CartasDoJogo();

    int posicaoindiceJogadorlogado = -1;

    Menu menu = new Menu();
    Cadastro cadastro = new Cadastro();

    // menu inicial
    public void menuFluxo() {
        int op;
        cartaDoJogo.InicializarListaDeCartas();
        System.out.println("Bem vindos ao  slay the lascado ");

        do {

            menu.menuLogin();
            op = Console.lerInt();
            switch (op) {
                case 1:
                    verificarLogin();
                    break;
                case 2:
                    jogadores.add(cadastro.cadastrarJogador());
                    break;
                case 0:
                    sair();
                    break;
                default:
                    break;
            }

        } while (op == 0);
    }

    public void menuDeck() {
        int op;
        do {
            menu.menuDeck();
            op = Console.lerInt();
            switch (op) {
                case 1:
                    decks.add(cadastro.cadastrarNovoDeck());
                    break;
                case 2:
                    verDecksCadastrados();
                    break;
                case 3:
                    verDecksIncompletos();
                    break;
                case 4:
                    editarDeckIncompleto();
                    break;
                case 5:
                    verDecksCadastrados();
                    break;
                case 0:
                    break;

                default:
                    System.out.println("digite uma opçao valida");
                    break;
            }
        } while (op == 0);

    }

    public void sair() {
        System.out.println("Ate a proxima! ");
    }

    public void verificarLogin() {
        System.out.println("Porfavor digite o nome de usuario cadastrado: ");
        String jogadorAserBuscado = Console.lerString();

        for (int i = 0; i < jogadores.size(); i++) {

            if (jogadores.get(i).getNome().equals(jogadorAserBuscado)) {
                posicaoindiceJogadorlogado = i;
            }
        }
        if (posicaoindiceJogadorlogado != -1) {
            System.out.println("logado com sucesso!");
        } else {
            System.out.println("jogador nao cadastrado!");
            System.out.println("Porfavor cadastre um usuario!");
        }

    }

    public void editarDeckIncompleto() {

        List<Deck> decksCadastrados = jogadores.get(posicaoindiceJogadorlogado).getListaDeDeckesDoJogador();

        System.out.println("Selecionar deck incompleto para editar");
        int numeroDoDeckIncompleto = Console.lerInt();

        Deck deckParaEditar = decksCadastrados.get(numeroDoDeckIncompleto - 1);

        int op;
        do {
            menu.menuEditarDeckIncompleto();
            op = Console.lerInt();
            switch (op) {
                case 1:
                    deckParaEditar = adicionarCartaAoDeck(deckParaEditar);
                    break;
                case 2:
                    deckParaEditar = removerCartaDoDeck(deckParaEditar);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("digite uma opçao valida");
                    break;
            }
        } while (op == 0);

        jogadores.get(posicaoindiceJogadorlogado).getListaDeDeckesDoJogador().set(numeroDoDeckIncompleto - 1,
                deckParaEditar);

    }

    public void verDecksCadastrados() {
        Jogador jogadorLogado = jogadores.get(posicaoindiceJogadorlogado);
        List<Deck> deckDoJogador = jogadorLogado.getListaDeDeckesDoJogador();
        System.out.println("Decks Cadastrados");
        for (int i = 0; i < deckDoJogador.size(); i++) {
            System.out.print("Deck numero: " + (i + 1));
            System.out.println(" " + deckDoJogador.get(i).getNomeDoDeck());
        }
    }

    public void verDecksIncompletos() {
        Jogador jogadorLogado = jogadores.get(posicaoindiceJogadorlogado);
        List<Deck> deckDoJogador = jogadorLogado.getListaDeDeckesDoJogador();
        System.out.println("Decks Incompletos");
        for (int i = 0; i < deckDoJogador.size(); i++) {
            if (deckDoJogador.get(i).getListadecartas().size() < 15) {
                System.out.print("Deck numero: " + (i + 1));
                System.out.println(" " + deckDoJogador.get(i).getNomeDoDeck());
            }
        }
    }

    public void verOpcoesDeCartas() {
        System.out.println("Cartas que podem ser selecionadas: ");
        for (int i = 0; i < cartaDoJogo.listaDecartas.size(); i++) {
            System.out.println((i + 1) + ". " + cartaDoJogo.listaDecartas.get(i).toString());
        }
    }

    // esse metodo adiciona uma nova carta , seja num deck novo ou em um deck criado
    // e incompleto.
    // pego o deck coloco uma carta dentro dele setto ele e depois devolvo pro menu.
    public Deck adicionarCartaAoDeck(Deck deck) {

        List<Carta> listaDeCartasDoDeck = deck.getListadecartas();

        if (listaDeCartasDoDeck.size() < 15) {
            System.out.println("Digite o numero da carta que você quer adicionar no deck: ");
            int numeroDaCarta = Console.lerInt();

            List<Carta> listaDeCartasDoJogo = cartaDoJogo.getCarta();
            listaDeCartasDoDeck.add(listaDeCartasDoJogo.get(numeroDaCarta - 1));
            deck.setListadecartas(listaDeCartasDoJogo);
        } else {
            System.out.println("O deck esta completo!");
        }
        return deck;
    }

    public void visualizarCartasDoDeck(Deck deck) {
        List<Carta> listaDeCartasDoDeck = deck.getListadecartas();
        for (int i = 0; i < listaDeCartasDoDeck.size(); i++) {
            System.out.println((i + 1) + ". " + listaDeCartasDoDeck.get(i).toString());
        }
    }

    public Deck removerCartaDoDeck(Deck deck) {

        List<Carta> listaDeCartasDoDeck = deck.getListadecartas();

        System.out.println("Digite o numero da carta que você quer remover no deck: ");
        int numeroDaCarta = Console.lerInt();
        listaDeCartasDoDeck.remove(numeroDaCarta - 1);
        deck.setListadecartas(listaDeCartasDoDeck);

        return deck;
    }

}
