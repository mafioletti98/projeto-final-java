package Sistema;

import Models.Deck;

public class Menu {
    Deck deck = new Deck();

    Sistema sistema = new Sistema();
    Cadastro cadastro = new Cadastro();

    public void menuLogin() {
        System.out.println("selecione uma das opçoes a seguir: ");
        System.out.println("1 - Login");
        System.out.println("2 - Novo cadastro");
        System.out.println("0 - Sair");
    }

    public void menuDeck() {
        System.out.println("1 - cadastrar novo deck");
        System.out.println("2 - ver decks cadastrados");
        System.out.println("3 - ver decks incompletos");
        System.out.println("4 - editar decks incompletos");
        System.out.println("5 - Menu batalhas simuladas");
        System.out.println("0 - Voltar para o menu anterior");
    }

    public void menuEditarDeckIncompleto() {
        System.out.println("1 - adicionar carta ao deck");
        System.out.println("2 - remover carta do deck");
        System.out.println("0 - voltar para o menu anterior");
    }

}
