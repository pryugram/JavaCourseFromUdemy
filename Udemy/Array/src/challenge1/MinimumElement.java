package challenge1;

import java.util.Scanner;

public class MinimumElement {
	
	private static Scanner sc = new Scanner(System.in);
	
	
	private static int readInteger() {
		System.out.print("input the counts of array : ");
		int count = Integer.parseInt(sc.nextLine());
		return count;
	}
	
	private static int[] readElements(int count) {
		
		int[] array = new int [count];
				
		for(int i = 0; i < array.length; i++) 
		{
			System.out.print("input the elements of array : ");
			array[i] = Integer.parseInt(sc.nextLine());
		}
		return array;
	}
	
	private static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		System.out.print("array : ");
		for(int i = 0; i < array.length; i++ )
		{
			if(array[i] < min)
			{
				min = array[i];
			}
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		return min;
	}
	
	
	public static void main(String[] args) {
		int[] returnedArray = readElements(readInteger());
		int returnedMin = findMin(returnedArray);
		
		System.out.println("Minimum Value = " + returnedMin);
	}

}
