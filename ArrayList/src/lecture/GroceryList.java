package lecture;

import java.util.ArrayList;
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {

        groceryList.add(item);
    }


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }

    }
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");	// difference of counting system between computer and human
    }

//  public void removeGroceryItem(int position)
//  String theItem = groceryList.get(position);	-> retrieve the item, to tell people what item has actually been modified
//  groceryList.remove(position);	-> remove the item for us automatically at that position
// changed because :    	
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {		
//    	using the contains method 
//    	boolean exists = groceryList.contains(searchItem);
//		int position = groceryList.indexOf(SearchItem);
//    	if(position >= 0) 								-> if SearchItem isn't in the gorceryList then positin returns -1;
//    	{
//    		return groceryList.get(position);
//    	}
//    	return null;
//    	changed because : can provoke error of out of bounds exception when getting data, so to make input system not confusing, we should arrange back system accordingly.
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {
            return true;
        }

        return false;
    }
}
