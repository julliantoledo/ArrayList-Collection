//Generic ArrayList<E> collection demonstration.
package arraylistcollection;
import java.util.ArrayList;
/**
 *
 * @author julliantoledo
 */
public class ArrayListCollection
{
    public static void main(String[] args) 
    {
        //Create a new ArrayList of Strings with an initial capacity of 10
	ArrayList<Integer> items = new ArrayList<Integer>();
		
        items.add(56);      //Append an item to the list.
        items.add(0, 98);   //Insert "98" at index 0.   

        //Display contents of items..
        display(items, "List contents:");

        items.add(77);      //Add "77" to the end of the list.
        items.add(48); 
        //get returns element at specified index.
        items.add(items.get(0)+items.get(1));   
        display(items, "List with three new elements:");
	
        
	items.remove(1);    //Remove item at index 1.
        display(items, "Remove second element (56).");

	//Check if a value is in the list.
        System.out.printf("\"98\" is %sin ArrayList \"items\". %n", 
                items.contains(98) ? "": "not ");
            
        //Display number of elemts in the List.
        System.out.printf("Array size: %s%n", items.size());

        System.exit(0);
    }
    //Display the ArrayList’s elements on the console.
    public static void display(ArrayList<Integer> items, String header)
    {
	System.out.printf(header);	//Display header.

	for (int item : items)
            System.out.printf(" %d", item);
        System.out.print(".\n");
    }
}