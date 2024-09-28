package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Операции с массивом");
        System.out.println("2 - Генерация простых чисел");
        System.out.println("3 - Операции с классом Human");
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
        } else if (choice == 3) {
            // Третья задача: операции с классом Human
            List<Human> humans = new ArrayList<>();
            humans.add(new Human("Кириллова", "Олеся", 20));
            humans.add(new Human("Когай", "Таисия", 19));
            humans.add(new Human("Меристе", "Илья", 21));
            humans.add(new Human("Волкова", "Елена", 22));

            // a) HashSet
            HashSet<Human> hashSet = new HashSet<>(humans);
            System.out.println("HashSet содержимое:");
            System.out.println(hashSet);

            // b) LinkedHashSet
            LinkedHashSet<Human> linkedHashSet = new LinkedHashSet<>(humans);
            System.out.println("LinkedHashSet содержимое:");
            System.out.println(linkedHashSet);

            // c) TreeSet
            TreeSet<Human> treeSet = new TreeSet<>(humans);
            System.out.println("TreeSet содержимое:");
            System.out.println(treeSet);

            // d) TreeSet с компаратором
            TreeSet<Human> treeSetWithComparator = new TreeSet<>(new HumanComparatorByLastName());
            treeSetWithComparator.addAll(humans);
            System.out.println("TreeSet с компаратором по фамилии:");
            System.out.println(treeSetWithComparator);

            // e) TreeSet с анонимным компаратором по возрасту
            TreeSet<Human> treeSetWithAnonymousComparator = new TreeSet<>(Comparator.comparingInt(Human::getAge));
            treeSetWithAnonymousComparator.addAll(humans);
            System.out.println("TreeSet с анонимным компаратором по возрасту:");
            System.out.println(treeSetWithAnonymousComparator);
        } else {
            System.out.println("Неверный выбор. Пожалуйста, выберите 1, 2 или 3.");
        }

        scanner.close();
    }
}
