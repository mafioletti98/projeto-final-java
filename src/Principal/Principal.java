package Principal;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.annotation.*;

import Models.Jogador;
import Sistema.Sistema;

public class Principal {

    public static void main(String[] args) throws Exception {

        JSONParser jsonParser = new JSONParser();
        List<Jogador> listaSalvaDeJogadores = new ArrayList<Jogador>();
        try (FileReader reader = new FileReader("C:\\saveJogo\\save.json")) {

            Object obj = jsonParser.parse(reader);
            JSONArray array = new JSONArray();
            array.put(obj);

            ObjectMapper objectMapper = new ObjectMapper();

            // Convertendo Json para Array do OBJ Jogador
            Jogador[] jogadores = objectMapper.readValue(array.get(0).toString(), Jogador[].class);
            listaSalvaDeJogadores = Arrays.asList(jogadores);

        } catch (Exception e) {
            System.out.println(e);

        }

        Sistema.menuFluxo(listaSalvaDeJogadores);

    }
}
