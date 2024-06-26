package Models;

public class CartaSuport extends Carta {
    // variavel tipo de suport , se for 1 ganha atributo dano, se for 2 adciona
    // defesa, e 3 adiciona mana a soma final do deck
    int tipoDeSuport;

    public CartaSuport() {

    }

    public CartaSuport(String nomeDaCarta, String descricaoDacarta, int raridade, int custoDemana, int poder,
            int tipoDeSuport) {
        super(nomeDaCarta, descricaoDacarta, raridade, custoDemana, poder, 3);
        this.tipoDeSuport = tipoDeSuport;
    }

    public int getTipoDeSuport() {
        return tipoDeSuport;
    }

    public void setTipoDeSuport(int tipoDeSuport) {
        this.tipoDeSuport = tipoDeSuport;
    }

    @Override
    public String toString() {
        return "CartaSuport [nomeDaCarta=" + nomeDaCarta + ", descricaoDacarta=" + descricaoDacarta + ", raridade="
                + raridade + ", custoDemana=" + custoDemana + ", poder=" + poder + ", tipoDeSuport=" + tipoDeSuport
                + "]";
    }

}
