
import java.util.Random;
import java.util.Scanner;

public class GuessGameApp {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game!~");
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println("\nI'm thinking of a number from 1 to 100.");
		System.out.println("Try to guess it.");
		int min = 1;
		int max = 100;
		int guess = 0;
		int count = 0;
		String choice = "y";
		Random rand = new Random();
		
		while (choice.equalsIgnoreCase("y")) {
			int theNumber = rand.nextInt(min,max);
			System.out.println("Debug*** the number is: "+theNumber);
			while(guess!=theNumber) {
				System.out.print("Enter number: ");
				guess = Integer.parseInt(sc.nextLine());
				count++;
				int diff = guess-theNumber;
				if (diff==0) {
					System.out.println("WINNER!!!");
				}
			}
			
			
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
		}
	
	
	System.out.println("\nBye!");
	sc.close();
	}
	private static int promptInt(string prompt) {
		boolean isValid=false;
		int result = 0;
		while(!isValid) {
			System.out.println(prompt);
			if (sc.hasNextInt()) {
				result=Integer.parseInt(sc.nextLine());
				isValid=true;
			}
			else {
				System.err.println("Error - invalid entry.");
				sc.nextLine();
			}
		}
		return result;
	}
}

