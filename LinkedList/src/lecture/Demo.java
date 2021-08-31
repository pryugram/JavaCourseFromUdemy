package lecture;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		addInOrder(placesToVisit, "Sydney");
		addInOrder(placesToVisit, "Melbourne");
		addInOrder(placesToVisit, "Brisbane");
		addInOrder(placesToVisit, "Perth");
		addInOrder(placesToVisit, "Canberra");
		addInOrder(placesToVisit, "Adelaide");
		addInOrder(placesToVisit, "Darwin");
		printList(placesToVisit);
		
		addInOrder(placesToVisit, "Alice Springs");
		addInOrder(placesToVisit, "Darwin");	
//reason duplicated message comes out first is that it's based on the order 
//of code written in the method.
		
		printList(placesToVisit);
		visit(placesToVisit);
	
		//1st code
//		placesToVisit.add("Sydney");
//		placesToVisit.add("Melbourne");
//		placesToVisit.add("Brisbane");
//		placesToVisit.add("Perth");
//		placesToVisit.add("Canberra");
//		placesToVisit.add("Adelaide");
//		placesToVisit.add("Darwin");
		
//		printList(placesToVisit);	
		
//		placesToVisit.add(1, "Alice Springs");
//		printList(placesToVisit);	// Alice Springs automatically linking to Melbourne
		
//		placesToVisit.remove(4);		//index position 4 = element at fifth
//		printList(placesToVisit);	
		
		
		
// these mechanisms automatically make elements to link each other and 
//	this is faster than Array List even dealing with huge data.
		
	}
	
	private static void printList(LinkedList<String> linkedList) {		
//iterator : another way of accessing and going through all entries that are 
//in a particular array, arrayList, LinkedList;
		Iterator<String> i = linkedList.iterator();
		while(i.hasNext())				
//hasNext : is there another entry	.next : moving to the next entry and 
//	returning what the current value is before moving on
		{
			System.out.println("Now visiting " + i.next());
		}
		System.out.println("================================");
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringListIterator = linkedList.listIterator();		
		
		while(stringListIterator.hasNext())
		{
			int comparison = stringListIterator.next().compareTo(newCity);			
//need use stringListIterator.next to point to the first record, it doesn't 
//	automatically point to the first entry.
			if(comparison == 0) 
// 0 means current index from comparison is matching with parameter if equal, do not add
			{
				System.out.println(newCity + " is already included as a destination");
				return false;
			}
			else if(comparison > 0)
			{
//new City should appear before this one
// Brisbane -> Adelaide		: comparison would return a number greater than 0
				stringListIterator.previous();	
//current entry(Brisbane) should move back to the previous entry again 
				stringListIterator.add(newCity);
				return true;
			}
			else if(comparison < 0)
			{
				// move on to next city.
				// don't need any code
			}
			
		}
		stringListIterator.add(newCity);
		return true;
		
		//not a good idea : use a method that both returns a value and 
//		changes the object that it's called from
		// what is Tortoise and Hare Algorithm?
	}
	
	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;		// we need to do a test and set that direction
		ListIterator<String> listIterator = cities.listIterator();
		
		if(cities.isEmpty())
		{
			System.out.println("No cities in the itenerary");
			return;
		}
		else
		{
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		}
		
		while(!quit) 
		{
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action) 
			{
			case 0 : System.out.println("Holiday (Vacation) over"); quit = true; break;
			case 1 : 	// go to the next city
				if(!goingForward) 	//means user has previously selected going back.
				{
					if(listIterator.hasNext())
					{
						listIterator.next();
					}
					goingForward = true;
				}
				if(listIterator.hasNext()) 
				{
					System.out.println("Now visiting " + listIterator.next());
				}
				else
				{
					System.out.println("Reached the end of the list");
					goingForward = false;

				}
				break;
			case 2 :	// go to the previous city
				if(goingForward)	
				{
					if(listIterator.hasPrevious())
					{
						listIterator.previous();
					}
					goingForward = false;
				}
					
				if(listIterator.hasPrevious())
				{
					System.out.println("Now visiting " + listIterator.previous());
				}
				else
				{
					System.out.println("We are at the start of the list");
					goingForward = true;
				}
				break;
			case 3 :		//print menu option
				printMenu();
				break;
			}
		}
		
	}
	
	private static void printMenu() {
		System.out.println("Available actions: \npress ");
		System.out.println("0 - to quit\n" + "1 - go to next city\n" + "2 - go to previous city\n" + "3 - print menu options");
		
		
		
	}

}
