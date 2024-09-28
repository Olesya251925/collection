package org.example;

public class Human implements Comparable<Human> {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Human other) {
        return this.lastName.compareTo(other.lastName); // Сравнение по фамилии по умолчанию
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + ", Возраст: " + age;
    }
}


//HashSet не сохраняет порядок вставки элементов и не позволяет дублирование, поэтому вывод может
//быть произвольным и неупорядоченным.
//
//LinkedHashSet сохраняет порядок вставки, поэтому вывод будет в том же порядке, в котором
//объекты были добавлены.
//
//TreeSet хранит элементы в отсортированном порядке по умолчанию (по фамилии) и также
//не позволяет дублирование.
//
//При использовании TreeSet с созданным компаратором (HumanComparatorByLastName)
//элементы будут отсортированы по фамилии.
//
//Анонимный компаратор по возрасту для TreeSet будет сортировать элементы по возрасту,
//поэтому вывод будет в порядке возрастания возраста.
//*/
