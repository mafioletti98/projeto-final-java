package Models;

public class CartaDeAtaque extends Carta {

    private int dano;

    public CartaDeAtaque() {

    }

    public CartaDeAtaque(String nomeDaCarta, String descricaoDacarta, int raridade, int custoDemana, int poder,
            int dano) {
        super(nomeDaCarta, descricaoDacarta, raridade, custoDemana, poder, 1);
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "\nCarta De Ataque \nNome Da Carta = " + nomeDaCarta + "\nDano = " + dano + "\nDescrição Da carta = "
                + descricaoDacarta
                + "\nRaridade = " + raridade + "\nCusto Demana = " + custoDemana + "\nPoder = " + poder;
    }

}
