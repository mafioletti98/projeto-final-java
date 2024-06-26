package Sistema;

import Console.Console;
import Models.Jogador;
import Models.Deck;

public class Cadastro {

    public static Jogador cadastrarJogador() throws Exception {
        Jogador jogadorTemporario = null; // Inicialize o jogador como null
        boolean nomeValido = false; // Flag para controlar a validação

        while (!nomeValido) { // Loop while para repetir a entrada do nome
            try {
                System.out.println("\nPor favor, digite o nome de usuário: ");
                String nome = Console.lerString();

                // Validação de nome com caracteres especiais (regex)
                if (!nome.matches("[\\p{L}\\p{N}\\p{Space}][\\p{L}\\p{N}\\p{Space}]*")) {
                    throw new Exception("\nErro: O nome do jogador não pode conter caracteres especiais!");
                }

                jogadorTemporario = new Jogador(); // Crie o jogador apenas se o nome for válido
                jogadorTemporario.setNome(nome);
                nomeValido = true; // Defina a flag como true para sair do loop
                System.out.println("\nJogador cadastrado com sucesso!");

            } catch (Exception e) {
                System.out.println(e.getMessage()); // Exiba a mensagem de erro
            }
        }

        return jogadorTemporario; // Retorne o jogador após a validação
    }

    public static Deck cadastrarNovoDeck() {
        Deck deckTemporario = null; // Inicialize o deck como null
        boolean nomeValido = false; // Flag para controlar a validação

        while (!nomeValido) { // Loop while para repetir a entrada do nome do deck
            try {
                System.out.println("\nPor favor, digite o nome do seu Deck: ");
                String nomeDoDeck = Console.lerString();

                // Validação de nome do deck com caracteres especiais (regex)
                if (!nomeDoDeck.matches("[\\p{L}\\p{N}\\p{Space}][\\p{L}\\p{N}\\p{Space}]*")) {
                    throw new Exception("\nErro: O nome do Deck não pode conter caracteres especiais!");
                }

                deckTemporario = new Deck(); // Crie o deck apenas se o nome for válido
                deckTemporario.setNomeDoDeck(nomeDoDeck);
                deckTemporario.setListadecartas(null); // Inicialize a lista de cartas como você achar necessário
                nomeValido = true; // Defina a flag como true para sair do loop
                System.out.println("Deck cadastrado com sucesso!");

            } catch (Exception e) {
                System.out.println(e.getMessage()); // Exiba a mensagem de erro
            }
        }

        return deckTemporario; // Retorne o deck após a validação
    }

}
