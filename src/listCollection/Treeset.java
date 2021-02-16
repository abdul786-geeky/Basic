package listCollection;
import java.util.*;
public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t = new TreeSet<String>();
		t.add("Aziz");
		t.add("Sonu");
		t.add("Babay");
		Iterator<String> itr = t.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
