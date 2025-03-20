import java.util.*;
import java.io.*;

public class PhoneBookMap {
	public static void main(String[] argh) {
		String inputStr = ("3\nuncle sam\n99912222\ntom\n11122222\nharry\n12299933\nuncle sam\nuncle tom\nharry");
		Scanner in = new Scanner(inputStr);
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			phoneBook.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if (phoneBook.containsKey(s)) {
				System.out.println(s+"="+phoneBook.get(s));
			} 
			else {
				System.out.println("Not found");
			}

		}
	}
}
