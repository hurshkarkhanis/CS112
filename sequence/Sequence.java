import java.util.ArrayList;

public class Sequence
{
   private ArrayList<Integer> values;

   public Sequence()
   {
      values = new ArrayList<Integer>();
   }

   public void add(int n)
   {
      values.add(n);
   }

   public String toString()
   {
      return values.toString();
   }

   
   // MADE TWO FOR LOOPS TO LOOP THROUGH BOTH THE INSTANCE ARRAY LIST AND THE PAREMETER ARRAYLIST
   // ADDED ELEMENTS FROM ARRAYLISTS INTO AN OBJECT OF SEQUENCE CLASS
   // RETURNED SEQUENCE CLASS
   public Sequence append(Sequence other)
   {


   	Sequence out = new Sequence();
   	for(int i = 0 ; i <= values.size()-1 ; i++){
   		out.add(values.get(i));
   	}
   	for(int j = 0 ; j <= other.values.size()-1 ; j++){
   		out.add(other.values.get(j));
   	}

   	return out;

   }

   //FOUND INDEX OF BIGGER ARRAYLIST BETWEEN INSTANCE AND PAREMETER
   //PLANNED TO MAKE THAT INDEX THE "END POINT" OF THE FOR LOOP
   //PLAN TO USE THE % OPERATOR TO ALTERNATE AND PULL DATA FROM BOTH ARRAYLISTS AND PUT INTO AN OBJECT OF SEQUENCE CLASS
   //PLANNED TO RETURN SEQUENCE CLASS
   public Sequence merge(Sequence other){
   	Sequence out = new Sequence();

   	
   	int end;
   	System.out.println();
   	System.out.println();
   	if(values.size() > other.values.size()){
   		end = values.size();
   	}
   	if(values.size() < other.values.size() || values.size() == other.values.size()  ){
   		end = other.values.size();
   	}



   }


   //PLANED TO USE MERGE METHOD TO CREATE ONE BIG ARRAYLIST 
   //PLANNED TO LOOP THROUGH ARRAYLIST AND SWAP ELEMENTS ACCORDINGLY TO SORT THEM
   // PLANNED TO COMPARE "I-TH" ELEMENT WITH THE ONE NEXT TO IT, AND SWAP IF NECESSARY
   public Sequence mergeSorted(Sequence other){
	   Sequence out = new Sequence();
	   return out;
   }


   
   //PLANED TO LOOP THROUGH SEQUENCE USING DOUBLE FORLOOP TO TAKE ONE ELEMENT AND CHECK WHETHER IT IS 
   //REPEATED LATER ON IN THE ARRAYLIST
   //PLANNED TO USE ARRAYLIST.REMOVE() TO REMORE APPROPRIATE ELEMENTS
   public void removeDuplicates(){

   }









 

}