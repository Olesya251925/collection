package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapUtilsTest {

    @Test
    public void testSwapKeysAndValues() {
        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");

        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("One", 1);
        expectedMap.put("Two", 2);
        expectedMap.put("Three", 3);

        Map<String, Integer> swappedMap = MapUtils.swapKeysAndValues(originalMap);
        assertEquals(expectedMap, swappedMap);
    }
}
