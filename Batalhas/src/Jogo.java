import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Jogo {

    private Jogador jogador;
    private Inimigo inimigo;
    private Deck deck;

    public Jogo(Jogador jogador, Inimigo inimigo, Deck deck) {
        this.jogador = jogador;
        this.inimigo = inimigo;
        this.deck = deck;
    }

    public void distribuirCartas() {
        List<Carta> todasAsCartas = deck.getListaCartas();
        Collections.shuffle(todasAsCartas); 

        
        for (int i = 0; i < todasAsCartas.size() / 2; i++) {
            jogador.adicionarCarta(todasAsCartas.get(i));
        }

       
        for (int i = todasAsCartas.size() / 2; i < todasAsCartas.size(); i++) {
            inimigo.adicionarCarta(todasAsCartas.get(i));
        }
    }

    public void iniciarJogo() {
        distribuirCartas();

        System.out.println("--- JOGO INICIADO ---");
        System.out.println("Jogador: " + jogador.getNome() + " vs Inimigo: " + inimigo.getNome());
        System.out.println("Cartas do Jogador:");
        jogador.mostrarCartas();
        System.out.println("Cartas do Inimigo:");
        inimigo.mostrarCartas();

        
        while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
            Batalha batalha = new Batalha(jogador, inimigo);
            batalha.iniciarBatalha();
        }

        
        if (jogador.getVida() <= 0) {
            System.out.println("O jogador foi derrotado! Game Over.");
        } else {
            System.out.println("O inimigo foi derrotado! Parabéns, você venceu!");
        }
    }
}
