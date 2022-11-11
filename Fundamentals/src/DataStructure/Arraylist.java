package DataStructure;
import java.util.*;
public class Arraylist {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(100); // new Integer(100); ----- auto - boxing  --- box the primitive into object type
	list.add(200);
	list.add(10);
	list.add(300);
	
	System.out.println(list);
	
	int no =(int)list .get(0); // new Integer(100).intvalue() 
							   //	---- auto-unboxing --- unbox Integer object to its primitive
	System.out.println("value at index position 0:"+ no);
	
	list.set(0, 1000);
	System.out.println(list);
	System.out.println(list.size());
	
}
}
