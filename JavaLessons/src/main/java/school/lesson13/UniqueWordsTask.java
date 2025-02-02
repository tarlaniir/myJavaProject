package school.lesson13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class UniqueWordsTask {

    public static void analyzeWords(String[] words) {

        Set<String> uniqueWords = new HashSet<>();

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            uniqueWords.add(word);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println("\nКоличество повторений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
