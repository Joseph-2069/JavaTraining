package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {
		
	public static void main(String[]args) {
		/* 
		 * List  is an interface and ArrayList , LinkedList are all the subclasses..
		 * The reason why .add() is common in both ArrayList and LinkedList.. there are more similar methods within them as well 
		 * 
		 * 
		 * */
		
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(80);
		li.add(50);
		li.add(20);
		li.remove(0);
		LinkedList<Integer> Lt1 = new LinkedList<Integer>();
		Lt1.add(30);
		Lt1.remove(0);
		Lt1.offer(20);
		
		
		
//		!!!!!!!!!!!!!!  THIS IS JUST THE BASIC BITCH  !!!!!!!!!!!!
		
		
//		to remove element from list	 .remove()
		li.remove(1);
		System.out.println();
		System.out.println(li);
		
//		Setting the value at an Index / to change the value at a particular index
		li.set(0, 100);
		System.out.println(li);
		
//		Access a value at an index we use get() method
		li.get(0);
		System.out.println(li.get(1));
		
//		.size() is used to find the number of element present in the list
		
		System.out.println(li.size());

//		SORT FUNCTION;
		Collections.sort(li);
		
		
		
//		Iterating the list THIS IS FOR EACH LOOP FOR NORMAL LOOP USE LIST.SIZE()
		for(Integer a : li) {
			System.out.println(a);
		}
		
		
//		Clearing the list entirely
		
		li.clear();
		System.out.println(li);
		

		
		
		
		
		/* 
		 * 
		 * */
	}
}
