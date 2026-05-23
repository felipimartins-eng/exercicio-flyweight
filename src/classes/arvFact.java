package classes;

import java.util.HashMap;
import java.util.Map;

public class arvFact {
    static Map<String, arvData> mapaEspecies = new HashMap<>();

    public static arvData getEspecie(String especie, String cor, String miscData) {
        return mapaEspecies.computeIfAbsent(especie, e -> new arvData(e, cor, miscData));
    }
}
