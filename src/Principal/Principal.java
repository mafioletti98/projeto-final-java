package Principal;

import Sistema.Sistema;

public class Principal {

    static Sistema sistema = new Sistema();

    public static void main(String[] args) throws Exception {
        sistema.menuFluxo();
    }
}
