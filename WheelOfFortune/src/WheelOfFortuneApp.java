import java.util.Random;

import util.MyConsole;

public class WheelOfFortuneApp {

	public static void main(String[] args) {
		String word = "MISHA";
		// storing the maskedword
		char[] maskedWord = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				maskedWord[i] = ' ';
			} else {
				maskedWord[i] = '_';
			}
		}
		MyConsole.println("Guess the word!: ");
		MyConsole.println(String.valueOf(maskedWord).replace("", " ").trim());

		int playerBank = 0;

		String[] wheel = { "Bankrupt", "Lose a Turn", "$100", "$150", "$200", "$250", "$300", "$350", "$400", "$450",
				"$500", "$550", "$600", "$650", "$700", "$750", "$800", "$850", "$900" };
		Random random = new Random();
		// track if word is solved
		boolean solved = false;

		while (!solved) {
			// player chooses to spin the wheel, buy a vowel or solve the word
			String action = MyConsole.promptString(
					"\nChoose an action: \n1. Spin the wheel\n2. Buy a vowel\n3. Solve the word\nEnter 1, 2, or 3: ");

			if (action.equals("1")) {
				// player spins the wheel
				int spin = random.nextInt(wheel.length);
				MyConsole.println("You spun: " + wheel[spin]);

				// if bankrupt -> set player bank to 0
				if (wheel[spin].equals("Bankrupt")) {
					playerBank = 0;
					MyConsole.println("\nYou are now Bankrupt!");
					continue;
				} else if (wheel[spin].equals("Lose a Turn")) {
					MyConsole.println("Lose a turn!");
					continue;
				}

				// convert value from wheel to integer
				int spinValue = Integer.parseInt(wheel[spin].replace("$", ""));

				// if value is not bankrupt or lose a turn -> prompt player for a letter
				String guessedLetter = MyConsole.promptString("\nEnter a consonant: ").toUpperCase();

				// data validation for user to input a single letter
				if (guessedLetter.length() != 1) {
					MyConsole.println("\nInvalid input - Please enter a single letter!");
					continue;
				} else if (!"BCDFGHJKLMNPQRSTVWXYZ".contains(guessedLetter)) {
					MyConsole.println("\nInvalid input - Please enter a consonant!");
					continue;
				}

				// initialize variables
				char guess = guessedLetter.charAt(0);
				boolean correct = false;
				int occurrences = 0;

				// if letter is in the word -> reveal the letter in the masked word
				for (int i = 0; i < word.length(); i++) {
					if (word.charAt(i) == guess) {
						maskedWord[i] = guess;
						playerBank += spinValue * occurrences;
						correct = true;
						occurrences++;
					}
				}

				if (correct) {
					int earnings = spinValue * occurrences;
					playerBank += earnings;
					MyConsole.println("\nCorrect! You earned $" + earnings);
				} else {
					MyConsole.println("\nIncorrect! Try again!");
				}
			}
			// buy a vowel for $250
			else if (action.equals("2")) {
				if (playerBank < 250) {
					MyConsole.println("\nYou don't have enough money to a buy a vowel!");
					continue;
				}
				String guessedLetter = MyConsole.promptString("Enter a vowel: ").toUpperCase();
				// data validation for user to enter a single letter or vowel
				if (guessedLetter.length() != 1) {
					MyConsole.println("Invalid input - Please enter a single letter!");
					continue;
				} else if (!"AEIOU".contains(guessedLetter)) {
					MyConsole.println("Invalid input - Please enter a vowel!");
					continue;
				}
				char vowel = guessedLetter.charAt(0);
				boolean correct = false;
				playerBank -= 250;
				// check if vowel is in the word
				for (int i = 0; i < word.length(); i++) {
					if (word.charAt(i) == vowel) {
						maskedWord[i] = vowel;
						correct = true;
						MyConsole.print("Correct!");
					}
				}
				if (!correct) {
					MyConsole.println("Incorrect, no match for vowel " + guessedLetter);
				}
			} else if (action.equals("3")) {
				String guess = MyConsole.promptString("Guess the word: ").toUpperCase();
				if (guess.equals(word)) {
					MyConsole.println("Congratulations! You guessed the word " + word + " correctly!");
					MyConsole.println("Final bank amount: " + playerBank);
					solved = true;
					return;
				} else {
					MyConsole.println("Incorrect guess! Try again.");
				}
			}
			// check if word is fully revealed
			if (String.valueOf(maskedWord).equals(word)) {
				MyConsole.println("Congratulations! You solved the puzzle: " + word);
				MyConsole.println("Final bank amount: " + playerBank);
				return;
			}
			MyConsole.println("Updated word: " + String.valueOf(maskedWord).replace("", " ").trim());
			MyConsole.println("You currently have: $" + playerBank);
		}
	}
}
