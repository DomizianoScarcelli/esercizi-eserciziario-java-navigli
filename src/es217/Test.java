package es217;

import java.io.*;

public class Test {

    public static Procedura ReadFromFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String linea;
        Procedura procedura = new Procedura();
        while ((linea = br.readLine()) != null) {
            //Istruzioni da eseguire per ogni riga di codice letta
            String[] istruzioneArgomenti = linea.split(" ");
            String istruzione = istruzioneArgomenti[0];
            String[] argomenti = istruzioneArgomenti[1].split(", ");
            Registro op1 = new Registro(argomenti[0]);
            Operando op2;
            try {
                int value = Integer.parseInt(argomenti[1]);
                op2 = new Intero(value);
            } catch (NumberFormatException e) {
                op2 = new Registro(argomenti[1]);
            }

            switch (istruzione) {
                case ("MOV"):
                    procedura.addIstruzione(new Mov(op1, op2));
                case ("ADD"):
                    procedura.addIstruzione(new Add(op1, op2));
                case ("CMP"):
                    procedura.addIstruzione(new Cmp(op1, op2));
            }

        }
        return null;
    }

    public static void main(String[] args) throws IOException {

        File file = new File("src/es217/main");
        ReadFromFile(file);
    }
}
