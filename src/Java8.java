import java.util.Arrays;
import java.util.List;

public class Java8 {

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("java", "jdk", "spring", "maven");
        String tweet = "This is an example tweet talking about java and maven.";
        System.out.println(wordList.stream().anyMatch(s->tweet.contains(s)));
    }
}
