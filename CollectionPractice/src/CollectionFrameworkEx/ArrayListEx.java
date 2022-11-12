package CollectionFrameworkEx;
import java.util.*;

public class ArrayListEx {

	public static void main(String[]args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);   // new Integer(100); ---- autoboxing--- box primitive into object type
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		System.out.println(list);
		
		
		int no = (int) list.get(0); // new Integer(100).intvalue();
		System.out.println(no);		// ----auto-unboxing
		
		list.set(0,800);
		
		System.out.println(list);// it is better than array because  of dynamic manipulation
		System.out.println(list.size());
	}
}
