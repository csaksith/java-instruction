import java.util.Scanner;

import util.MyConsole;

public class TicTacToeApp {
	static String boardBorder="+---+---+---+";
	static String[][] board = {
			{" "," "," "},
			{" "," "," "},
			{" "," "," "}};
	static String currentPlayer = "X";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyConsole.printHeader("Welcome to Tic Tac Toe!", "+");
		MyConsole.println();
		boolean winner = false;
		while(!winner) {
			// display board
		}
		
		
		MyConsole.println("\nBye~");
		
	}

	public static void displayBoard() {
		String boardString=boardBorder+"\n";
		for (int i=0;i<board.length;i++) {
			boardString+="|";
		}
	}
	 
}
