import java.util.HashMap;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */
public class Programme9 {
    public static void main(String[] args) {
        // Create a HashMap to store String keys and Integer values
        HashMap<String, Integer> people = new HashMap<>();

        // Add some key-value pairs to the map
        people.put("Shubham", 30);
        people.put("Nishit", 25);
        people.put("Savan", 35);
        people.put("Dhavni", 22);
        people.put("Ankita",25);

        // Call the method to iterate over the values in the map
     m1(people);
    }

    // Method to iterate over the values in the map
    public static void m1(HashMap<String, Integer> map) {
        for (Integer age : map.values()) {
            System.out.println("Age: " + age);
        }
    }
}
