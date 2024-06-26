import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Inimigo {

    private int vida;
    private String nome;
    private List<Carta> cartas;

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

    public List<Carta> getCartas() {
        return cartas;
    }

    public void adicionarCarta(Carta carta) {
        cartas.add(carta);
    }

    public Carta getCartaAleatoria() {
        Random random = new Random();
        return cartas.get(random.nextInt(cartas.size()));
    }

    public void mostrarCartas() {
        System.out.println("Cartas do Inimigo:");
        for (Carta carta : cartas) {
            System.out.println("Ataque: " + carta.getAtaque() + ", Defesa: " + carta.getDefesa());
        }
    }

    public void receberDano(int dano) {
        vida -= dano;
    }
}
