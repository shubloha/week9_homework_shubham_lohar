import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 *   Iterater.
 */
public class Programme5 {
    public static void main(String[] args) {
        //initilize the array
        int x[] = new int[4];
        // Creating an ArrayList
        ArrayList<String> godName = new ArrayList<>();
        godName.add("Ram");
        godName.add("Krishna");
        godName.add("Shiva");
        godName.add("Vishnu");
        godName.add("Hanuman");
        //for Iterator
        Iterator<String> list = godName.iterator();
        while (list.hasNext()) {    //hasNext()-it is boolean method
            System.out.println(list.next() + " ");
        }

    }
}


