import java.util.ArrayList;
import java.util.List;

public class Deck {
    
    private List<Carta> listaCartas;

    public Deck() {
        this.listaCartas = new ArrayList<>();
        inicializarCartas();
    }

    private void inicializarCartas() {
        Cartas cartas = new Cartas();
        listaCartas.addAll(cartas.getTodasAsCartas());
    }

    public void limparDeck() {
        listaCartas.clear();
    }

    public List<Carta> getListaCartas() {
        return listaCartas;
    }
}


