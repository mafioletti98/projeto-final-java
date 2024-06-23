package Sistema;

import java.util.ArrayList;
import java.util.List;

import Console.Console;
import Models.Jogador;

public class Sistema {
    // lista statica, pra que assim que inicializar o programa ja ter
    // uma lista ( mesmo que vazia) pra checar o login.
    static List<Jogador> jogadores = new ArrayList<Jogador>();
    static int posicaoindiceJogadorlogado;

    // menu inicial
    public static void menuFluxo() {

        int op;

        do {
            System.out.println("Bem vindos ao  slay the lascado ");
            menuLogin();
            op = Console.lerInt();
            switch (op) {
                case 1:
                    verificarLogin();
                    break;
                case 2:
                    cadastrarJogador();
                    break;
                case 0:
                    sair();
                    break;

                default:
                    break;
            }

        } while (op == 0);

    }

    public static void menuLogin() {

        System.out.println("selecione uma das opçoes a seguir: ");
        System.out.println("1 - Login");
        System.out.println("2 - Novo cadastro");
        System.out.println("0 - Sair");
    }

    public static void sair() {
        System.out.println("Ate a proxima! ");
    }

    // menu secundario,
    public static void cadastrarJogador() {
        Jogador jogadortemporario = new Jogador();
        System.out.println("Porfavor digite o nome de usuario: ");
        jogadortemporario.setNome(Console.lerString());
        jogadores.add(jogadortemporario);
        System.out.println("jogador cadastrado com sucesso!");
        menuFluxo();

    }

    public static void verificarLogin() {
        System.out.println("Porfavor digite o nome de usuario cadastrado: ");
        String jogadorAserBuscado = Console.lerString();

        for (int i = 0; i < jogadores.size(); i++) {

            if (jogadores.get(i).getNome().equals(jogadorAserBuscado)) {
                System.out.println("logado com sucesso!");
                posicaoindiceJogadorlogado = i;
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

}
