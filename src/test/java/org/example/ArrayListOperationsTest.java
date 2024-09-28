package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListOperationsTest {

    @Test
    public void testGenerateRandomArray() {
        int[] array = ArrayListOperations.generateRandomArray(10);
        assertEquals(10, array.length, "Сгенерированный массив должен иметь длину 10.");
        for (int num : array) {
            assertTrue(num >= 0 && num <= 100, "Сгенерированные числа должны быть от 0 до 100.");
        }
    }

    @Test
    public void testArrayToList() {
        int[] array = {1, 2, 3};
        List<Integer> list = ArrayListOperations.arrayToList(array);
        assertEquals(Arrays.asList(1, 2, 3), list, "Массив должен быть корректно преобразован в список.");
    }

    @Test
    public void testSortListAscending() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2)); // Изменяемый список
        ArrayListOperations.sortListAscending(list);
        assertEquals(Arrays.asList(1, 2, 3), list, "Список должен быть отсортирован в порядке возрастания.");
    }

    @Test
    public void testSortListDescending() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3)); // Изменяемый список
        ArrayListOperations.sortListDescending(list);
        assertEquals(Arrays.asList(3, 2, 1), list, "Список должен быть отсортирован в порядке убывания.");
    }

    @Test
    public void testShuffleList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // Изменяемый список
        List<Integer> originalList = new ArrayList<>(list);
        ArrayListOperations.shuffleList(list);
        assertNotEquals(originalList, list, "Перемешанный список не должен быть равен оригинальному списку.");
    }

    @Test
    public void testRotateList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3)); // Изменяемый список
        ArrayListOperations.rotateList(list);
        assertEquals(Arrays.asList(2, 3, 1), list, "Список должен быть корректно вращен.");
    }

    @Test
    public void testRetainUnique() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5)); // Изменяемый список
        List<Integer> uniqueList = ArrayListOperations.retainUnique(list);
        assertEquals(Arrays.asList(1, 3, 5), uniqueList, "Должны быть сохранены уникальные элементы.");
    }

    @Test
    public void testRetainDuplicates() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5)); // Изменяемый список
        List<Integer> duplicatesList = ArrayListOperations.retainDuplicates(list);
        assertEquals(Arrays.asList(2, 4), duplicatesList, "Должны быть сохранены дубликаты.");
    }

    @Test
    public void testListToArray() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3)); // Изменяемый список
        Integer[] array = ArrayListOperations.listToArray(list);
        assertArrayEquals(new Integer[]{1, 2, 3}, array, "Список должен быть корректно преобразован в массив.");
    }

    @Test
    public void testCountOccurrences() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        ArrayListOperations.countOccurrences(array);
        // Нет утверждения: проверка производится вручную на основе консольного вывода.
    }
}
