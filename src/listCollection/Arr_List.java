package listCollection;

import java.util.*;


public class Arr_List {

	public static void main(String args[]) {
		ArrayList<String> a = new ArrayList<String>(); //Creating arrayList object type String
		a.add("Apple");
		a.add("Mango");
		a.add("Orange");
		a.add("Apple");
		a.add("Banana");
		//System.out.println(a); // Raw output
		//Traversing list through iterator
		
		/*Iterator itr = a.iterator();//getting the iterator
		while(itr.hasNext()) {                //check if iterator has element
			System.out.println(itr.next());  // printing element;
			
		}*/
		// Traversing using for each
		
		/*for(String i:a) {
			System.out.println(i);
		}
		*/
		// Printing using get() method: 
		
		/*for(int i=0;i<a.size();i++) {
			
		System.out.println(a.get(i));
		}*/
		a.set(0, "Guava");
		Collections.sort(a);
		
		for(String i:a) {
			System.out.println(i);
			
		}
		
	}
}
