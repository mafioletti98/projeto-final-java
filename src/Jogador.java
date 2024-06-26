import java.util.ArrayList;
import java.util.List;


public class Jogador {

    private int vida;
    private String nome;
    private List<Carta> cartas;

    public Jogador(int vida, String nome) {
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

    public void mostrarCartas() {
        System.out.println("Cartas do Jogador:");
        for (Carta carta : cartas) {
            System.out.println("Ataque: " + carta.getAtaque() + ", Defesa: " + carta.getDefesa());
        }
    }

    public void receberDano(int dano) {
        vida -= dano;
    }
}

