package ui;

import model.Movie;
import util.MyConsole;

public class ClassesApp {
    public static void main(String[] args) {
        System.out.println("Welcome to classes!\n");

        // Create a Movie object with predefined values
        Movie m1 = new Movie(1, "Star Wars", 1977, "PG", "CC Saksith");
        System.out.println(m1.toString());

        // Prompt user for movie details
        int id = MyConsole.promptInt("ID: ");
        String title = MyConsole.promptString("Title: ");
        int year = MyConsole.promptInt("Year: ");
        String rating = MyConsole.promptString("Rating: ");
        String director = MyConsole.promptString("Director: ");

        // Create a new Movie object with user input
        Movie m2 = new Movie(id, title, year, rating, director);
        System.out.println(m2.toString()); // Print the details of the new movie

        System.out.println("\nBye");
    }
}