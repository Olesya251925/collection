package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimesGenerator implements Iterable<Integer> {
    private final List<Integer> primes;

    public PrimesGenerator(int n) {
        primes = generatePrimes(n);
    }

    private List<Integer> generatePrimes(int n) {
        List<Integer> primeList = new ArrayList<>();
        int count = 0;
        int num = 2; // Начинаем с первого простого числа

        while (count < n) {
            if (isPrime(num)) {
                primeList.add(num);
                count++;
            }
            num++;
        }
        return primeList;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    @Override
    public Iterator<Integer> iterator() {
        return primes.iterator();
    }
}
