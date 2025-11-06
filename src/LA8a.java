import java.util.ArrayList;
import java.util.Collections;


public class LA8a {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(12);
        list.add(20);
        list.add(22);
        list.add(26);
        list.add(39);
        list.add(42);
        list.add(45);
        System.out.println("Original list: " + list);
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        double average = 0;
        for (Integer i : list) {
            average += i;
        }
        average /= list.size();
        System.out.println("Average: " + average);


    }
}
