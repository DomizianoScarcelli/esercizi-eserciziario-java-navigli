package Eserciziario.es217;

import java.util.ArrayList;

/**
 * Questa interfaccia modella un'istruzione Assembly.
 */
public interface Istruzione {

    int esegui();

    String getNome();

    ArrayList<Operando> getListaOperandi();
}
