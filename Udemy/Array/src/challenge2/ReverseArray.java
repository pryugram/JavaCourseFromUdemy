package challenge2;

import java.util.Arrays;

public class ReverseArray {
	
	private void reverse(int[] array) {
		
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		
		for(int i = 0; i < halfLength; i++) 
		{
			int temp = array[i];	//	first value = i
			array[i] = array[maxIndex - i];		// i changed to maxIndex - i
			array[maxIndex - i] = temp;			// maxIndex - i changed to i
		}
		
	}

	
	public static void main(String[] args) {
		
		int [] array = {1,5,3,7,11,9,15};
		System.out.println("Array = " + Arrays.toString(array));
		
		
	}
}
