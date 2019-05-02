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
		
        items.add(56);       //Append an item to the list.
        items.add(0, 98); //Insert "yellow" at index 0.   

        //Display colors using enhanced for statement.
        display(items, "List contents:");

        items.add(77);     //Add 77 to the end of the list.
        items.add(56);    //Add 345 to the end of the list.
        items.add(items.get(0)+items.get(1));
        display(items, "List with three new elements:");
	
        //items.remove(56); //Remove the first "yellow".
        //display(items, "Remove first instance of 56.");
        
	items.remove(1);        //Remove item at index 1.
        display(items, "Remove second list elemnt (56).");

	//Check if a value is in the list.
        System.out.printf("\"98\" is %sin the list. %n", 
                items.contains(98) ? "": "not ");
            
        //Display number of elemts in the List.
        System.out.printf("Size: %s%n", items.size());

    }

    //Display the ArrayList’s elements on the console.
    public static void display(ArrayList<Integer> items, String header)
    {
	System.out.printf(header);	//Display header.

	//Display each element in items.
	for (int item : items)
            System.out.printf(" %d", item);
        System.out.print(".\n");
    }
}