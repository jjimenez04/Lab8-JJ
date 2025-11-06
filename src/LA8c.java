import java.util.HashMap;
import java.util.Map;

public class LA8c {
    public static void main(String[] args) {
        String sentence = "the cat and the dog and the mouse";
        String[] words =  sentence.toLowerCase().split(" ");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Input sentence: \"" + sentence + "\"");
        System.out.println("Word counts: " + wordCount);

    }
}
