import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
	System.out.println("Welcome to the Letter Grade Converter!~\n");
	// input from user 
	Scanner sc = new Scanner(System.in);
	String choice = "y";
	int numGrade=0;
	while (choice.equalsIgnoreCase("y")) {
		System.out.print("\nEnter numerical grade: ");
		numGrade = sc.nextInt();
		sc.nextLine();
		if (numGrade>=88) {
			System.out.println("Letter grade: A");
		}
		else if (numGrade>=80) {
			System.out.println("Letter grade: B");
		}
		else if (numGrade>=68) {
			System.out.println("Letter grade: C");
		}
		else if(numGrade>=60) {
			System.out.println("Letter grade: D");
		}
		else {
			System.out.println("Letter grade: F");
		}
		
		System.out.print("Continue? (y/n): ");
		choice = sc.nextLine();
	}
	System.out.println("\nBye!~");
	
	}

}
