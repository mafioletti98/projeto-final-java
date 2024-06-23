package Models;

import java.util.List;

public class Jogador {
    String nome;
    List<Deck> listaDeDeckesDoJogador;

    public Jogador() {
    }

    public Jogador(String nome, List<Deck> listaDeDeckesDoJogador) {
        this.nome = nome;
        this.listaDeDeckesDoJogador = listaDeDeckesDoJogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Deck> getListaDeDeckesDoJogador() {
        return listaDeDeckesDoJogador;
    }

    public void setListaDeDeckesDoJogador(List<Deck> listaDeDeckesDoJogador) {
        this.listaDeDeckesDoJogador = listaDeDeckesDoJogador;
    }

}
