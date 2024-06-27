package Principal;

import java.util.ArrayList;
import java.util.List;

import Models.Jogador;
import Sistema.SaveJogoLerJson;
import Sistema.Sistema;

public class Principal {

    public static void main(String[] args) throws Exception {

        List<Jogador> listaSalvaDeJogadores = new ArrayList<Jogador>();
        // pos conversao e
        // antes de comecar o programa essa liinha de codigo carrega o json com os dados
        // salvos
        listaSalvaDeJogadores = SaveJogoLerJson.carregarSaveDoArquivoJson();

        // passa a lista pro menu carregada.
        Sistema.menuFluxo(listaSalvaDeJogadores);

    }
}
