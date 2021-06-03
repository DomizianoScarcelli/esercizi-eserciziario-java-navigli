package Streams.es3412;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class FileMethods {
    public static Map<String, Integer> mapWordsToOccurenceFromFile(String fileName){
        File file = new File(fileName);
        Map<String, Integer> mappaParole = new HashMap<>();
        ArrayList<String> listaParole = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(file);
            listaParole.addAll(Arrays.asList(scanner.nextLine().split(" ")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        listaParole.forEach(parola -> mappaParole.put(parola, Collections.frequency(listaParole, parola)));
        return mappaParole;



    }

    public static Map<String, Integer> mapWordsToOccurenceFromFile_preJava(String fileName){
        Map<String, Integer> mappaParole = new HashMap<>();
        ArrayList<String> listaParole = new ArrayList<>();
        File file = new File(fileName);
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                for (String parola : scanner.nextLine().split(" "))
                    listaParole.add(parola);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (String parola : listaParole){
            mappaParole.put(parola, Collections.frequency(listaParole, parola));
        }
        return mappaParole;
    }

    public static void main(String[] args) {
        System.out.println(FileMethods.mapWordsToOccurenceFromFile_preJava("C:\\Users\\scarc\\IdeaProjects\\esercizi-eserciziario-java-navigli\\src\\Streams\\es3412\\parole"));
        System.out.println(FileMethods.mapWordsToOccurenceFromFile("C:\\Users\\scarc\\IdeaProjects\\esercizi-eserciziario-java-navigli\\src\\Streams\\es3412\\parole"));

    }
}
