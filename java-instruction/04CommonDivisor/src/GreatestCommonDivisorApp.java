import java.util.Scanner;

public class GreatestCommonDivisorApp {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder!~");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			// prompt 2 #'s x and y
			// x=12, y=8
			System.out.print("Enter x: ");
			int x = Integer.parseInt(sc.nextLine());
			System.out.print("Enter y: ");
			int y = Integer.parseInt(sc.nextLine());

			// compute greatest common divisor
			while (x != 0) {
				while (y >= x) {
					y -= x;
				}
				// need placeholder to values x and y when swapping
				int hold = y;
				y = x;
				x = hold;
			}
			// print GCD
			System.out.println("\nGreatest Common Divisor: " + y);

			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
		}

		System.out.println("Bye!!");
	}

}
