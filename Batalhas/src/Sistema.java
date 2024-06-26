public class Sistema {

    private static Jogador jogador; // Variável para armazenar o jogador criado
    private static Inimigo inimigo; // Variável para armazenar o inimigo criado

    private static void exibirMenu() {
        System.out.println("\nMENU:");
        System.out.println("1) Iniciar Jogo");
        System.out.println("2) Nome do Jogador");
        System.out.println("3) Nome do Inimigo");
        System.out.println("0) Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void iniciarJogo() {
        if (jogador == null || inimigo == null) {
            System.out.println("Você precisa escolher um nome para o jogador e para o inimigo primeiro!");
            return;
        }

        Deck deck = new Deck();
        Jogo jogo = new Jogo(jogador, inimigo, deck);

       
        jogo.iniciarJogo();
    }

    private static void escolherNomeJogador() {
        System.out.print("Digite o nome do jogador: ");
        String nome = Console.lerString();
        jogador = new Jogador(10, nome);
        System.out.println("Nome do jogador definido como: " + nome);
    }

    private static void escolherNomeInimigo() {
        System.out.print("Digite o nome do inimigo: ");
        String nome = Console.lerString();
        inimigo = new Inimigo(10, nome);
        System.out.println("Nome do inimigo definido como: " + nome);
    }

    private static void verificarOpcao(int op) {
        switch (op) {
            case 1:
                iniciarJogo();
                break;
            case 2:
                escolherNomeJogador();
                break;
            case 3:
                escolherNomeInimigo();
                break;
            case 0:
                System.out.println("Encerrando o programa...");
                break;
            default:
                System.out.println("Opção inválida. Digite novamente.");
                break;
        }
    }

    public static void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = Console.lerInt();
            verificarOpcao(opcao);
        } while (opcao != 0);
    }
}