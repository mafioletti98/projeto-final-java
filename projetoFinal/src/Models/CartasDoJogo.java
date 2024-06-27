package Models;

import java.util.ArrayList;
import java.util.List;

public class CartasDoJogo {

        public List<Carta> listaDecartas = new ArrayList<Carta>();

        public void InicializarListaDeCartas() {
                listaDecartas.add(new CartaDeAtaque(
                                "Ragnarok",
                                "\nCarta rara do tipo ataque que atinge o usuário com uma tempestade de raio causando 30 de dano",
                                2,
                                3,
                                15,
                                2));
                listaDecartas.add(new CartaDeAtaque(
                                "Raio",
                                "\nCarta rara do tipo ataque que atinge o usuário com um raio causando 10 de dano",
                                1,
                                1,
                                5,
                                2));
                listaDecartas.add(new CartaDeAtaque(
                                "Tempestade",
                                "\nCarta rara do tipo ataque que atinge o usuário com uma tempestade de raio causando 24 de dano",
                                3,
                                1,
                                12,
                                2));
                listaDecartas.add(new CartaDeAtaque(
                                "Bomba de festin",
                                "\nCarta rara do tipo ataque que atinge o usuário com uma tempestade de raio causando 18 de dano",
                                2,
                                2,
                                18,
                                1));

                listaDecartas.add(new CartaDeDefesa(
                                "Escudo",
                                "\nCarta comum do tipo defesa que protege de 5 de dano.",
                                1,
                                1,
                                5,
                                1));
                listaDecartas.add(new CartaDeDefesa(
                                "Para-raio",
                                "\nCarta comum do tipo defesa que protege de 30 de dano.",
                                3,
                                1,
                                5,
                                6));
                listaDecartas.add(new CartaDeDefesa(
                                "Tanque de guerra",
                                "\nCarta comum do tipo defesa que protege de 20 de dano.",
                                2,
                                2,
                                5,
                                4));
                listaDecartas.add(new CartaDeDefesa(
                                "Bunker",
                                "\nCarta comum do tipo defesa que protege de 10 de dano.",
                                1,
                                1,
                                5,
                                2));
                listaDecartas.add(new CartaSuport(
                                "Power-on",
                                "\nCarta comum do tipo de suporte tipo 1 - ataque com dano igual a quantitade de poder.",
                                1,
                                1,
                                2,
                                2));
                listaDecartas.add(new CartaSuport(
                                "Power-off",
                                "\nCarta rara do tipo de suporte tipo 2 - Defesa igual a quantitade de poder.",
                                2,
                                1,
                                10,
                                2));
                listaDecartas.add(new CartaSuport(
                                "Pray",
                                "\nCarta rara do tipo de suporte tipo 3 - recebe ataque e defesa igual a quantitade de poder.",
                                3,
                                1,
                                10,
                                2));
                listaDecartas.add(new CartaDeAtaque(
                                "General Matheus",
                                "\nCarta rara do tipo ataque, em um ataque de furia a ver seu exercito morto Matheus pega sua espiganda e da um tiro que atinge o usuário",
                                2,
                                2,
                                20,
                                5));

        }

        public List<Carta> getCarta() {
                return listaDecartas;
        }

}
