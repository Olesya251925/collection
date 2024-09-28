package org.example;

import java.util.Iterator;

public class PrimesGeneratorTest {
    public static void main(String[] args) {
        int n = 10; // Количество простых чисел для генерации
        PrimesGenerator primesGenerator = new PrimesGenerator(n);

        System.out.println("Простые числа в прямом порядке:");
        for (Integer prime : primesGenerator) {
            System.out.print(prime + " ");
        }
        System.out.println();

        System.out.println("Простые числа в обратном порядке:");
        Iterator<Integer> iterator = primesGenerator.iterator();
        Integer[] primesArray = new Integer[n];
        int index = 0;

        // Сохраняем простые числа в массив
        while (iterator.hasNext()) {
            primesArray[index++] = iterator.next();
        }

        // Печатаем в обратном порядке
        for (int i = primesArray.length - 1; i >= 0; i--) {
            System.out.print(primesArray[i] + " ");
        }
        System.out.println();
    }
}
