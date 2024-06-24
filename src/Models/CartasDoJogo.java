package Models;

import java.util.ArrayList;
import java.util.List;

public class CartasDoJogo {

    public static List<Carta> listaDecartas = new ArrayList<Carta>();

    public static void InicializarListaDeCartas() {
        listaDecartas.add(new CartaDeAtaque(
                "Ragnarok",
                "Carta rara do tipo ataque que atinge o usuário com uma tempestade de raio causando 30 de dano",
                2,
                3,
                15,
                2));
        listaDecartas.add(new CartaDeAtaque(
                "Raio",
                "Carta rara do tipo ataque que atinge o usuário com um raio causando 10 de dano",
                1,
                1,
                5,
                2));
        listaDecartas.add(new CartaDeAtaque(
                "Tempestade",
                "Carta rara do tipo ataque que atinge o usuário com uma tempestade de raio causando 24 de dano",
                3,
                1,
                12,
                2));
        listaDecartas.add(new CartaDeAtaque(
                "Bomba de festin",
                "Carta rara do tipo ataque que atinge o usuário com uma tempestade de raio causando 18 de dano",
                2,
                2,
                18,
                1));

        listaDecartas.add(new CartaDeDefesa(
                "Escudo",
                "carta comum do tipo defesa que protege de 5 de dano.",
                1,
                1,
                5,
                1));
        listaDecartas.add(new CartaDeDefesa(
                "Para-raio",
                "carta comum do tipo defesa que protege de 30 de dano.",
                3,
                1,
                5,
                6));
        listaDecartas.add(new CartaDeDefesa(
                "Tanke de guerra",
                "carta comum do tipo defesa que protege de 20 de dano.",
                2,
                2,
                5,
                4));
        listaDecartas.add(new CartaDeDefesa(
                "bunker",
                "carta comum do tipo defesa que protege de 10 de dano.",
                1,
                1,
                5,
                2));
        listaDecartas.add(new CartaSuport(
                "Power-on",
                "carta comum do tipo de suporte tipo 1 - ataque com dano igual a quantitade de poder.",
                1,
                1,
                2,
                2));
        listaDecartas.add(new CartaSuport(
                "Power-off",
                "carta rara do tipo de suporte tipo 2 - Defesa igual a quantitade de poder.",
                2,
                1,
                10,
                2));
        listaDecartas.add(new CartaSuport(
                "Pray",
                "carta rara do tipo de suporte tipo 3 - recebe ataque e defesa igual a quantitade de poder.",
                3,
                1,
                10,
                2));

    }

    public List<Carta> getCarta() {
        return listaDecartas;
    }

}
