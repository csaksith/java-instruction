import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// if n is odd, print weird
		// if n is even between 2 and 5, print not weird
		// if n is even between 6 and 20, print weird
		// if n is even and greater than 20, print not weird
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % 2 != 0) {
				System.out.println("Weird");
				break;
			} else if (n % 2 == 0 && n >= 2 && n <= 5) {
				System.out.println("Not Weird");
				break;
			} else if (n % 2 == 0 && n >= 6 && n <= 20) {
				System.out.println("Weird");
				break;
			} else if (n % 2 == 0 && n > 20) {
				System.out.println("Not Weird");
				break;
			}
			sc.nextLine();
		}
	}

}
