import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class LA8dTest {

    @Test
    public void testCommonNames() {
        List<String> listA = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> listB = Arrays.asList("Charlie", "Dana", "Evan");

        List<String> common = new ArrayList<>(listA);
        common.retainAll(listB);

        assertEquals(Arrays.asList("Charlie"), common);
    }

    @Test
    public void testUniqueUnion() {
        List<String> listA = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> listB = Arrays.asList("Charlie", "Dana", "Evan");

        Set<String> all = new HashSet<>(listA);
        all.addAll(listB);

        assertTrue("Set should contain 6 unique names", all.containsAll(Arrays.asList("Alice", "Bob", "Charlie", "Dana", "Evan")));
        assertEquals("Total unique names should be 5", 5, all.size());
    }

    @Test
    public void testEmptyIntersection() {
        List<String> listA = Arrays.asList("A", "B");
        List<String> listB = Arrays.asList("C", "D");
        List<String> common = new ArrayList<>(listA);
        common.retainAll(listB);
        assertTrue("Lists with no overlap should yield empty intersection", common.isEmpty());
    }
}
