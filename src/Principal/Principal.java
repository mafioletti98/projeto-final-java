package Principal;

import java.util.ArrayList;
import java.util.List;

import Models.Jogador;
import Sistema.SaveJogoLerJson;
import Sistema.Sistema;

public class Principal {

    public static void main(String[] args) throws Exception {

        List<Jogador> listaSalvaDeJogadores = new ArrayList<Jogador>();
        listaSalvaDeJogadores = SaveJogoLerJson.carregarSaveDoArquivoJson();

        Sistema.menuFluxo(listaSalvaDeJogadores);

    }
}
