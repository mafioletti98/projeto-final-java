package Batalhas;

import java.util.ArrayList;
import java.util.List;

public class CartasDeBatalha {

    // ataque / defesa

    CartaDaBatalha carta1 = new CartaDaBatalha(1, 2);
    CartaDaBatalha carta2 = new CartaDaBatalha(1, 5);
    CartaDaBatalha carta3 = new CartaDaBatalha(1, 3);
    CartaDaBatalha carta4 = new CartaDaBatalha(2, 4);
    CartaDaBatalha carta5 = new CartaDaBatalha(2, 3);
    CartaDaBatalha carta6 = new CartaDaBatalha(2, 2);
    CartaDaBatalha carta7 = new CartaDaBatalha(2, 3);
    CartaDaBatalha carta8 = new CartaDaBatalha(2, 4);
    CartaDaBatalha carta9 = new CartaDaBatalha(3, 3);
    CartaDaBatalha carta10 = new CartaDaBatalha(3, 2);
    CartaDaBatalha carta11 = new CartaDaBatalha(3, 2);
    CartaDaBatalha carta12 = new CartaDaBatalha(4, 3);
    CartaDaBatalha carta13 = new CartaDaBatalha(4, 2);

    public List<CartaDaBatalha> getTodasAsCartas() {
        List<CartaDaBatalha> listaDeCartas = new ArrayList<>();
        listaDeCartas.add(carta1);
        listaDeCartas.add(carta2);
        listaDeCartas.add(carta3);
        listaDeCartas.add(carta4);
        listaDeCartas.add(carta5);
        listaDeCartas.add(carta6);
        listaDeCartas.add(carta7);
        listaDeCartas.add(carta8);
        listaDeCartas.add(carta9);
        listaDeCartas.add(carta10);
        listaDeCartas.add(carta11);
        listaDeCartas.add(carta12);
        listaDeCartas.add(carta13);
        return listaDeCartas;
    }
}
