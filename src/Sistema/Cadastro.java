package Sistema;

import Console.Console;
import Models.Jogador;
import Models.Deck;

public class Cadastro {

 
//cadastrar jogador, com exceção caso o jogador  cadastre nome com caracteres especiais
public static Jogador cadastrarJogador() throws Exception {
    Jogador jogadorTemporario = new Jogador();
    System.out.println("Por favor, digite o nome de usuário: ");
    String nome = Console.lerString();

    // Validação de nome com caracteres especiais (regex)
    if (!nome.matches("[\\p{L}\\p{N}\\p{Space}][\\p{L}\\p{N}\\p{Space}]*")) {
        throw new Exception("\nErro: O nome do jogador não pode conter caracteres especiais!");
    }

    jogadorTemporario.setNome(nome);
    System.out.println("Jogador cadastrado com sucesso!");
    return jogadorTemporario;
}


public static Deck cadastrarNovoDeck() throws Exception {
    Deck deckTemporario = new Deck();
    System.out.println("Por favor, digite o nome do seu Deck: ");
    String nomeDoDeck = Console.lerString();

    // Validação de nome do deck com caracteres especiais (regex)
    if (!nomeDoDeck.matches("[\\p{L}\\p{N}\\p{Space}][\\p{L}\\p{N}\\p{Space}]*")) {
        throw new Exception("\nErro: O nome do Deck não pode conter caracteres especiais!");
    }

    deckTemporario.setNomeDoDeck(nomeDoDeck);
    deckTemporario.setListadecartas(null); // Inicialize a lista de cartas como você achar necessário
    System.out.println("Deck cadastrado com sucesso!");
    return deckTemporario;
}

}
