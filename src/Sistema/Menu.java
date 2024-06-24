package Sistema;

import Console.Console;

public class Menu {

    public static void menuLogin() {
        int op;
        do {
            System.out.println("selecione uma das opçoes a seguir: ");
            System.out.println("1 - Login");
            System.out.println("2 - Novo cadastro");
            System.out.println("0 - Sair");
            op = Console.lerInt();
            switch (op) {
                case 1:
                    Sistema.verificarLogin();
                    break;
                case 2:
                    Cadastro.cadastrarJogador();
                    break;
                case 0:
                    Sistema.sair();
                    break;

                default:
                    break;
            }
        } while (op == 0);

    }

    public static void menuDeck() {
        int op;
        do {
            System.out.println("1 - cadastrar novo deck");
            System.out.println("2 - ver decks cadastrados");
            System.out.println("3 - ver decks incompletos");
            System.out.println("4 - editar decks incompletos");
            System.out.println("5 - Menu batalhas simuladas");
            System.out.println("0 - sair");
            op = Console.lerInt();
        } while (op == 0);

    }

    public static void menuCadastrarDeck() {
        int op;
        do {
            System.out.println(" Novo deck");
            System.out.println("1 - cadastrar nome deck");
            System.out.println("2 - ver opções de cartas");
            System.out.println("3 - adicionar carta ao deck");
            System.out.println("4 - visualizar cartas do deck");
            System.out.println("5 - remover carta do deck");
            System.out.println("6 - voltar para o menu anterior");
            System.out.println("0 - sair");
            op = Console.lerInt();

        } while (op == 0);

    }

    public static void menuEditarDeckIncompleto() {
        int op;
        do {
            System.out.println("1 - adicionar carta ao deck");
            System.out.println("2 - remover carta do deck");
            System.out.println("3 - voltar para o menu anterior");
            System.out.println("0 - sair");
            op = Console.lerInt();

        } while (op == 0);

    }

}
