package Streams.es345_3410;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ristorante> risto = Arrays.asList(
                new Ristorante("La pergola", TipoRistorante.RISTO, 55),
                new Ristorante("L’etico", TipoRistorante.PIZZERIA, 25),
                new Ristorante("Da Rossi", TipoRistorante.RISTO, 47),
                new Ristorante("Da Gigi", TipoRistorante.PIZZERIA, 42),
                new Ristorante("Giggetto", TipoRistorante.PIZZERIA, 80),
                new Ristorante("Da Ivo", TipoRistorante.PIZZERIA, 150),
                new Ristorante("Romolo e Luigi", TipoRistorante.PIZZERIA, 50),
                new Ristorante("La terrazza", TipoRistorante.RISTO, 40)
        );

//        Ristorante.stampaNomeCoperti(risto);
//        System.out.println(Ristorante.stampaRistoMinCoperti(risto, 100));
//        System.out.println(Ristorante.ristoranteDelloStessoTipo(risto));
//        Ristorante.stampaRistorantiOrdinati(risto);
        System.out.println(Ristorante.sommaCopertiRistoranti(risto));
    }
}
