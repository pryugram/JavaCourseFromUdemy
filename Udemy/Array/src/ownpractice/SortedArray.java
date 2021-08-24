package ownpractice;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
	
	Scanner sc = new Scanner(System.in);
	
	public int getCapcity() {
		
		System.out.print("Input the capacity of the array : ");
		int capacity = Integer.parseInt(sc.nextLine());
		return capacity;
		
	}
	
	public int[] getIntegers(int capacity) {
		
		int [] array = new int[capacity];
		
		for(int i = 0; i <array.length; i++)
		{
			System.out.print("input the elements : ");
			array[i] = Integer.parseInt(sc.nextLine());
		}
		return array;
	}
	
	public int[] printArray(int[] array) {

		for(int i = 0; i < array.length; i++)
		{
			System.out.println("Element " + i + " content " + array[i]);
		}
		
		return array;
		
	}

	public int[] sortIntegers(int[] array) {
		

		
		int[] sortedArray = Arrays.copyOf(array, array.length);
		int temp;
		boolean flag = true;
		
		while(flag)
		{
			flag = false;
			for(int i = 0; i < sortedArray.length - 1; i++)
			{
				if(sortedArray[i] < sortedArray[i+1])
				{
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag =true;
				}
				
			}
		}
		return sortedArray;
	}
	
	public static void main(String[] args) {
		
		SortedArray sa = new SortedArray();
		
		int[] myIntegers = sa.getIntegers(sa.getCapcity());
		int[] sorted = sa.sortIntegers(myIntegers);
		sa.printArray(sorted);
		
	}
	
}
