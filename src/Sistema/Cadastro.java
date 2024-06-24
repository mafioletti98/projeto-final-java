package Sistema;

import Console.Console;
import Models.Jogador;
import Models.Deck;

public class Cadastro {
    Sistema sistema = new Sistema();

    public Jogador cadastrarJogador() {

        Jogador jogadortemporario = new Jogador();
        System.out.println("Porfavor digite o nome de usuario: ");
        jogadortemporario.setNome(Console.lerString());
        System.out.println("jogador cadastrado com sucesso!");
        return jogadortemporario;

    }

    public Deck cadastrarNovoDeck() {
        Deck deckTemporario = new Deck();
        System.out.println("Porfavor digite o nome do seu Deck: ");
        deckTemporario.setNomeDoDeck(Console.lerString());
        deckTemporario.setListadecartas(null);
        System.out.println("Deck cadastrado com sucesso!");
        return deckTemporario;

    }
}
