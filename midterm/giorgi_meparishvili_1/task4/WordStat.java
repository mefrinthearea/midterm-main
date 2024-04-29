package midterm.giorgi_meparishvili_1.task4;

import java.util.*;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Create a set of all distinct words
        Set<String> distinctWords = new HashSet<>(fantasyFormatData);
        System.out.println("Distinct words:");
        System.out.println(distinctWords);

        // Create a map with word length as key and count as value
        Map<Integer, Integer> wordLengthCount = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthCount.put(length, wordLengthCount.getOrDefault(length, 0) + 1);
        }

        System.out.println("\n\nWord length count:");
        for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
            System.out.println("Length " + entry.getKey() + ": " + entry.getValue() + " words");
        }
    }
}