package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import util.MyConsole;

public class HangmanWords {
	// instance variables
	private List<String> words;
	private String word;
	private char[] hiddenArray;

	// constructor to populate list of words
	public HangmanWords() {
		words = new ArrayList<>();
		words.add("sushi");
		words.add("sashimi");
		words.add("nigiri");
		words.add("nori");

		// get random word for game
		this.word = words.get(new Random().nextInt(words.size()));

		// initialize hidden word with underscores
		this.hiddenArray = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			hiddenArray[i] = '_';
		}
	}

	// get random word from list
	public String getRandomWord() {
		return word;
	}

	// hide word with underscores and spaces
	public String getHiddenWord() {
		return String.valueOf(hiddenArray).replaceAll("", " ").trim();
	}

	// display hidden word
	public void displayHiddenWord() {
		MyConsole.println("Word to Guess: " + getHiddenWord());
	}

	// method to update hidden word
	public void updateHiddenWord(String guess) {
		boolean found = false;
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				hiddenArray[i] = guess.charAt(0);
				found = true;
			}
		}
		if (found) {
			MyConsole.println("Correct!! Updated word: " + getHiddenWord());
		} else {
			MyConsole.println("Incorrect guess. Try again!");
		}
	}

	public String getActualWord() {
		return word;
	}

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
