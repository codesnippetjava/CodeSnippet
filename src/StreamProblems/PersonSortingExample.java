package StreamProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonSortingExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Anna", 22),
                new Person("Mike", 29),
                new Person("Sophia", 24)
        );

        // Sorting by age in descending order
        List<Person> sortedByAgeDesc = people.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .collect(Collectors.toList());

        System.out.println
                ("Sorted by age in descending order:");
        sortedByAgeDesc.forEach(System.out::println);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
