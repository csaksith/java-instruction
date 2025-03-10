package util;

import java.util.Scanner;

public class MyConsole {
    static Scanner sc = new Scanner(System.in);

    // Method to prompt for a double value
    public static double promptDouble(String prompt) {
        boolean isValid = false;
        double result = 0.0;

        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                result = sc.nextDouble(); // Use nextDouble() directly
                sc.nextLine();
                isValid = true;
            } else {
                System.err.println("Error - invalid entry. Try again");
                sc.nextLine(); // discard invalid input
            }
        }
        return result;
    }

    // Method to prompt for an integer value
    public static int promptInt(String prompt) {
        boolean isValid = false;
        int result = 0;

        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                result = sc.nextInt(); // Use nextInt() directly
                sc.nextLine();
                isValid = true;
            } else {
                System.err.println("Error - invalid entry. Try again");
                sc.nextLine(); // discard invalid input
            }
        }
        return result;
    }
    
    
    // method to prompt for a string input
    public static String promptString(String prompt) {
    	System.out.print(prompt);
    	return sc.nextLine();
    }
    
}