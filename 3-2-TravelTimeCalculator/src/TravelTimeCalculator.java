import java.util.Scanner;

import util.MyConsole;

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
			double totalHours = (double)miles/mph;
			hours = (int)totalHours;
			double min=totalHours-hours;
			minutes=(int)(min*60);
//			MyConsole.println("minutes decimal: "+min);
			MyConsole.printHeader("Estimated travel time","-");
			MyConsole.println("Hours: "+hours);
			MyConsole.println("Minutes: "+minutes);
			choice =MyConsole.promptString("Continue? (y/n): ");
		}

		MyConsole.println("\nBye!~");
	}

}
