public class DrawTriangle{



	public static void main (String[] args){

		int size = Integer.parseInt(args[0]);

		DrawTriangle t = new DrawTriangle();
		t.drawIt(size);

	}



	public void drawIt(int levels){
			for(int i = 0; i <=levels-1; i++){
				for(int j = levels-i; j <=levels; j++){
				System.out.print("[]");
				}
			System.out.println();
		}
	}
}