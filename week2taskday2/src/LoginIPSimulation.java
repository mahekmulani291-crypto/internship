import java.util.*;
public class LoginIPSimulation {
    public static void main(String[] args) {
        // Step 1: Creating List with at least 10 login attempts having duplicates
        List<String> loginIPs = new ArrayList<>();
        loginIPs.add("192.168.1.10");
        loginIPs.add("192.168.1.11");
        loginIPs.add("192.168.1.12");
        loginIPs.add("10.0.0.5");
        loginIPs.add("192.168.1.10"); // duplicate
        loginIPs.add("172.16.0.3");
        loginIPs.add("10.0.0.5");     // duplicate
        loginIPs.add("192.168.0.20");
        loginIPs.add("192.168.1.11"); // duplicate
        loginIPs.add("203.0.113.45");
        loginIPs.add("172.16.0.3");   // duplicate
        // Displaying original list
        System.out.println("Login Attempts (with duplicates):");
        for (String ip : loginIPs) {
            System.out.println(ip);
        }
        // Step 2: Removing duplicates using HashSet
        Set<String> uniqueIPs = new HashSet<>(loginIPs);
        System.out.println("\nUnique IP Addresses (after HashSet removes duplicates):");
        for (String ip : uniqueIPs) {
            System.out.println(ip);
        }
        // Step 3: Convert back to list (optional)
        List<String> uniqueIPList = new ArrayList<>(uniqueIPs);
    }
}