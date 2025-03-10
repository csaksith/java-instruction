import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hangman.HangmanWords;
import hangman.MyConsole;

public class HangmanApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Hangman~~");
		MyConsole.println();
		MyConsole.println("Try to guess the word before the hangman is fully drawn!");
		MyConsole.println("Da Rules: You can guess one letter at a time. Each incorrect guess adds to the hangman!");
		Scanner sc = new Scanner(System.in);
		
		// create hangmanWords object
		HangmanWords hangmanWords = new HangmanWords();
		
		// get random word
		String randomWord = hangmanWords.getRandomWord();
		
		// convert to hidden word
		String hiddenWord = hangmanWords.getHiddenWord(randomWord);
		
		String choice = "y";
		int incorrectGuesses= 0;
		boolean wordGuessed=false;
		// track guessed letters
		List<String> lettersGuessed = new ArrayList<>();
		
		// main hangman game
		
		while(choice.equalsIgnoreCase("y")) {
		
			hangmanWords.getHangmanImage(incorrectGuesses);
			
			// display hidden word
			MyConsole.println("DEBUG: revealed word: "+randomWord);
			MyConsole.println("hidden word: "+hiddenWord);
			MyConsole.println("guessed letters: "+ lettersGuessed);
			
			// prompt user to guess letter
			String letterGussed = MyConsole.promptString("\nGuess a letter, choose wisely!: ").toLowerCase();
		
		choice = MyConsole.promptReqString("Continue? (y/n): ", "y", "n");
		}
		MyConsole.println("Bye!");
	}

	
}
