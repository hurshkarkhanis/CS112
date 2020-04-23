import java.util.Scanner;

public class GameDriver{
	

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		TicTacToe board = new TicTacToe();

		

		System.out.println();
		System.out.println("======================");
		System.out.println("WELCOME TO TIC TAC TOE");
		System.out.println("======================");
		System.out.println();

		System.out.print("please enter player #1: ");
		String player1name = input.nextLine();
		Player player1 = new Player(player1name, 0, 0);


		System.out.print("please enter player #2: ");
		String player2name = input.nextLine();
		Player player2 = new Player(player2name, 0, 0);


		System.out.println();
		System.out.println("===========");
		System.out.println("EMPTY BOARD");
		System.out.println("===========");
		System.out.println();

		System.out.println(board);

		boolean gameOver = false;
		int clock = 0;

		

		while (!gameOver){
			if(clock % 2 == 0){
				System.out.print(player1name + ", please enter row: ");
				int row = input.nextInt();
				System.out.print(player1name + ", please enter column: ");
				int col = input.nextInt();
				if(board.legalMove(row, col)){
					board.makeMove(1,row,col);
					System.out.println();
					System.out.println("===========");
					System.out.println("NEW BOARD");
					System.out.println("===========");
					System.out.println();
					System.out.println(board);
					if(board.checkWin()){
						player1.numWins++;
						player2.numLosses++;
						System.out.println("CONGRATS " + player1name + ", YOU HAVE WON!");
						System.out.println("YOUR NEW RECORD IS " + player1.numWins + "-" + player1.numLosses);
						System.out.println();
						System.out.println(player2name + ", YOU HAVE LOST.");
						System.out.println("YOUR NEW RECORD IS " + player2.numWins + "-" + player2.numLosses);
						System.out.println();
						System.out.println("GAME OVER");
						System.out.println();
						gameOver = true;
					}
					if(board.checkTie()){
						System.out.println("TIE GAME");
						System.out.println();
						gameOver = true;
					}
					clock++;
				} else {
					System.out.println();
					System.out.println("ILLEGAL MOVE...TRY AGAIN");
					System.out.println("ROWS AND COLUMNS CAN ONLY BE NUMBERED 1, 2 OR 3");
					System.out.println();
				}
			} else{
				if(clock % 2 != 0){
				System.out.print(player2name + ", please enter row: ");
				int row = input.nextInt();
				System.out.print(player2name + ", please enter column: ");
				int col = input.nextInt();
				if(board.legalMove(row, col)){
					board.makeMove(2,row,col);
					System.out.println();
					System.out.println("===========");
					System.out.println("NEW BOARD");
					System.out.println("===========");
					System.out.println();
					System.out.println(board);
					if(board.checkWin()){
						player2.numWins++;
						player1.numLosses++;
						System.out.println("CONGRATS " + player2name + ", YOU HAVE WON!");
						System.out.println("YOUR NEW RECORD IS " + player2.numWins + "-" + player2.numLosses);
						System.out.println();
						System.out.println(player1name + ", YOU HAVE LOST.");
						System.out.println("YOUR NEW RECORD IS " + player1.numWins + "-" + player1.numLosses);
						System.out.println();
						System.out.println("GAME OVER");
						System.out.println();
						gameOver = true;
					}
					if(board.checkTie()){
						System.out.println("TIE GAME");
						System.out.println();
						gameOver = true;
					}
					clock++;
				} else {
					System.out.println();
					System.out.println("ILLEGAL MOVE...TRY AGAIN");
					System.out.println("ROWS AND COLUMNS CAN ONLY BE NUMBERED 1, 2 OR 3");
					System.out.println();
				}
			}
			
		}
	}
}
}

			