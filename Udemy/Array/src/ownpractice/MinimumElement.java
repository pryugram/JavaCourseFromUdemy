package ownpractice;

import java.util.Scanner;

public class MinimumElement {
	
	Scanner sc = new Scanner(System.in);

	public int readInteger() {
		
		System.out.print("Input the capacity : ");
		int capacity = Integer.parseInt(sc.nextLine());
		
		return capacity;
	}
	
	public int[] readElements(int capacity) {
		
		int[] array = new int[capacity];
		
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("Input the elements : ");
			array[i] = Integer.parseInt(sc.nextLine());
		}
		
		return array;
	}
	
	public int findMin(int[] array) {
		
		int min = Integer.MAX_VALUE;
		
		System.out.print("array : ");
		for(int i = 0; i < array.length; i++)
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
		
		MinimumElement min = new MinimumElement();
		
		int[] returnedArray = min.readElements(min.readInteger());
		int returnedMin = min.findMin(returnedArray);
		System.out.println("Minimum Value = " + returnedMin);
	}
	
	
}
