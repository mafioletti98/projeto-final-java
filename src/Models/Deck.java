package Models;

import java.util.List;

public class Deck {

    String nomeDoDeck;
    List<Carta> listadecartas;

    public Deck() {
    }

    public Deck(String nomeDoDeck, List<Carta> listadecartas) {
        this.nomeDoDeck = nomeDoDeck;
        this.listadecartas = listadecartas;
    }

    public String getNomeDoDeck() {
        return nomeDoDeck;
    }

    public void setNomeDoDeck(String nomeDoDeck) {
        this.nomeDoDeck = nomeDoDeck;
    }

    public List<Carta> getListadecartas() {
        return listadecartas;
    }

    public void setListadecartas(List<Carta> listadecartas) {
        this.listadecartas = listadecartas;
    }

    @Override
    public String toString() {
        return "Deck [nomeDoDeck=" + nomeDoDeck + ", listadecartas=" + listadecartas + "]";
    }

}
