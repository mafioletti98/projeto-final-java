package Batalhas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Inimigo {

    private int vida;
    private String nome;
    private List<CartaDaBatalha> cartas;

    public Inimigo(int vida, String nome) {
        this.vida = vida;
        this.nome = nome;
        this.cartas = new ArrayList<>();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<CartaDaBatalha> getCartas() {
        return cartas;
    }

    public void adicionarCarta(CartaDaBatalha carta) {
        cartas.add(carta);
    }

    public CartaDaBatalha getCartaAleatoria() {
        Random random = new Random();
        return cartas.get(random.nextInt(cartas.size()));
    }

    public void mostrarCartas() {
        // System.out.println("\nCarta do Inimigo:\n");
        for (CartaDaBatalha carta : cartas) {
            // System.out.println("Carta do Inimigo:");
            System.out.println("Ataque: " + carta.getAtaque() + ", Defesa: " + carta.getDefesa());
        }
    }

    public void receberDano(int dano) {
        vida -= dano;
    }
}
