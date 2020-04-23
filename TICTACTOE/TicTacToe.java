import java.util.*;

public class TicTacToe{
	int[][] board;

	public TicTacToe(){
		board = new int[3][3];
		
	}


	public void makeMove(int playerNumber, int across, int down){
		int row = across-1;
		int col = down -1;
		board[row][col] = playerNumber;
	}

	public boolean legalMove(int across, int down){
		int row = across-1;
		int col = down -1;
		if(row >= 0 && row <=2 && col >= 0 && col <=2 && board[row][col] == 0){
			return true;
		}

		return false;

	}

	public boolean checkWin(){
		if(winningRow() || winningCol() || winningDiagonal()){
			return true;
		}

		return false;
	}

 	public boolean winningRow(){
		for (int i = 0; i <= board.length-1; i++){
 				if( (board[i][0] == 1 && board[i][1] == 1 && board[i][2] == 1) || 
 					(board[i][0] == 2 && board[i][1] == 2 && board[i][2] == 2) ){

 					return true;
 				}
 			}

 		return false;
 	}

 	public boolean winningCol(){
 		for (int j = 0; j <= board[0].length-1; j++){
 				if( (board[0][j] == 1 && board[1][j] == 1 && board[2][j] == 1) || 
 					(board[0][j] == 2 && board[1][j] == 2 && board[2][j] == 2) ){

 					return true;
 				}
 			}

 		return false;
 	}

 	public boolean winningDiagonal(){
 		int i = 0;
 		int j = 0;
		if( (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) || 
			(board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 1) ||
			(board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) || 
			(board[2][0] == 2 && board[1][1] == 2 && board[0][2] == 2)){
					return true;
			}
				return false;
	}


	public boolean checkTie(){

		for (int i = 0; i <= board.length-1; i++){
			for (int j = 0; j <= board[0].length-1; j++){
				if(board[i][j] == 0){
					return false;
				}
				if(checkWin()){
					return false;
				}
			}
		}

		return true;
	}

	/*
	public String toString()
	{
	   String output;
		output  = "Print out a board.\n";
		output += "[ ][ ][ ]\n";
		output += "[ ][ ][ ]\n";
		output += "[ ][ ][ ]\n";
		output += "but incorporate your data\n";
		return output;
	}
	*/


	
	public String toString(){
		String out = "";
	
		for (int[] row : board)
            out+=(Arrays.toString(row)) + "\n";
		return out;
	}
	

}





