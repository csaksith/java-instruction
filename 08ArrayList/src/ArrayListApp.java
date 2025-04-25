import java.util.ArrayList;
import java.util.List;

import util.MyConsole;

public class ArrayListApp {

	public static void main(String[] args) {
		MyConsole.println("Welcome to the Array List!");
// list is an interface, so you cannot instantiate list, need to do Array
// polymorphism
		List<String> names = new ArrayList<>();
		names.add("Celina");
		names.add("Jim");
		names.add("Andy");
		names.add("Adrian");
		names.add("Heath");
		names.add("Joe");
		names.add("Christian");
		names.add("Nick");

		names.add("Test");
		names.forEach(n -> MyConsole.print(n + " "));

		MyConsole.println();

		MyConsole.println(names.get(4));
		names.add(4, "Temp");
		names.forEach(n->MyConsole.print(n+" "));
		MyConsole.println();

		
		names.remove("Test");
		names.remove(4);
		names.forEach(n->MyConsole.print(n+" "));

		MyConsole.println("\nGoodbye!");
	}

}
