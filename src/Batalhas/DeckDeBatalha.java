package Batalhas;

import java.util.ArrayList;
import java.util.List;

public class DeckDeBatalha {

    private List<CartaDaBatalha> listaCartas;

    public DeckDeBatalha() {
        this.listaCartas = new ArrayList<>();
        // inicializarCartas();
    }

    public void setListaCartas(List<CartaDaBatalha> listaCartas) {
        this.listaCartas = listaCartas;
    }

    private void inicializarCartas() {
        CartasDeBatalha cartas = new CartasDeBatalha();
        listaCartas.addAll(cartas.getTodasAsCartas());
    }

    public void limparDeck() {
        listaCartas.clear();
    }

    public List<CartaDaBatalha> getListaCartas() {
        return listaCartas;
    }
}
