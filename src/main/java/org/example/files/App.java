package org.example.files;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        try {
            String[] words = readWordsFromFile("readme.txt");

            Map<String, Integer> wordsMap = calculateWordsNumbers(words);

            writeWordsToFile(wordsMap, "results.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file " + e);
        } catch (IOException e) {
            System.out.println("IO Exception: " + e);
        }
    }

    private static void writeWordsToFile(Map<String, Integer> wordsMap, String fileName) throws IOException {
        File outFile = new File(fileName);
        if (outFile.exists() && outFile.delete()) {
            System.out.println("Removed existing output file");
        }

        if (outFile.createNewFile()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            writer.write(wordsMap.toString());
            writer.close();
        } else {
            throw new FileNotFoundException("Could not create output file.");
        }
    }

    private static Map<String, Integer> calculateWordsNumbers(String[] words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String w : words) {
            String key = w.toLowerCase();
            Integer number = wordsMap.get(key);
            if (number == null) {
                wordsMap.put(key, 1);
            } else {
                wordsMap.put(key, number + 1);
            }
        }
        wordsMap.remove("");
        return wordsMap;
    }

    private static String[] readWordsFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String fileContents = "";
        String line;
        while ((line = br.readLine()) != null) {
            fileContents += line;
        }
        br.close();

        String plainText = fileContents.replaceAll("[^a-zA-Z0-9 ]", "");

        String[] words = plainText.split(" ");
        return words;
    }
}
