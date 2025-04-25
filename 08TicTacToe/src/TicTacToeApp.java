import util.MyConsole;

public class TicTacToeApp {
// pg 245
	
	static String boardBorder="+---+---+---+";
	
	static String[][] board = { { " ", " ", " " }, 
			{ " ", " ", " " }, 
			{ " ", " ", " " } };
	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Tic Tac Toe!", "=");
		MyConsole.println();
		boolean winner = false;
		while(!winner) {
			// alternate between x and o
			displayBoard();
			// get user entry (position on board)
			// place x/o on board
			// simulation
			// x - position 1,1
			board[1][1]="X";
			displayBoard();
			// o - 0,2
			board[0][2]="X";
			displayBoard();
			// x - 0,0 
			board[0][0]="X";
			displayBoard();
			// o - 1,2
			board[1][2]="O";
			displayBoard();

			break;
		}

		
		MyConsole.println("\nbye!");
	}
private static void displayBoard() {
	String boardString = boardBorder + "\n";

	// loop through the rows
	for (int r = 0; r < board.length; r++) {
		// loop through the columns
		boardString +="|";
		for (int c = 0; c < board[r].length; c++) {
			boardString+=" "+(board[r][c])+" |";
		}
		boardString +="\n"+boardBorder+"\n";
	}
	MyConsole.println(boardString);
}
}
