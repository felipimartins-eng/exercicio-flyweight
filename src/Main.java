import classes.arvData;
import classes.floresta;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.instrument.Instrumentation;

public class Main {
    public static void main(String[] args) {
        int numArvores = 1000000;
        int posRange = 500;
        int tamEstrutura = 96; // Assumindo que cada especie possua um limite de 85 caracteres em cada um dos três campos de 'arvData'

        floresta floresta = new floresta();
        List<String> especiesArvore = new ArrayList<>(){};
        especiesArvore.add("Eucalipto");
        especiesArvore.add("Mogno");
        especiesArvore.add("Arvore-Magica-Da-Sabedoria");

        int numEspecies = especiesArvore.size();
        double distribuicaoEspecies = (double) numArvores / (double) numEspecies;

        for (String especieNome : especiesArvore) {
            for (int j = 0; j < Math.floor(distribuicaoEspecies); j++) {
                int x = ThreadLocalRandom.current().nextInt(-posRange, posRange + 1);
                int y = ThreadLocalRandom.current().nextInt(-posRange, posRange + 1);
                floresta.arvCriar(x, y, especieNome, especieNome, "arbitrario");
            }
        }

        System.out.println("Tamanho atual utilizado pelos dados compartilhados: " + numEspecies * tamEstrutura + " Bytes");
        System.out.println("Tamanho hipotetico utilizado pelos dados compartilhados: " + numArvores * tamEstrutura + " Bytes");
    }
}