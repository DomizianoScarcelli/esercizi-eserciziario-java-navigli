package Eserciziario.es217;

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
            String nomeOp1 = istruzioneArgomenti[1].substring(0, istruzioneArgomenti[1].length() - 1);
            String nomeOp2 = istruzioneArgomenti[2];
            Registro op1 = procedura.findOrAddRegistro(nomeOp1);
            Operando op2;
            try {
                int value = Integer.parseInt(nomeOp2);
                op2 = new Intero(value);
            } catch (NumberFormatException e) {
                op2 = procedura.findOrAddRegistro(nomeOp2);
            }

            switch (istruzione) {
                case "MOV":
                    procedura.addIstruzione(new Mov(op1, op2));
                    break;
                case "ADD":
                    procedura.addIstruzione(new Add(op1, op2));
                    break;
                case "CMP":
                    procedura.addIstruzione(new Cmp(op1, op2));
                    break;
            }

        }
        return procedura;
    }

    public static void main(String[] args) throws IOException {

        File file = new File("src/Eserciziario.es217/main");
        Procedura procedura = ReadFromFile(file);
        VirtualMachine vm = new VirtualMachine(procedura);
        System.out.println(procedura);
        System.out.println("Prima: \n" + vm.stampaValoriRegistri());
        vm.esegui();
        System.out.println("Dopo: \n" + vm.stampaValoriRegistri());
    }
}
