package Sistema;

import Console.Console;
import Models.Jogador;
import Models.Deck;

public class Cadastro {

 
//cadastrar jogador, com exceção caso o jogador tente mandar nome vazio
    public static Jogador cadastrarJogador() throws Exception {
        Jogador jogadortemporario = new Jogador();
        System.out.println("Por favor, digite o nome de usuário: ");
        jogadortemporario.setNome(Console.lerString());
        
        if (jogadortemporario.getNome() == null || jogadortemporario.getNome().isEmpty()) {
            throw new Exception("\nErro digite o nome do jogador!");
        }
    
        System.out.println("Jogador cadastrado com sucesso!");
        return jogadortemporario;
    }

    public static Deck cadastrarNovoDeck() {
        Deck deckTemporario = new Deck();
        System.out.println("Porfavor digite o nome do seu Deck: ");
        deckTemporario.setNomeDoDeck(Console.lerString());
        deckTemporario.setListadecartas(null);
        System.out.println("Deck cadastrado com sucesso!");
        return deckTemporario;

    }
}
