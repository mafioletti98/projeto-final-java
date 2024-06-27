package Sistema;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;

import Models.Jogador;

public class SaveJogoLerJson {
    // estamos carregando o arquivo
    // ler o arquivo que ta nessa pasta src\\saveJogo\\save.json
    public static List<Jogador> carregarSaveDoArquivoJson() {
        JSONParser jsonParser = new JSONParser();
        // criando nova lista de jogadores
        List<Jogador> listaSalvaDeJogadores = new ArrayList<Jogador>();
        // ler arquivo json com o save
        try (FileReader reader = new FileReader("src\\saveJogo\\save.json")) {
            // transformando conteudo do arquivo em obj
            Object obj = jsonParser.parse(reader);
            JSONArray array = new JSONArray();
            array.put(obj);

            // declarando mapeamento
            ObjectMapper objectMapper = new ObjectMapper();

            // Convertendo Json para Array do OBJ Jogador
            // tamo mapeando de onde vem o conteudo e comparando com o modelo jogador
            // comparndo o o arquivo de texto com o arquivo do model classe jogador
            Jogador[] jogadores = objectMapper.readValue(array.get(0).toString(), Jogador[].class);
            // eu to crinado um arvio mas era um array e eu to trabalhando com lista entao
            // eu tenho que converter e essa linha faz a converçao.
            listaSalvaDeJogadores = Arrays.asList(jogadores);

        } catch (Exception e) {
            System.out.println(e);

        }
        // retorno a lista convertida pra main
        return listaSalvaDeJogadores;
    }

    // quando eu clico em sair do programa eu salvo usando esse methodo
    public static void saveDoArquivoJson(List<Jogador> jogadores) {

        JSONArray arrayItem = new JSONArray();
        for (int i = 0; i < jogadores.size(); i++) {
            JSONArray arrayDecks = new JSONArray();
            JSONObject objItem = new JSONObject();

            try {
                objItem.put("nome", jogadores.get(i).getNome());

                if (jogadores.get(i).getListaDeDeckesDoJogador() != null) {
                    for (int j = 0; j < jogadores.get(i).getListaDeDeckesDoJogador().size(); j++) {

                        JSONObject objDecks = new JSONObject();

                        objDecks.put("nomeDoDeck", jogadores.get(i).getListaDeDeckesDoJogador().get(j).getNomeDoDeck());

                        JSONArray arrayCartas = new JSONArray();

                        if (jogadores.get(i).getListaDeDeckesDoJogador().get(j).getListadecartas() != null) {
                            for (int h = 0; h < jogadores.get(i).getListaDeDeckesDoJogador().get(j).getListadecartas()
                                    .size(); h++) {
                                JSONObject objCartas = new JSONObject();
                                objCartas.put("nomeDaCarta",
                                        jogadores.get(i).getListaDeDeckesDoJogador().get(j).getListadecartas()
                                                .get(h).getNomeDaCarta());
                                objCartas.put("descricaoDacarta", jogadores.get(i).getListaDeDeckesDoJogador().get(j)
                                        .getListadecartas().get(h).getDescricaoDacarta());
                                objCartas.put("raridade",
                                        jogadores.get(i).getListaDeDeckesDoJogador().get(j).getListadecartas()
                                                .get(h).getRaridade());
                                objCartas.put("custoDemana", jogadores.get(i).getListaDeDeckesDoJogador().get(j)
                                        .getListadecartas().get(h).getCustoDemana());
                                objCartas.put("poder",
                                        jogadores.get(i).getListaDeDeckesDoJogador().get(j).getListadecartas()
                                                .get(h).getPoder());
                                objCartas.put("tipo",
                                        jogadores.get(i).getListaDeDeckesDoJogador().get(j).getListadecartas()
                                                .get(h).getTipo());
                                arrayCartas.put(objCartas);
                                objDecks.put("listadecartas", arrayCartas);
                            }
                        }

                        arrayDecks.put(objDecks);
                        objItem.put("listaDeDeckesDoJogador", arrayDecks);

                    }
                }

                arrayItem.put(objItem);
            } catch (JSONException e) {

                e.printStackTrace();
            }
        }

        try (FileWriter file = new FileWriter("src\\saveJogo\\save.json")) {
            file.write(arrayItem.toString());
        } catch (Exception e) {
            System.out.println(e);

        }

    }

}
