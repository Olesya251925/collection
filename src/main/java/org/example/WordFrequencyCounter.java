package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    private final HashMap<String, Integer> wordCountMap;

    public WordFrequencyCounter() {
        wordCountMap = new HashMap<>();
    }

    public void countWords(String text) {
        // Приводим текст к нижнему регистру и разбиваем на слова
        String[] words = text.toLowerCase().split("\\W+");

        // Подсчёт частоты слов
        for (String word : words) {
            if (!word.isEmpty()) { // Проверяем, что слово не пустое
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
    }

    public Map<String, Integer> getWordCounts() {
        return wordCountMap;
    }
}
