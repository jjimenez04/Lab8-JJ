import java.util.TreeSet;
import java.util.Random;

public class LA8b {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Random random = new Random();
        while (set.size() < 20) {
            int num = random.nextInt(100) + 1;
            System.out.println("Adding: " + num);

            boolean added = set.add(num);

            if  (added) {
                System.out.println("Set: " + set);
            }
            else {
                System.out.println("Duplicate found, ignored.");
            }
        }
        System.out.println("Final Set (20 numbers): " + set);
    }
}
