import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.HangmanWords;
import util.MyConsole;

public class HangmanApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		MyConsole.printHeader("Welcome to Hangman~", "-");
		MyConsole.println("Try to guess the word before hangman is fully drawn!");
		while (choice.equalsIgnoreCase("y")) {
			// reset variables for new game
			HangmanWords hangmanWords = new HangmanWords();
			int incorrectGuesses = 0;
			boolean wordGuessed = false;
			List<String> lettersGuessed = new ArrayList<>();

			MyConsole.println("DEBUG*: " + hangmanWords.getActualWord());
			MyConsole.println(hangmanWords.getHiddenWord());

			// main game loop
			while (incorrectGuesses < 6 && !wordGuessed) {
				String letterGuess = MyConsole.promptString("Guess a letter~: ");
				// prevent duplicate guesses
				if (lettersGuessed.contains(letterGuess)) {
					MyConsole.println("You already guessed this letter. Try again!");
					continue;
				}
				lettersGuessed.add(letterGuess);

				// check if guessed letter is in actual word and update hidden word
				if (hangmanWords.getActualWord().contains(letterGuess)) {
					hangmanWords.updateHiddenWord(letterGuess);
				} else {
					incorrectGuesses++;
					MyConsole.println("Incorrect guess! " + (6 - incorrectGuesses) + "/6 mistakes remaining");
					MyConsole.println(hangmanWords.getHangmanImage(incorrectGuesses));
				}

				// check if word is fully guessed
				if (!hangmanWords.getHiddenWord().contains("_")) {
					wordGuessed = true;
				}
			}
			// end of game message
			if (wordGuessed) {
				MyConsole.println("Congrats! You guessed the word: " + hangmanWords.getActualWord() + " correctly!");
			} else {
				MyConsole.println("Yikes.. you didn't guess the word: " + hangmanWords.getActualWord() + ".");
				MyConsole.println(hangmanWords.getHangmanImage(incorrectGuesses));
			}

			choice = MyConsole.promptReqString("Continue? (y/n): ", "y", "n");
		}
		sc.close();
		MyConsole.println("\nGoodbye!");

	}
}
