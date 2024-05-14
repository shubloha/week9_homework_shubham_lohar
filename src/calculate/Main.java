package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char choice;

        // Loop to perform calculations until the user chooses to exit
        do {
            System.out.print("Enter first Number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second Number: ");
            int num2 = scanner.nextInt();
            System.out.print("Please enter one of symbol +, -, *, /: ");
            char symbol = scanner.next().charAt(0);

            // Calculate and display result
            calculator.calculateResult(num1, num2, symbol);

            // Ask if the user wants to perform more calculations
            System.out.print("Would you like to do more calculation? Please enter 'Y' or 'N': ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y'); // Continue loop if user enters 'Y' or 'y'

        // Close scanner and print termination message
        scanner.close();
        System.out.println("Program terminated.");
    }
}
