import java.util.List;
import java.util.Random;

public class Batalha {

    private Jogador jogador;
    private Inimigo inimigo;

    public Batalha(Jogador jogador, Inimigo inimigo) {
        this.jogador = jogador;
        this.inimigo = inimigo;
    }

    public void iniciarBatalha() {
        System.out.println("\n--- BATALHA INICIADA ---");
        System.out.println("Jogador: " + jogador.getNome() + " vs Inimigo: " + inimigo.getNome());

        Random random = new Random();
        List<Carta> cartasDoJogador = jogador.getCartas();
        Carta cartaDoInimigo = inimigo.getCartaAleatoria();


        Carta cartaDoJogador = cartasDoJogador.get(random.nextInt(cartasDoJogador.size()));


        System.out.println("Carta do Jogador - Ataque: " + cartaDoJogador.getAtaque() + ", Defesa: " + cartaDoJogador.getDefesa());
        System.out.println("Carta do Inimigo - Ataque: " + cartaDoInimigo.getAtaque() + ", Defesa: " + cartaDoInimigo.getDefesa());

        
        int danoAoInimigo = Math.max(0, cartaDoJogador.getAtaque() - cartaDoInimigo.getDefesa());
        inimigo.receberDano(danoAoInimigo);


        if (inimigo.getVida() <= 0) {
            System.out.println("A batalha terminou! " + jogador.getNome() + " derrotou " + inimigo.getNome() + "!");
            System.out.println("--- FIM DA BATALHA ---\n");
            return;
        }

    
        int danoAoJogador = Math.max(0, cartaDoInimigo.getAtaque() - cartaDoJogador.getDefesa());
        jogador.receberDano(danoAoJogador);


        if (jogador.getVida() <= 0) {
            System.out.println("A batalha terminou! " + inimigo.getNome() + " derrotou " + jogador.getNome() + "!");
            
            System.out.println("--- FIM DA BATALHA ---\n");
            return;
        }

    
        System.out.println("Resultado da Rodada:");
        System.out.println("Jogador - Vida: " + jogador.getVida());
        System.out.println("Inimigo - Vida: " + inimigo.getVida());
        System.out.println("--- FIM DA BATALHA ---\n");
    }
}