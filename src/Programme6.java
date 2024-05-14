import java.util.ArrayList;

public class Programme6 {

    /**
     * 6. Write a Java program to retrieve an element (at a specified index) from a given
     * array list
     */


    public static void main(String[]args){

        // Creating an ArrayList
        ArrayList<String> mobileCompany  =new ArrayList<>();
        mobileCompany.add("Iphone");
        mobileCompany.add("Samsung");
        mobileCompany.add("Nokia");
        mobileCompany.add("Oppo");
        mobileCompany.add("LG");
        mobileCompany.add("Huawei");

        int index =5;

        company1(index,mobileCompany);

    }
    public static void company1(int index,ArrayList<String>mobileCompany){
        if(index >= 0 && index <mobileCompany.size()){
            String element = mobileCompany.get(index);

            System.out.println("Position of Index "+index+" : "+element);
        }else {
            System.out.println("Index out of bounds");
        }


    }
}
