import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme4 {

    public static void main(String[] args) {
        //calling method into main method
            addColours();

    }
    public  static void addColours(){
        //initilize the array
        int a [] = new int[6];
        ArrayList<String> colorList = new ArrayList<>();
        //Add value (string) into arraylist
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Blue");
        colorList.add("Pink");
        colorList.add("Orange");
        colorList.add("Purple");
        colorList.add("Green");
        //for loop
        for(String color:colorList){
            System.out.println(color);
        }
    }
}
