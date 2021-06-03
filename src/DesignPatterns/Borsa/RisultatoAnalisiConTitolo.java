package DesignPatterns.Borsa;

public class RisultatoAnalisiConTitolo extends AnalizzatoreDecorator{

    private String titolo;
    public RisultatoAnalisiConTitolo(Analizzatore analizzatore, String titolo) {
        super(analizzatore);
        this.titolo = titolo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titolo).append("\n").append(analizzatore.toString());
        return sb.toString();
    }
}
