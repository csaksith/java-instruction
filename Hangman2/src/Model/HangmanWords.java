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
		words.add("pizza");
		words.add("burger");
		words.add("pasta");
		words.add("ramen");

		// get random word for game
		this.word = words.get(new Random().nextInt(words.size()));
		
		// initialize hidden word with underscores
		this.hiddenArray = new char[word.length()];
		for(int i = 0; i<word.length();i++) {
			hiddenArray[i]='_';
		}
	}

	// method to get actual word
	public String getActualWord() {
		return word;
	}
	
	// method to get hidden word
	public String getHiddenWord() {
		return String.valueOf(hiddenArray).replaceAll("", " ").trim();
	}
	// method to update hidden word
	public void updateHiddenWord(String guess) {
		boolean found = false;
		
		for(int i = 0; i<word.length();i++) {
			if(word.charAt(i)==guess.charAt(0)) {
				hiddenArray[i]=guess.charAt(0);
				found=true;
			}
		}
		if(found) {
			MyConsole.println("Correct!! Updated word: "+getHiddenWord());
		}
		else {
			MyConsole.println("Incorrect guess!! Try again!");
		}
	}


	// method to get hangman image
	public static String getHangmanImage(int incorrectGuesses) {
		String hangmanStages[] = new String[] {
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
						|   O
						|
						|
						|
						-------
						""",
				// stage 2
				"""
						-----
						|   |
						|   O
						|   |
						|
						|
						-------
						""",
				// stage 3
				"""
						-----
						|   |
						|   O
						|  /|
						|
						|
						-------
						""",
				// stage 4
				"""
						-----
						|   |
						|   O
						|  /|\\
						|
						|
						-------
						""",
				// stage 5
				"""
						-----
						|   |
						|   O
						|  /|\\
						|  /
						|
						-------
						""",
				// stage 6
				"""
						-----
						|   |
						|   O
						|  /|\\
						|  / \\
						|
						-------
						""" };

		return hangmanStages[incorrectGuesses];
	}
}
