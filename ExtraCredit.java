public class ExtraCredit{



	public static void main (String[] args){

		int size = Integer.parseInt(args[0]);

		ExtraCredit t = new ExtraCredit();
		t.drawIt(size);
	}

	

	public void drawIt(int levels){
			for(int i = levels-1; i>=0; i--){
				for(int j = 0; j >=levels+i; j--){
				System.out.print("[]");
				}
			System.out.println();
		}
	}
}