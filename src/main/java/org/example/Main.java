package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("1 - Операции с массивом");
        System.out.println("2 - Генерация простых чисел");
        System.out.println("Выберите задачу:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Первая задача: операции с массивом
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

        } else if (choice == 2) {
            // Вторая задача: генерация простых чисел
            System.out.print("Введите количество простых чисел для генерации: ");
            int primeCount = scanner.nextInt();

            PrimesGenerator primesGenerator = new PrimesGenerator(primeCount);

            // Выводим простые числа
            System.out.println("Простые числа в прямом порядке: " + primesGenerator.getPrimes());
            System.out.print("Простые числа в обратном порядке: ");
            List<Integer> primes = primesGenerator.getPrimes();
            for (int i = primes.size() - 1; i >= 0; i--) {
                System.out.print(primes.get(i) + " ");
            }
            System.out.println();
        } else {
            System.out.println("Неверный выбор. Пожалуйста, выберите 1 или 2.");
        }

        scanner.close();
    }
}
