package listCollection;

import java.util.*;

public class Testing {

	public static void main(String[] args) {
		// Testing iterator interface
	/*	List<Integer> lst = new ArrayList<>();
		for(int i=0;i<9;i++) {
			lst.add(i);
		}
		//System.out.println(lst);
		// Printing value using iterator interface
		Iterator<Integer> itr = lst.iterator();
		while(itr.hasNext()) {                     //hasNext() is a boolean method inside iterator interface which returns true if more element present in list
			System.out.println(itr.next());   //next() return current element and move cursor to the next
		}*/
		//Now will add array element into list
		
		int ar[]= {10,2,3,7,1,6};
		Arrays.sort(ar);
		System.out.println(ar[0]);
		/*for(int i=0;i<ar.length;i++) {
			//System.out.println(ar[i]);
		}*/
	/*	ArrayList<Integer> l = new ArrayList<Integer>();
		for(int a : ar) {
			l.add(a);
		}
		System.out.println(l);
*/
		
	}

}
