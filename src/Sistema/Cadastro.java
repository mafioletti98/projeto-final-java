package Sistema;

import java.util.ArrayList;
import java.util.List;

import Console.Console;
import Models.Jogador;
import Models.Carta;
import Models.CartasDoJogo;
import Models.Deck;

public class Cadastro {
    static List<Jogador> jogadores = new ArrayList<Jogador>();
    static List<Deck> deks = new ArrayList<Deck>();
    static CartasDoJogo cartaDoJogo = new CartasDoJogo();

    static int posicaoindiceJogadorlogado;

    public static void cadastrarJogador() {

        Jogador jogadortemporario = new Jogador();
        System.out.println("Porfavor digite o nome de usuario: ");
        jogadortemporario.setNome(Console.lerString());
        jogadores.add(jogadortemporario);
        System.out.println("jogador cadastrado com sucesso!");
        Sistema.menuFluxo();

    }

    public static void CadastrarNovoDeck() {
        Deck deckCriado = new Deck();

        Menu.menuCadastrarDeck();

        jogadores.get(posicaoindiceJogadorlogado).getListaDeDeckesDoJogador().add(deckCriado);

    }

    public static void cadastrarDeck() {
        Deck deckTemporario = new Deck();
        System.out.println("Porfavor digite o nome do seu Deck: ");
        deckTemporario.setNomeDoDeck(Console.lerString());
        deckTemporario.setListadecartas(null);
        deks.add(deckTemporario);
        System.out.println("Deck cadastrado com sucesso!");
        Sistema.menuFluxo();

    }

    public static Deck cadastrarNomeDoDeck(Deck deck) {
        System.out.println("Digite o nome do deck: ");
        String nomeDoDeck = Console.lerString();
        deck.setNomeDoDeck(nomeDoDeck);
        return deck;
    }
}
