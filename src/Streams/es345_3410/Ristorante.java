package Streams.es345_3410;

import java.util.*;
import java.util.stream.Collectors;

public class Ristorante {
    private String nome;
    private TipoRistorante tipo;
    private int coperti;

    public Ristorante(String nome, TipoRistorante tipo, int coperti){
        this.nome = nome; this.coperti = coperti; this.tipo = tipo;
    }

    public String getNome() { return nome; }
    public TipoRistorante getTipo() { return tipo; }
    public int getCoperti() { return coperti; }
    @Override
    public String toString() { return nome+":"+tipo+":"+coperti; }

    /**
     * Scrivere un metodo che stampi una riga per ogni ristorante con nome e
     * numero coperti, in ordine decrescente di numero di coperti.
     */
    public static void stampaNomeCoperti(List<Ristorante> listaRistoranti){
        listaRistoranti.stream()
                .sorted(Comparator.comparing(Ristorante::getCoperti))
                .forEach((risto) -> System.out.println(risto.getNome() + " " + risto.getCoperti()));
    }

    /**
     * Data la lista di ristoranti fornita sopra, scrivere un metodo
     * che restituisca l’insieme dei ristoranti che hanno almeno tot coperti.
     */
    public static List<Ristorante> stampaRistoMinCoperti(List<Ristorante> listaRistoranti, Integer minCoperti){
        return listaRistoranti.stream()
                .filter((risto) -> risto.getCoperti() >= minCoperti)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Data la lista di ristoranti fornita sopra, scrivere un metodo
     * che restituisca una mappa tipo di ristorante → lista dei ristoranti di quel tipo
     * (nella versione Java 8 si utilizzi per la mappatura un riferimento a metodo).
     */
    public static Map<TipoRistorante, List<Ristorante>> ristoranteDelloStessoTipo(List<Ristorante> listaRistoranti){
        Map<TipoRistorante, List<Ristorante>> mappaRistoranti = new HashMap<>();
        Arrays.stream(TipoRistorante.values())
                .forEach(tipo ->
                        mappaRistoranti.put(tipo,
                                listaRistoranti.stream()
                                        .filter(risto -> risto.getTipo().equals(tipo))
                                        .collect(Collectors.toCollection(ArrayList::new))));
        return mappaRistoranti;
        //Il metodo funziona correttamente, ma non sono sicuro che sia implementato nel modo desiderato dal prof.
    }

    /**
     * Data la lista di ristoranti fornita sopra, scrivere un metodo
     * che stampi i nomi dei ristoranti in ordine alfabetico separati da virgola.
     */
    public static void stampaRistorantiOrdinati(List<Ristorante> listaRistoranti){
        System.out.println(
                listaRistoranti.stream()
                .sorted(Comparator.comparing(Ristorante::getNome))
                .map(Ristorante::getNome)
                .collect(Collectors.joining(", ")));
    }

    /**
     * Data la lista di ristoranti fornita sopra, scrivere un metodo
     * che restituisca la somma totale di tutti i coperti dei ristoranti nella lista.
     */
    public static int sommaCopertiRistoranti(List<Ristorante> listaRistoranti){
        return listaRistoranti.stream().
                map(Ristorante::getCoperti)
                .reduce(0, Integer::sum);
    }



}

