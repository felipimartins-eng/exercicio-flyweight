import classes.floresta;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int numArvores = 1000000;
        int posRange = 500;

        floresta floresta = new floresta();
        List<String> especiesArvore = new ArrayList<>(){};
        especiesArvore.add("Eucalipto");
        especiesArvore.add("Mogno");
        especiesArvore.add("Arvore-Magica-Da-Sabedoria");

        double distribuicaoEspecies = (double) numArvores / (double) especiesArvore.size();

        for (String especieNome : especiesArvore) {
            for (int j = 0; j < Math.floor(distribuicaoEspecies); j++) {
                int x = ThreadLocalRandom.current().nextInt(-posRange, posRange + 1);
                int y = ThreadLocalRandom.current().nextInt(-posRange, posRange + 1);
                floresta.arvCriar(x, y, especieNome, especieNome, "arbitrario");
            }
        }

    }
}