package listCollection;
import java.util.*;

public class MergeUniqueUnsorted {
	private static int[] mergeArraysAndRemoveDuplicates(int[] arrayA, int[] arrayB) {
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		for(int a : arrayA) {
			t1.add(a);
		}
		for(int a : arrayA) {
			t2.add(a);
		}
		t1.addAll(t2);
		Iterator<Integer> itr = t1.iterator();
		int n=0;
		int res[]= new int[t1.size()];
		while(itr.hasNext()) {
			res[n]= itr.next();
			n++;
		}
		return res;
		
	}
	
	
	
	
	 public static void main(String[] args)
	    {
	        int[] arrayA = new int[] {7, -5, 3, 8, -4, 11, -19, 21};
	         
	        int[] arrayB = new int[] {6, 13, -7, 0, 11, -4, 3, -5};
	         
	        int[] mergedArray = mergeArraysAndRemoveDuplicates(arrayA, arrayB);
	         
	        System.out.println("Array A : "+Arrays.toString(arrayA));
	         
	        System.out.println("Array B : "+Arrays.toString(arrayB));
	         
	        System.out.println("Sorted Merged Array With No Duplicates : ");
	         
	        System.out.println(Arrays.toString(mergedArray));
	    }

}
