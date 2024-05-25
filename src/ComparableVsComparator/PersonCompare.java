package ComparableVsComparator;

import java.util.*;

public class PersonCompare {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));


        // Sort by name using Comparator
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("\nSorted by name:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sort by name using Lambda
        people.sort(Comparator.comparing(Person::getAge).reversed());

        System.out.println("\nSorted by name (using lambda):");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

