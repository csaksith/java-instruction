import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the table of powers!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equals("y")) {
			System.out.println("Enter a number: ");
			int nbr = Integer.parseInt(sc.nextLine());

			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");
			for (int i = 1; i <= nbr; i++) {
				System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
			}
			System.out.println();
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
		}
		sc.close();
		System.out.println("Goodbye!~~");
	}

}
