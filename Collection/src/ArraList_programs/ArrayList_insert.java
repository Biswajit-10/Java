//insert an element into the array list at the first position
package ArraList_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayList_insert {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(8);
		a.add(5);		
		a.add(8);
		a.add(0,"Milu");
		System.out.println(a);
		System.out.println(a.get(0));		
} 
}
//update specific array element by given element
class ArrayList_Update {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(8);
		a.add(5);		
		a.add(8);
		System.out.println(a);
		Collections.sort(a); // not removing duplicate element
//		System.out.println(a);
		a.set(0,"red");
		System.out.println(a);
//		Set<Integer> mySet = new HashSet<Integer>(a);
//		System.out.println(mySet);
		
} 
}