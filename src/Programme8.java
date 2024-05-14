import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme8 {

    public static void main(String[] args) {
        // Create a HashSet to store Integer objects
        HashSet<Integer> numberSet = new HashSet<>();

        // Store the numbers 4, 7, and 8 in the set
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        // Show which numbers between 1 and 10 are in the set
       m1(numberSet);
    }

    // Method to show which numbers between 1 and 10 are in the set
    public static void m1(HashSet<Integer> set) {
        for (int i = 1; i <= 10; i++) {
            // Check if the current number is present in the set
            if (set.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }
}
