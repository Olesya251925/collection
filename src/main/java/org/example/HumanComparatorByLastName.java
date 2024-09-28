package org.example;

import java.util.Comparator;

//реализует интерфейс Comparator<Human> и предназначен для сравнения объектов класса Human по их фамилиям.
public class HumanComparatorByLastName implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h1.getLastName().compareTo(h2.getLastName());
    }
}
