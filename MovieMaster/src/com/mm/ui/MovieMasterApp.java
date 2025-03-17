package com.mm.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mm.db.DAO;
import com.mm.db.MovieDBDAO;
import com.mm.db.MovieFileDAO;
import com.mm.db.MovieListDAO;
import com.mm.model.Movie;

import util.MyConsole;

public class MovieMasterApp {
//	private static DAO<Movie> movieDAO = new MovieFileDAO();
	private static DAO<Movie> movieDAO = new MovieDBDAO();
	private static List<String> ratings = new ArrayList<>(Arrays.asList("G","PG","PG-13","R","NC-17"));
	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Movie Master App~");
		String command = "";
		while(!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = MyConsole.promptString("Enter command: ");
			switch(command) {
				case "all":
					displayAllMovies();
					break;
				case "add":
					addMovie();
					break;
				case "del":
					deleteMovie();
					break;
				case "exit":
					break;
				default:
					MyConsole.println("Invalid command - Try again!");
					break;
					
			}
		}
		MyConsole.println("Bye!");
	}
	
private static void deleteMovie() {
	MyConsole.printHeader("Delete Movie: " , "+");		
	int id = MyConsole.promptInt("Movie Id: ");
	movieDAO.delete(id);
	MyConsole.println("Movie deleted!");
	}

private static void addMovie() {
	MyConsole.printHeader("Add Movie: " , "+");
	int id = MyConsole.promptInt("Movie Id: ");
	String title = MyConsole.promptString("Title: ");
	int year = MyConsole.promptInt("Year: ");
	String rating = MyConsole.promptString("Rating: ",ratings);
	String director = MyConsole.promptString("Director: ");

	movieDAO.add(new Movie(id,title,year,rating,director));
	MyConsole.println("Movie added!");

	}
private static void displayAllMovies() {
MyConsole.printHeader("Display Movies: " , "+");
movieDAO.getAll().forEach(movie ->MyConsole.println(movie.toString()));

//movieDAO.getAll().forEach(Movie::toString);
	}
private static void displayMenu() {
	MyConsole.println("Menu:");
	MyConsole.println("===================");
	MyConsole.println("all - Get All Movies");
	MyConsole.println("add - Add A Movie");
	MyConsole.println("del - Delete A Movie");
	MyConsole.println("exit");

}
}
