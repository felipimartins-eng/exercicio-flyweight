package classes;

import java.util.ArrayList;
import java.util.List;

public class floresta {
    private List<arvore> arvores = new ArrayList<>();

    public void arvCriar(int x, int y, String especie, String cor, String miscData) {
        arvData dataEspecie = arvFact.getEspecie(especie, cor, miscData);
        arvore arvore = new arvore(x, y, dataEspecie);
        arvores.add(arvore);
    }
}
