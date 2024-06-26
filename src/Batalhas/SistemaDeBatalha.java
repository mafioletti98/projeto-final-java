package Batalhas;

import java.util.List;

public class SistemaDeBatalha {

    private static JogadorDaBatalha jogador; // Variável para armazenar o jogador criado
    private static Inimigo inimigo; // Variável para armazenar o inimigo criado
    private static List<CartaDaBatalha> deckBatalha; // Deck de batalha recebido do outro codigo

    private static void exibirMenu() {
        System.out.println("\nMENU:");
        System.out.println("1) Iniciar Jogo");
        System.out.println("2) Exibir nome do Jogador");
        System.out.println("3) Nome do Inimigo");
        System.out.println("0) Sair");
        System.out.print("Escolha uma opção: \n ");
    }

    private static void iniciarJogo() {
        if (jogador == null || inimigo == null) {
            System.out.println("Você precisa escolher um nome para o jogador e para o inimigo primeiro!\n");
            return;
        }

        DeckDeBatalha deck = new DeckDeBatalha();
        deck.setListaCartas(deckBatalha);
        Jogo jogo = new Jogo(jogador, inimigo, deck);

        jogo.iniciarJogo();
    }

    private static void mostrarNomeJogador() {
        System.out.println("Nome do jogador definido como: \n" + jogador.getNome());
    }

    private static void escolherNomeInimigo() {
        System.out.print("Digite o nome do inimigo: ");
        String nome = ConsoleDeBatalha.lerString();
        inimigo = new Inimigo(50, nome);
        System.out.println("Nome do inimigo definido como:\n " + nome);
    }

    private static void verificarOpcao(int op) {
        switch (op) {
            case 1:
                iniciarJogo();
                break;
            case 2:
                mostrarNomeJogador();
                break;
            case 3:
                escolherNomeInimigo();
                break;
            case 0:
                System.out.println("\nEncerrando o programa de Batalhas...");
                break;
            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
    }

    public static void executar(JogadorDaBatalha jogadorBatalha, Inimigo inimigoBatalha,
            List<CartaDaBatalha> deckDeBatalhaVindoDeOutroCodigo) {
        int opcao;
        jogador = jogadorBatalha;
        inimigo = inimigoBatalha;
        deckBatalha = deckDeBatalhaVindoDeOutroCodigo;
        do {
            exibirMenu();
            opcao = ConsoleDeBatalha.lerInt();
            verificarOpcao(opcao);
        } while (opcao != 0);
    }
}