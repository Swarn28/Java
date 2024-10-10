package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8 {

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("java", "jdk", "spring", "maven");
        String tweet = "This is an example tweet talking about java and maven.";
        System.out.println(wordList.stream().anyMatch(s->tweet.contains(s)));

        long wordCount = wordList.stream().filter(s->tweet.contains(s)).count();
        System.out.println("Word Count is: " +wordCount);

        /*
        * Java 8 practice questions
        * https://chatgpt.com/share/656ac02e-c919-4652-8bf8-f9d2f697d3b7
        *
        * */

        // 1. Filter a List of Strings to Include Only Strings with Length Greater than 3.

        List<String> list = Arrays.asList("apple", "is", "amazing", "java");
        List<String> outputList = list.stream().filter(s -> s.length() > 3).collect(Collectors.toList());

        outputList = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        outputList.forEach(System.out::println);

        //Sum of List of Integers Using Streams **
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,5,4,2);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum is : " +sum);

        // Find Maximum Element in a List of Integers **
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println("Max is: " +max.get());

        // second way to find max
        numbers.stream().mapToInt(Integer::intValue).max();

        //way to find average
        numbers.stream().mapToInt(Integer::intValue).average();

        // Sort List<String>
        List<String> sorted = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list is");
        sorted.forEach(System.out::println);

        // Sort a List of Strings by Length.
        List<String> sortedByLength = list.stream().sorted(
                Comparator.comparingInt(String::length)).collect(Collectors.toList());

        // Reverse Sorted List<String>
        List<String> reverseSorted = list.stream().sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println("Reverse Sorted list is");
        reverseSorted.forEach(System.out::println);

        /*
        * More on Comparators
        * https://chatgpt.com/share/6705efcf-e720-8009-8567-083941bf3560
        * */

        //Reverse sort List<Number>
        List<Integer> reverseInteger = numbers.stream().sorted(Comparator.reverseOrder()).
                                        collect(Collectors.toList());
        System.out.println("Reverse integer list..");
        reverseInteger.forEach(System.out::println);


        // create a hashmap of Map<String, Integer> where key is the String and Integer is its length.
        Map<String,Integer> lengthMap = list.stream().collect(Collectors.toMap(s->s,s->s.length()));
        System.out.println("map with length is: ");
        lengthMap.forEach((k,v) -> {
            System.out.println(k + "," + v);
        });

        // taking out some values from a map using entry sets, having a value.
        int leastCount =1;
        Set<String> leastNums = lengthMap.entrySet().stream().
                filter(entry -> entry.getValue() == leastCount).
                map(entry -> entry.getKey()).collect(Collectors.toSet());

        // Count and group by.
        List<String> fruitList = Arrays.asList("apple","banana","apple","pears","orange","banana");
        Map<String, Long> countMap = fruitList.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));
        System.out.println("Grouped by count map is: ");
        countMap.forEach((k,v)->{
            System.out.println(k + ", " + v);
        });

        // FInd Duplicates
        Set<String> duplicates = fruitList.stream().filter(n->Collections.frequency(fruitList,n)>1).
                collect(Collectors.toSet());
        System.out.println("Duplicates are : ");
        duplicates.forEach(System.out::println);

        // Convert a list into list of length
        List<Integer> lengthList = fruitList.stream().map(s->s.length()).collect(Collectors.toList());
        System.out.println("Length list is: ");
        lengthList.forEach(System.out::println);

        // Remove duplicates from a list
        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());


        //partioning by
        Map<Boolean, List<Integer>> isEvenMap = numbers.stream().collect(Collectors.partitioningBy(
                num -> num%2==0
        ));

        System.out.println("Partionied map is: ");
        isEvenMap.forEach((k,v) -> {
            System.out.println(k + ", " +v);
        });

    }
}
