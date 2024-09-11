package Java8;

import java.util.*;
import java.util.stream.Collectors;

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
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum is : " +sum);

        // Find Maximum Element in a List of Integers **
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println("Max is: " +max.get());

        // Sort List<String>
        List<String> sorted = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list is");
        sorted.forEach(System.out::println);

        // Reverse Sorted List<String>
        List<String> reverseSorted = list.stream().sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println("Reverse Sorted list is");
        reverseSorted.forEach(System.out::println);

        //Reverse sort List<Number>
        List<Integer> reverseInteger = numbers.stream().sorted(Comparator.reverseOrder()).
                                        collect(Collectors.toList());
        System.out.println("Reverse integer list..");
        reverseInteger.forEach(System.out::println);

    }
}
