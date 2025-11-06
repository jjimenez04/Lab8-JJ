import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class LA8aTest {

    @Test
    public void testListSize() {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(50) + 1);
        }
        assertEquals("List should contain 10 integers", 10, numbers.size());
    }

    @Test
    public void testSortingOrder() {
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 4);
        Collections.sort(numbers);
        assertEquals(Arrays.asList(1, 3, 4, 5, 9), numbers);
    }

    @Test
    public void testAverageCalculation() {
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        assertEquals("Average should be 20.0", 20.0, avg, 0.001);
    }
}
