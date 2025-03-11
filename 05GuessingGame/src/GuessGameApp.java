
import java.util.Random;
import java.util.Scanner;

import util.MyConsole;

public class GuessGameApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MyConsole.println("Welcome to the Guess the Number Game!~");
		MyConsole.println("++++++++++++++++++++++++++++++++++++++");
		MyConsole.println("\nI'm thinking of a number from 1 to 100.");
		MyConsole.println("Try to guess it.");
		int min = 1;
		int max = 100;
		int guess = 0;
		int count = 0;
		String choice = "y";
		Random rand = new Random();
		
		while (choice.equalsIgnoreCase("y")) {
			int theNumber = rand.nextInt(min,max);
			MyConsole.println("Debug*** the number is: "+theNumber);
			while(guess!=theNumber) {
				guess = MyConsole.promptInt("Guess the number: ", min, max);
				count++;
				int diff = guess-theNumber;
				
				if (diff==0) {
					MyConsole.println("WINNER!!!");
					if (count<=3) {
						MyConsole.println("Great work! You are a mathematical wizard.");
					}
					else if (count>3 && count<=7) {
						MyConsole.println("Not too bad! You've got some potential.");
					}
					else if (count>7) {
						MyConsole.println("What took you so long? Maybe you should take some lessons.");
					}
				}
				else if(diff >=10) {
					MyConsole.println("Way too high!! Try again!");
				}
				else if(diff <-10) {
					MyConsole.println("Way too low!! Try again!");
				}
				else if(diff<=5) {
					MyConsole.println("You are SO CLOSE!! Try again!");
				}
				else if(diff<0) {
					MyConsole.println("Too low! Try again!");
				}
				else if(diff>0) {
					MyConsole.println("Too high! Try again!");
				}
	
			}
			
			
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
		}
	
	System.out.println("\nBye!");
	sc.close();
	}

	private static int promptInt(String prompt) {
		boolean isValid = false;
		int result = 0;
		while (!isValid) {
			MyConsole.println(prompt);
			if (sc.hasNextInt()) {
				result = Integer.parseInt(sc.nextLine());
				isValid = true;
			} else {
				System.err.println("Error - invalid entry.");
				sc.nextLine();
			}
		}
		return result;
	}
}
