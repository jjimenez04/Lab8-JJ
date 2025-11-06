import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class LA8bTest {

    @Test
    public void testNoDuplicates() {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(10);
        assertEquals("Set should only contain one instance of each number", 1, numbers.size());
    }

    @Test
    public void testAutomaticOrdering() {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        List<Integer> list = new ArrayList<>(numbers);
        assertEquals(Arrays.asList(1, 3, 5), list);
    }

    @Test
    public void testRandomRange() {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        assertTrue("Number should be between 1 and 100", num >= 1 && num <= 100);
    }
}
