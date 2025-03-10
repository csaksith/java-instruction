package hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HangmanWords {
	// list to store words
	private List<String> words;
	// constructor to populate the list of words
	public HangmanWords() {
		words = new ArrayList<>();
		words.add("sushi");
		words.add("Udon");
		words.add("sashimi");
		words.add("tempura");
		words.add("nigiri");
	}
	
	// get random word from list
	public String getRandomWord() {
		// initializes random number generator
		Random rand = new Random();
		// generates random index and gets word at that index
		return words.get(rand.nextInt(words.size()));
	}
	
	public String getHiddenWord(String word) {
		return "_ ".repeat(word.length()).trim();
	}
	public void displayHiddenWord(String hiddenWord) {
		MyConsole.println("Word to Guess: "+hiddenWord);
	}
	// method to update hidden word
	public static String updateHiddenWord(String randomWord,String hiddenWord,String guess)
	{
	// method to get hangman image
		public static String getHangmanImage(int incorrectGuesses) {
			String[] hangmanStages = new String[] {
					// stage 0
					"""
							       -----
							       |   |
							       |
							       |
							       |
							       |
							       -------
							""",
					// stage 1
					"""
							       -----
							       |   |
							       |   0
							       |
							       |
							       |
							       -------
							""",
					// stage 2
					"""
							       -----
							       |   |
							       |   0
							       |  /
							       |
							       -------
							""",
					// stage 3
					"""
							       -----
							       |   |
							       |   0
							       |  /|
							       |
							       -------
							""",
					// stage 4
					"""
							       -----
							       |   |
							       |   0
							       |  /|\\
							       |
							       |
							       -------
							""",
					// stage 5
					"""
							       -----
							       |   |
							       |   0
							       |  /|\\
							       |  /
							       |
							       -------
							""",
					// stage 6
					"""
							       -----
							       |   |
							       |   0
							       |  /|\\
							       |  / \\
							       |
							       -------
							""" };

			return hangmanStages[incorrectGuesses];
		}
}
