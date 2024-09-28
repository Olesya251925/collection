package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 10; // Количество случайных чисел
        int[] randomArray = ArrayListOperations.generateRandomArray(n);

        System.out.println("Сгенерированный массив: " + Arrays.toString(randomArray));

        List<Integer> list = ArrayListOperations.arrayToList(randomArray);

        ArrayListOperations.sortListAscending(list);
        System.out.println("Отсортированный по возрастанию список: " + list);

        ArrayListOperations.sortListDescending(list);
        System.out.println("Отсортированный по убыванию список: " + list);

        ArrayListOperations.shuffleList(list);
        System.out.println("Перемешанный список: " + list);

        ArrayListOperations.rotateList(list);
        System.out.println("Циклический сдвиг на 1 элемент: " + list);

        List<Integer> uniqueList = ArrayListOperations.retainUnique(list);
        System.out.println("Уникальные элементы: " + uniqueList);

        List<Integer> duplicatesList = ArrayListOperations.retainDuplicates(list);
        System.out.println("Дублирующиеся элементы: " + duplicatesList);

        Integer[] arrayFromList = ArrayListOperations.listToArray(list);
        System.out.println("Массив из списка: " + Arrays.toString(arrayFromList));

        ArrayListOperations.countOccurrences(randomArray);
    }
}
