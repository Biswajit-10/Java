package HashSet;
import java.util.*;

public class Convert_HashSet_To_TreeSet {
	  public static void main(String[] args) {
	         // Create a empty hash set
	     HashSet<String> h_set = new HashSet<String>();
	   // use add() method to add values in the hash set
	          h_set.add("Red");
	          h_set.add("Green");
	          h_set.add("Black");
	          h_set.add("White");
	          h_set.add("Pink");
	          h_set.add("Yellow");
	      System.out.println("Original Hash Set: " + h_set);
	    
	     // Create a TreeSet of HashSet elements
	     Set<String> tree_set = new TreeSet<String>(h_set);
	 
	     // Display TreeSet elements
	     System.out.println("TreeSet elements: ");
	     for(String element : tree_set){
	        System.out.println(element);
	     }
	  }
	}
