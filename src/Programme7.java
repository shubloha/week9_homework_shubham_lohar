import java.util.ArrayList;

/**
 * write a Java program to test if an array list is empty or not.
 */
public class Programme7 {

    public static void main(String[] args) {
        //call static method in main method
       car1();
    }
    public static void car1(){
        // Creating an ArrayList
        ArrayList<String> carList = new ArrayList<>();

        // Adding elements to the ArrayList
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Ford");
        carList.add("Toyota");

        // Checking if the ArrayList is empty or not
        if (carList.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }
    }
}