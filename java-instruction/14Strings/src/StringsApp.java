import util.MyConsole;

public class StringsApp {
	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Strings!");

		// pg 469 index, length, charAt
		String fullName = "Joseph Allen Hawes";
		// first, middle, last name
		int firstSpaceIdx = fullName.indexOf(' ');
		MyConsole.println("firstSpaceIdx = " + firstSpaceIdx);
		int secondSpaceIdx = fullName.indexOf(' ', (firstSpaceIdx + 1));
		MyConsole.println("secondSpaceIdx = " + secondSpaceIdx);

		// pg 471
		String firstName = fullName.substring(0, firstSpaceIdx);
		MyConsole.println("First Name: " + firstName);
		String middleName = fullName.substring(firstSpaceIdx + 1, secondSpaceIdx);
		MyConsole.println("Middle Name: " + middleName);
		String lastName = fullName.substring(secondSpaceIdx + 1);
		MyConsole.println("Last Name: " + lastName);

		// hangman hint - hidden word
		String theWord = "happyhour";
		String hiddenWord = "_".repeat(theWord.length());
		MyConsole.println("The word = " + theWord + ".");
		MyConsole.println("Hidden word = " + hiddenWord + ".");

		MyConsole.printHeader("Resolve Letters!");
		// loop until all letters guessed
		while (hiddenWord.indexOf('_') >= 0) { // Change > 0 to >= 0 to include the case when there are no underscores
			displayHiddenWord(hiddenWord);
			// guess a letter
			String guess = MyConsole.promptString("Letter guess: ");

			// resolve letter in hiddenWord OR display message incorrectGuess
			char[] chars = theWord.toCharArray();
			char[] hiddenChars = hiddenWord.toCharArray();

			if (theWord.indexOf(guess.charAt(0)) == -1) {
				MyConsole.println("Incorrect guess");
			} else {
				for (int i = 0; i < chars.length; i++) {
					if (guess.charAt(0) == chars[i]) {
						hiddenChars[i] = guess.charAt(0);
					}
				}
				hiddenWord = String.valueOf(hiddenChars); // Update hiddenWord with the new characters
			}
		}
	}

	private static void displayHiddenWord(String hiddenWord) {
		// display hiddenWord with spaces
		String hiddenWordDisplay = "";
		char[] chars = hiddenWord.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			hiddenWordDisplay += chars[i] + " ";
		}
		MyConsole.println("hidden word display = " + hiddenWordDisplay + ".");
	}
}