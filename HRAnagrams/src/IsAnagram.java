import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class IsAnagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	private static boolean isAnagram(String a, String b) {
		char[] aArray = a.toLowerCase().toCharArray();
		char[] bArray = b.toLowerCase().toCharArray();
		Arrays.sort(aArray);
		Arrays.sort(bArray);
		return Arrays.equals(aArray,bArray);
	}
}

