package Models;

public class CartaDeDefesa extends Carta {

    int block;

    public CartaDeDefesa() {

    }

    public CartaDeDefesa(String nomeDaCarta, String descricaoDacarta, int raridade, int custoDemana, int poder,
            int block) {
        super(nomeDaCarta, descricaoDacarta, raridade, custoDemana, poder, 2);

    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "CartaDeDefesa [nomeDaCarta=" + nomeDaCarta + ", block=" + block + ", descricaoDacarta="
                + descricaoDacarta + ", raridade=" + raridade + ", custoDemana=" + custoDemana + ", poder=" + poder
                + "]";
    }

}
