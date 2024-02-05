package StreamAPI;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountStreamAPI {
    public static void main(String[] args) {
        String input = "I am very handsome am";
        
        Map<String, Long> wordCount = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        wordCount.forEach((word, count) -> System.out.println(word + " - " + count + " time"));
    }
}