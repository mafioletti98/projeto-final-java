import java.util.ArrayList;
import java.util.List;

public class Cartas {

    //ataque / defesa

    Carta carta1 = new Carta(1, 2);
    Carta carta2 = new Carta(1, 5);
    Carta carta3 = new Carta(1, 3);
    Carta carta4 = new Carta(2, 4);
    Carta carta5 = new Carta(2, 3);
    Carta carta6 = new Carta(2, 2);
    Carta carta7 = new Carta(2, 3);
    Carta carta8 = new Carta(2, 4);
    Carta carta9 = new Carta(3, 3);
    Carta carta10 = new Carta(3, 2);
    Carta carta11 = new Carta(3, 2);
    Carta carta12 = new Carta(4, 3);
    Carta carta13 = new Carta(4, 2);

    public List<Carta> getTodasAsCartas() {
        List<Carta> listaDeCartas = new ArrayList<>();
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
