import util.MyConsole;

public class HangmanApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Hangman~", "-");

		String displayHangman[] = new String[] {
				// stage 0
				"-----\n" + "|   |\n" + "|\n" + "|\n" + "|\n" + "|\n" + "------\n",
				// stage 1
				"-----\n" + "|   |\n" + "|   O\n" + "|\n" + "|\n" + "|\n" + "------\n",
				// stage 2
				"-----\n" + "|   |\n" + "|   O\n" + "|  /\n" + "|\n" + "|\n" + "------\n",
				// stage 3
				"-----\n" + "|   |\n" + "|   O\n" + "|  /|\n" + "|\n" + "|\n" + "------\n",
				// stage 4
				"-----\n" + "|   |\n" + "|   O\n" + "|  /|\\\n" + "|\n" + "|\n" + "------\n",
				// stage 5
				"-----\n" + "|   |\n" + "|   O\n" + "|  /|\\\n" + "|  /\n" + "|\n" + "------\n",
				// 6 - you lose
				"-----\n" + "|   |\n" + "|   O\n" + "|  /|\\\n" + "|  / \\\n" + "|\n" + "------\n" };

		MyConsole.print(displayHangman[0]);
		MyConsole.println("\nGoodbye~");
	}

}
