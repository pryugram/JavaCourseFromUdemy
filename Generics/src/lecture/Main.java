package lecture;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
//		ArrayList items = new ArrayList();	raw type of ArrayList
		ArrayList<Integer> items = new ArrayList<Integer>();
		items.add(1);			// autoboxing : primitive to Wrapper
		items.add(2);
		items.add(3);
//		items.add("tim");	// valid when using a raw type of Array list 
//		but we got an class cast exception : from String to an Integer	-> cannot be converted
		
		
//		items.add("tim");	// invalid , not just implies warning, it is error
		items.add(4);
		items.add(5);
		
		printDoubled(items);
		
	}
//	private static void printDoubled(ArrayList n){
//		before specifying the type of data : raw type of ArrayList
//		for(Object i : n)
////			raw type
//		{
//			System.out.println( (Integer)i * 2);
////			reason to cast : we didn't specify what the object was above
//		}
		
		
		
//		generic type
	private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) 
        {
            System.out.println( i * 2);
        }
		
	}

}



// a parameterized type : provide a type parameter to a generic type
