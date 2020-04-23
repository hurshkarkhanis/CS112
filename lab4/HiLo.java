import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class HiLo{

	public static void main(String[] args){

		Random r = new Random();
		int randomInt = r.nextInt(100) + 1;

		String comparison;
		
		Scanner s = new Scanner(System.in);
		HiLo h = new HiLo();

		System.out.println();
		System.out.println("###############################");
		System.out.println("RANDOM NUMBER HAS BEEN SELECTED");
		System.out.println("###############################");
		System.out.println();



		for(int guessCount = 1 ; guessCount < 6; guessCount++){
		
			System.out.print("GUESS " + guessCount + "/5 : ");

			int userGuess = s.nextInt();
			System.out.println();
			comparison = h.highLowEqual(userGuess, randomInt);

			if(h.promptStatus(comparison).equals("YOU ARE CORRECT! GREAT JOB.")){
				guessCount = 5;
				System.out.println("YOU ARE CORRECT! GREAT JOB.");
				break;
			} else{
				System.out.println(h.promptStatus(comparison));
				System.out.println();
			}

			if(guessCount==5){
				System.out.println();
				System.out.println("THE CORRECT ANSWER WAS " + randomInt);
				System.out.println("NUMBER OF GUESSES: " + guessCount);
				System.out.println();
				System.out.println();
				System.out.println("THANK YOU FOR PLAYING.");
				System.out.println();
				System.out.print("PRESS 1 TO PLAY AGAIN | PRESS 0 TO QUIT: ");
				int exit = s.nextInt();
				if(exit == 1){
					guessCount = 0;
					randomInt = r.nextInt(100) + 1;
				} else {
					//do nothing
				}
			} else{
				//do nothing
			}
		}


	}

	public String highLowEqual(int guess, int answer){
		String out = "";
		if(guess > answer){
			out = "HIGH";
		} else if (guess < answer) {
			out = "LOW";
		} else{
			out = "EQUAL";
		}
		return out;
	}


	public String promptStatus(String indicate){
		String out = "";
		if(indicate.equals("HIGH")){
			out = "GUESS IS TOO HIGH...TRY AGAIN";
		} else if (indicate.equals("LOW")) {
			out = "GUESS IS TOO LOW...TRY AGAIN";
		} else if (indicate.equals("EQUAL")) {
			out = "YOU ARE CORRECT! GREAT JOB.";
		}

		return out;
	}
}
	
	








	
