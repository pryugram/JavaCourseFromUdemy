package lecture;

import java.util.ArrayList;

class IntClass {
	private int myValue;

	public IntClass(int myValue) {
		this.myValue = myValue;
	}
	public int getMyValue() {
		return myValue;
	}
	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
}
//messy and uncomfortable so Java provides us autoboxing

public class Autoboxing {
	public static void main(String[] args) {
		String[] strArray = new String[10];
		int[] intArray = new int[10];
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("Tim");
		
//		ArrayList<int> intArrayList = new ArrayList<int>();		need reference class as type argument to save something to an arrayList
		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		intClassArrayList.add(new IntClass(54));
		
		//autoboxing
		Integer integer = new Integer(54);
		Double doubleValue = new Double(12.25);
		
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for(int i = 0; i <= 10; i++)
		{
			intArrayList.add(Integer.valueOf(i));
		}
		for(int i = 0; i <= 10; i++)
		{
			System.out.println(i + " --> " + intArrayList.get(i).intValue());
		}
		
		
//		Autoboxing -> Primitive to Wrapper
//		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
//		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally
		
//		Unboxing -> Wrapper to Primitive
//		int i=a.intValue();//converting Integer to int explicitly  
//		int j=a;//unboxing, now compiler will write a.intValue() internally   
		
		Integer myIntValue = 56;	//Integer myIntValue = Integer.valueOf(56)	Autoboxing
		int myInt = myIntValue;		//int myInt = myInt.intValue();		Unboxing
		
		ArrayList<Double> myDoubleValues = new ArrayList<Double>();
		for(double dbl = 0.0; dbl <= 10.0; dbl+= 0.5)
		{
				myDoubleValues.add(Double.valueOf(dbl));		//autoboxing	primitive : dbl, Wrapper : Double
		}
		
		for(int i = 0; i < myDoubleValues.size(); i++)
		{
			double value = myDoubleValues.get(i).doubleValue();		//unboxing		Wrapper : myDoubleValues	primitive : value
			System.out.println(i + " --> " + value);
		}
		
		
	}

}
