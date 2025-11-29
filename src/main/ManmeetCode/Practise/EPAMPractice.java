package Practise;

 /*
    *
    * Map<String,Person> map = new HashMap<>();
map.put("g",new Person(5, 51, "EE"));
map.put("e",new Person(4,25,"DD"));
map.put("a",new Person(3, 44, "CC"));
    *
    * */

import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;

public class EPAMPractice {

    public static void main(String[] args) {
        Person p1 = new Person("M",51,"EE");
        Person p2 = new Person("F",25,"DD");
        Person p3 = new Person("M",44,"CC");
        Person p4 = new Person("F",5,"EE");

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);

        Map<String, Double> avgByGender = personList.stream().collect(Collectors.groupingBy(
                (Person::getGender), Collectors.averagingInt(Person::getAge)));

        System.out.println("avg is: " +avgByGender);


       /* Map<String, Person> inputMap = new HashMap<String, Person>();

        inputMap.put("g",p1);
        inputMap.put("e",p2);
        inputMap.put("a",p3);
        inputMap.put("g",p4);

        Map<String, Person> collectMap = inputMap.entrySet().stream().sorted(
                Comparator.comparing(e -> e.getValue().getAge())
        ).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1,e2) -> e2,
                LinkedHashMap::new
        ));

        //collectMap.forEach(k,v)->System.out.println(k+"," +v );

        System.out.println(collectMap);*/



    }
}
