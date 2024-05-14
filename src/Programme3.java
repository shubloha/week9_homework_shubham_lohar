import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme3 {
    public static void main(String[] args) {
        //create single dimension array
        int a[] = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println("before reverse number are: " + Arrays.toString(a));
       // calling the method in main method
        m1(a);
    }

    public static void m1(int[] arr) {
        System.out.println("After reversing numbers are:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}