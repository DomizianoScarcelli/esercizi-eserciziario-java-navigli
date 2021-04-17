package es217;

import java.util.ArrayList;

public interface Istruzione {
    int esegui();

    String getNome();

    ArrayList<Operando> getListaOperandi();
}
