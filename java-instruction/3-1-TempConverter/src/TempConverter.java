import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter!~");
		Scanner sc = new Scanner(System.in);
		double tempF=0;
		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter degrees in Fahrenheit: ");
			tempF=sc.nextDouble();
			sc.nextLine();
			double tempC = (tempF-32)*((double)5/9);
			System.out.println("Degrees in Celsius: "+tempC);
			
			
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
		}
		System.out.println("\nBye!~");
	}

}
