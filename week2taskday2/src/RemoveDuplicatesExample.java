import java.util.*;
public class RemoveDuplicatesExample {
    public static void main(String[] args) {

        // 1. Store values in a List
        List<String> names = Arrays.asList(
                "Aman", "Neha", "Aman", "Rohit", "Neha", "Sahil", "Aman"
        );

        System.out.println("Original List: " + names);

        // 2. Remove duplicates using HashSet
        Set<String> uniqueSet = new HashSet<>(names);

        // 3. Display both
        System.out.println("Unique Values (Set): " + uniqueSet);

        // 4. Convert back to List (optional)
        List<String> uniqueList = new ArrayList<>(uniqueSet);
        System.out.println("Unique List: " + uniqueList);
    }
}