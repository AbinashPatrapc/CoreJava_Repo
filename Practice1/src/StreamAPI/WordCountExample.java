package StreamAPI;

import java.util.HashMap;

public class WordCountExample {
    public static void main(String[] args) {
        String input = "I am very handsome";
        
        String[] words = input.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + " - " + count + " time");
        }
    }
}