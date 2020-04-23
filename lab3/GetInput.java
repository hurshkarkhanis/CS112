public class GetInput{

	public static void main (String[] args){

		int month = Integer.parseInt(args[0]);

		GetInput t = new GetInput();
		if(month <1 || month > 12){
			System.out.println("Sorry, invalid input. Goodbye!");
		} else{
			System.out.println("Hello, your month is in the " + t.season(month) + " season");
		}
	}


	public String season(int monthNumber){
		String season = "";
		if(monthNumber== 12 || monthNumber== 1 || monthNumber== 2){
			season = "winter";
		} else if(monthNumber== 3 || monthNumber== 4 || monthNumber== 5){
				season = "spring";
			} else if(monthNumber== 6 || monthNumber== 7 || monthNumber== 8){
				season = "summer";
			}
				else if(monthNumber== 9 || monthNumber== 10 || monthNumber== 11){
				season = "fall";
			}
			return season;
		}

		
	}
