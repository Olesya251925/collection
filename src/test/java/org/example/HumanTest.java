package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {
    private List<Human> humanList;

    @BeforeEach
    public void setUp() {
        humanList = new ArrayList<>();
        humanList.add(new Human("Анна", "Рюмина", 22));
        humanList.add(new Human("Кириллова", "Елена", 49));
        humanList.add(new Human("Марина", "Соколова", 28));
        humanList.add(new Human("Полина", "Варкина", 35));
    }

    @Test
    public void testHumanList() {
        // Проверяем создание списка
        assertEquals(4, humanList.size());
        assertEquals("Анна Рюмина, Возраст: 22", humanList.getFirst().toString());
    }

    @Test
    public void testHashSet() {
        // Создаем HashSet и добавляем список
        HashSet<Human> humanSet = new HashSet<>(humanList);
        System.out.println("HashSet: " + humanSet);
        assertEquals(4, humanSet.size());
    }

    @Test
    public void testLinkedHashSet() {
        // Создаем LinkedHashSet и добавляем список
        LinkedHashSet<Human> linkedHumanSet = new LinkedHashSet<>(humanList);
        System.out.println("LinkedHashSet: " + linkedHumanSet);
        assertEquals(4, linkedHumanSet.size());
    }

    @Test
    public void testTreeSet() {
        // Создаем TreeSet и добавляем список
        TreeSet<Human> treeHumanSet = new TreeSet<>(humanList);
        System.out.println("TreeSet: " + treeHumanSet);
        assertEquals(4, treeHumanSet.size());
    }

    @Test
    public void testTreeSetWithComparator() {
        // Создаем TreeSet с компаратором по фамилии
        TreeSet<Human> treeSetWithComparator = new TreeSet<>(new HumanComparatorByLastName());
        treeSetWithComparator.addAll(humanList);
        System.out.println("TreeSet с компаратором: " + treeSetWithComparator);
        assertEquals(4, treeSetWithComparator.size());
    }

    @Test
    public void testTreeSetWithAnonymousComparator() {
        // Создаем TreeSet с анонимным компаратором по возрасту
        TreeSet<Human> treeSetWithAnonymousComparator = new TreeSet<>(Comparator.comparingInt(Human::getAge));
        treeSetWithAnonymousComparator.addAll(humanList);
        System.out.println("TreeSet с анонимным компаратором: " + treeSetWithAnonymousComparator);
        assertEquals(4, treeSetWithAnonymousComparator.size());
    }
}
