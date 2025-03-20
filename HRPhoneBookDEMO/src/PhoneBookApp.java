import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookApp {
	public static void main(String[] argh) {
		String inputStr = ("3\nuncle sam\n99912222\ntom\n11122222\nharry\n12299933\nuncle sam\nuncle tom\nharry");
		Scanner in = new Scanner(inputStr);
		int n = in.nextInt();
		in.nextLine();
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			// add to phoneBook Map
			phoneBook.put(name, phone);

			in.nextLine();
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			String display = "Not found";
			if (phoneBook.containsKey(s)) {
				display = s + "=" + phoneBook.get(s);
			}
			System.out.println(display);

		}
	}
}
