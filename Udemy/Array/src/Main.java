import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int myIntValue = 10;				
		int anotherIntValue = myIntValue;		//pointing the memory address
		
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue);
		
		anotherIntValue++;
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue);
		
		int[] myIntArray = new int[5];			// one object with one reference
		int[] anotherIntArray = myIntArray;		// another reference
		
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));
		
		anotherIntArray[0] = 1;
		System.out.println("after myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("after anotherIntArray = " + Arrays.toString(anotherIntArray));
		//because two references are pointing same address, anotherIntArray changed the value to both.
		
		anotherIntArray = new int[] {4,5,6,7,8};		// dereferencing
		modify(myIntArray);
		System.out.println("modify myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("modify anotherIntArray = " + Arrays.toString(anotherIntArray));
		
		
		
	}
	
	public static void modify(int[] array) {
		array[0] = 2;
		array = new int [] {1,2,3,4,5};	//new object, it doesn't change the reference of the original
										// dereferencing
	}
		

	
	
	
}
