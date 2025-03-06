import java.util.Scanner;

public class TravelTimeCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator!~");
		Scanner sc = new Scanner(System.in);
		int miles = 0;
		int mph = 0;
		int hours = 0;
		int minutes = 0;
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles: ");
			miles = Integer.parseInt(sc.nextLine());
			System.out.print("Enter miles per hour: ");
			mph = Integer.parseInt(sc.nextLine());
			// calculate hours
			// miles/mph = 
			hours = miles/ mph;
			System.out.println("Hours: "+hours);
//			System.out.println("Estimated travel time");
//			System.out.println("---------------------");
		}

		System.out.println("Bye!~");
	}

}
