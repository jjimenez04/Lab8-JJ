import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class LA8d {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Alice");
        listA.add("Bob");
        listA.add("Charlie");
        listA.add("Dana");

        ArrayList<String> listB = new ArrayList<>();
        listB.add("Charlie");
        listB.add("Dana");
        listB.add("Evan");
        listB.add("Fiona");

        System.out.println("List A: " + listA);
        System.out.println("List B: " + listB);

        Set<String> setA = new HashSet<>(listA);
        Set<String> commonNames = new HashSet<>(listA);
        commonNames.retainAll(listB);

        System.out.println("Common names: " + commonNames);

        Set<String> uniqueNames =  new HashSet<>(listA);
        uniqueNames.addAll(listB);

        System.out.println("All unique names: " + uniqueNames);


    }
}
