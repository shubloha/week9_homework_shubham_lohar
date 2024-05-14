import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme11 {
    public static void main(String[] args) {
        // Create the first ArrayList and add elements to it
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Create the second ArrayList and add elements to it
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // check the arraylist are equal
        if (areArrayListsEqual(c1, c2)) {
            System.out.println("ArrayLists are equal.");
        } else {
            System.out.println("ArrayLists are not equal.");
        }
    }

    //  compare two ArrayLists
    public static boolean areArrayListsEqual(ArrayList<String> list1, ArrayList<String> list2) {
        // Check if the sizes of the ArrayLists are different, if so, they are not equal
        if (list1.size() != list2.size()) {
            return false;
        }

        // Iterate through each element of the first ArrayList
        for (String element : list1) {
            // If an element in the first ArrayList is not found in the second ArrayList, they are not equal
            if (!list2.contains(element)) {
                return false;
            }
        }

        // If all elements of the first ArrayList are found in the second ArrayList and the sizes are equal,
        // then the ArrayLists are equal
        return true;
    }
}
