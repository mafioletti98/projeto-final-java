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
        return "\nCarta De Defesa \nNome Da Carta = " + nomeDaCarta + "\nBlock=" + block + "\nDescrição Da carta = "
                + descricaoDacarta + "\nRaridade = " + raridade + "\nCusto Demana = " + custoDemana + "\nPoder = "
                + poder;
    }

}
