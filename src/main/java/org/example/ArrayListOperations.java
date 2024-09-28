package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ArrayListOperations {
    // a) Создайте массив из N случайных чисел от 0 до 100.
    public static int[] generateRandomArray(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(101); // случайное число от 0 до 100
        }
        return array;
    }

    // b) На основе массива создайте список List.
    public static List<Integer> arrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }

    // c) Отсортируйте список по возрастанию.
    public static void sortListAscending(List<Integer> list) {
        Collections.sort(list);
        System.out.println("Отсортированный по возрастанию список: " + list);
    }

    // d) Отсортируйте список в обратном порядке.
    public static void sortListDescending(List<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Отсортированный в обратном порядке список: " + list);
    }

    // e) Перемешайте список.
    public static void shuffleList(List<Integer> list) {
        Collections.shuffle(list);
        System.out.println("Перемешанный список: " + list);
    }

    // f) Выполните циклический сдвиг на 1 элемент.
    public static void rotateList(List<Integer> list) {
        if (!list.isEmpty()) {
            Integer first = list.remove(0);
            list.add(first);
        }
        System.out.println("Список после циклического сдвига: " + list);
    }

    // g) Оставьте в списке только уникальные элементы.
    public static List<Integer> retainUnique(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer num : list) {
            if (Collections.frequency(list, num) == 1) {
                uniqueList.add(num);
            }
        }
        System.out.println("Список с уникальными элементами: " + uniqueList);
        return uniqueList;
    }

    // h) Оставьте в списке только дублирующиеся элементы.
    public static List<Integer> retainDuplicates(List<Integer> list) {
        List<Integer> duplicatesList = new ArrayList<>();
        for (Integer num : list) {
            if (Collections.frequency(list, num) > 1 && !duplicatesList.contains(num)) {
                duplicatesList.add(num);
            }
        }
        System.out.println("Список с дублирующимися элементами: " + duplicatesList);
        return duplicatesList;
    }

    // i) Из списка получите массив.
    public static Integer[] listToArray(List<Integer> list) {
        return list.toArray(new Integer[0]);
    }

    // j) Посчитайте количество вхождений каждого числа в массив и выведите на экран.
    public static void countOccurrences(int[] array) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int num : array) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        System.out.println("Количество вхождений каждого числа:");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Число " + entry.getKey() + ": " + entry.getValue() + " раз(а)");
        }
    }
}
