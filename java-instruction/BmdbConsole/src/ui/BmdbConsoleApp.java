package ui;

import model.Movie;
import util.MyConsole;

public class BmdbConsoleApp {

	public static void main(String[] args) {
		MyConsole.promptString("Welcome to Bmdb Console~");

		int movieId = MyConsole.promptInt("Enter movieId: ");
		String title = MyConsole.promptString("Enter movie title: ");
		int year = MyConsole.promptInt("Enter movie year: ");
		String rating = MyConsole.promptString("Enter movie rating: ");
		String director = MyConsole.promptString("Enter movie director: ");
		// create new movie object using user input
		Movie m1 = new Movie(movieId, title, year, rating, director);
		MyConsole.promptString("Movie created: " + m1.toString());

		
	}

}
