package Batalhas;

public class CartaDaBatalha {

    private int ataque;
    private int defesa;

    public CartaDaBatalha() {

    }

    public CartaDaBatalha(int ataque, int defesa) {
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

}