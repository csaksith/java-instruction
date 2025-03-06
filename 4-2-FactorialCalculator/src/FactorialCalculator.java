import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator!");
		Scanner sc = new Scanner(System.in);
		
		int integer = 0;
		long factorial = 1;
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer that's greater than 0 and less than 10: ");
			integer = sc.nextInt();
			sc.nextLine();
			
			for (int i = 1;i<=integer;i++) {
				factorial*=i;
			}
			System.out.println("The factorial of "+integer+" is "+ factorial);
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
		}
	
		System.out.println("Bye!");
	}

}
