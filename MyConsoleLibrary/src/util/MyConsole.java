package util;

import java.util.List;
import java.util.Scanner;

public class MyConsole {
	static Scanner sc = new Scanner(System.in);

	// method to prompt for a string input **same line**
	public static void print(String msg) {
		System.out.print(msg);
	}

	// method to print message **next line**
	public static void println(String msg) {
		System.out.println(msg);
	}

	 // Overloaded method to print a new line
    public static void println() {
        System.out.println(); // This prints a new line
    }
	
	// method to prompt string
	public static String promptString(String prompt) {
		print(prompt);
		return sc.nextLine();
	}

	// method to prompt required string that matches either str1 or str2
	public static String promptReqString(String prompt, String str1, String str2) {
		String result = "";
		boolean isValid = false;
		while (!isValid) {
			result = promptString(prompt);
			if (!result.trim().isEmpty()) {
				if (result.equalsIgnoreCase(str1) || result.equalsIgnoreCase(str2)) {
					isValid = true;
				} else {
					println("Error - string must be either " + str1 + " or " + str2);
				}
			} else {
				System.err.println("Error - entry is required");
			}
		}
		return result;
	}

	// Method to prompt for a double value
	public static double promptDouble(String prompt) {
		boolean isValid = false;
		double result = 0.0;

		while (!isValid) {
			print(prompt);
			if (sc.hasNextDouble()) {
				result = sc.nextDouble();
				sc.nextLine();
				isValid = true;
			} else {
				System.err.println("Error - invalid double. Try again");
				sc.next(); 
			}
		}
		return result;
	}

	// Method to prompt for an integer value
	public static int promptInt(String prompt) {
		boolean isValid = false;
		int result = 0;

		while (!isValid) {
			print(prompt);
			if (sc.hasNextInt()) {
				result = sc.nextInt();
				sc.nextLine();
				isValid = true;
			} else {
				System.err.println("Error - invalid integer. Try again");
				sc.next();
			}
		}
		return result;
	}

	// Method to prompt for an integer value **within a range**
	public static int promptInt(String prompt, int min, int max) {
		int result = 0;
		boolean isValid = false;
		while (!isValid) {
			print(prompt);
			if (sc.hasNextInt()) {
				result = sc.nextInt();
				sc.nextLine();
				if (result >= min && result <= max) {
					isValid = true;
				} else {
					println("Error - integer must be between " + min + " and " + max);
				}
			} else {
				System.err.println("Error - invalid integer. Try again");
				sc.next();
			}
		}
		return result;
	}
	
	public static void printHeader(String header, String sep) {
	    println(header);
	    String separatorLine = sep.repeat(header.length());
	    println(separatorLine);
	}

	public static void printHeader(String header) {
	    printHeader(header, "="); // Calls the first method with a default separator of "="
	}
	public static String promptString(String prompt, List<String> validValues) {
		String str = "";
		boolean success = false;
		while (!success) {
			str = promptString(prompt);
//			for (String s: validValues) {
//				if (s.equalsIgnoreCase(str)) {
//					success = true;
//					break;
//				}
//			}
			if (validValues.contains(str)) {
				success = true;
			}
			if (!success) {
				println("Invalid value. Try again.");
			}
		}
		return str;
	}
}
