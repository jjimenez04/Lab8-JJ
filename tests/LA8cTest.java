import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class LA8cTest {

    @Test
    public void testWordCountAccuracy() {
        String text = "the cat and the dog and the mouse";
        String[] words = text.split(" ");
        Map<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        assertEquals("Expected count for 'the' is 3", (Integer)3, counts.get("the"));
        assertEquals("Expected count for 'and' is 2", (Integer)2, counts.get("and"));
        assertEquals("Expected count for 'cat' is 1", (Integer)1, counts.get("cat"));
    }

    @Test
    public void testMapContainsKeys() {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 2);
        map.put("banana", 3);
        assertTrue(map.containsKey("apple"));
        assertTrue(map.containsKey("banana"));
    }

    @Test
    public void testEmptyText() {
        String text = "";
        String[] words = text.split(" ");
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty())
                counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        assertTrue("Empty string should result in empty map", counts.isEmpty());
    }
}
