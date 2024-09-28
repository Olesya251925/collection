package org.example;

import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordFrequencyCounterTest {

    @Test
    public void testCountWords() {
        WordFrequencyCounter counter = new WordFrequencyCounter();
        String text = "Hello world! Hello everyone. This is a test. Test, test.";
        counter.countWords(text);

        Map<String, Integer> expectedCounts = Map.of(
                "hello", 2,
                "world", 1,
                "everyone", 1,
                "this", 1,
                "is", 1,
                "a", 1,
                "test", 3
        );

        assertEquals(expectedCounts, counter.getWordCounts());
    }
}
