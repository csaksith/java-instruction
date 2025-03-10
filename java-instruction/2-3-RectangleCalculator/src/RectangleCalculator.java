import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator!!~");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		double length = 0;
		double width = 0;
		double area = 0;
		double perimeter = 0;
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter length: ");
			length = Double.parseDouble(sc.nextLine());
			System.out.print("Enter width: ");
			width = Double.parseDouble(sc.nextLine());
			area = length * width;
			perimeter = (length * 2) + (width * 2);

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();

		}
		System.out.println("\nBye!!~");
	}

}
