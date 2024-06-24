package Models;

public class CartaDeAtaque extends Carta {

    private int dano;

    public CartaDeAtaque() {

    }

    public CartaDeAtaque(String nomeDaCarta, String descricaoDacarta, int raridade, int custoDemana, int poder,
            int dano) {
        super(nomeDaCarta, descricaoDacarta, raridade, custoDemana, poder);
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
        return "CartaDeAtaque [nomeDaCarta=" + nomeDaCarta + ", dano=" + dano + ", descricaoDacarta=" + descricaoDacarta
                + ", raridade=" + raridade + ", custoDemana=" + custoDemana + ", poder=" + poder + "]";
    }

}
