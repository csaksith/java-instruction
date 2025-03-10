import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes Table!~\n");
		Scanner sc = new Scanner(System.in);
		int integer = 0;
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter an integer: ");
			integer = sc.nextInt();
			sc.nextLine();
			System.out.printf("\n%-6s %-7s %-5s\n", "Number", "Squared", "Cubed");
            System.out.printf("%-6s %-7s %-5s\n", "======", "=======", "=====");
			for(int i = 0; i<=integer;i++) {
				int square = i*i;
				int cubed = i*i*i;
                System.out.printf("%-6d %-7d %-5d\n", i, square, cubed);
			}	
			System.out.println("\nContinue? (y/n): ");
			choice = sc.nextLine();
		}
		
		
	}

}
