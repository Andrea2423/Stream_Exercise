package org.example;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Tester {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\zoraa\\IdeaProjects\\Stream_Exercise\\src\\file.txt"; // Specifica il percorso del file

        // uso un blocco try-catch per gestire le eccezioni IOException
        try {
            // creo uno stream delle righe del file
            Stream<String> lines = Files.lines(Paths.get(filePath));

            // Utilizza l'API Stream per elaborare ogni riga
            lines.forEach(line -> {
                // Sostituisci questa istruzione con la logica specifica per l'elaborazione di ogni riga
                System.out.println("Linea letta: " + line);
            });

            // Chiudi lo stream quando hai finito
            lines.close();

        } catch (IOException e) {
            // Gestisci le eccezioni IOException qui
            e.printStackTrace();
        }
    }
}