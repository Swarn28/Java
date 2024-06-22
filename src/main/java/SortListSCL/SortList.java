package SortListSCL;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        // Adding unsorted elements
        people.add(new Person("121 Alice", 30));
        people.add(new Person("22 Bob", 25));
        people.add(new Person("32 Charlie", 35));
        people.add(new Person("34 Art", 28));

        // Sorting the ArrayList based on age using streams with a custom comparator
        /*people = (ArrayList<Person>) people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());

        // Printing the sorted ArrayList
        people.forEach(person -> System.out.println(person.getName() + " - " + person.getAge()));*/

        people.sort(Comparator.comparing(Person::getName));

        // Printing the sorted ArrayList
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }

        int ageSum = people.stream().collect(Collectors.summingInt(p->p.getAge()));
        System.out.println("Age Sum is : "+ageSum);


    }
}
