
import java.util.*;

public class CityNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // LinkedHashSet that maintaining insertion order and removing duplicates
        Set<String> cities = new LinkedHashSet<>();

        System.out.println("Enter 3 city names (duplicates allowed):");
        for (int i = 1; i <= 3; i++) {
            System.out.print("City " + i + ": ");
            String city = sc.nextLine();
            cities.add(city);
        }
        // displaying 5 city names and removing duplicates
        System.out.println("\nCities (in entered order, without duplicates):");
        for (String c : cities) {
            System.out.println(c);
        }
    }
}
