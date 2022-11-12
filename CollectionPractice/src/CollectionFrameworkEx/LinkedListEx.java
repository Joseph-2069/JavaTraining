package CollectionFrameworkEx;
import java.util.LinkedList;
import java.util.Queue;
public class LinkedListEx {
	public static void main(String[]args) {
		//priorityQueue has element will sort element priority wise
//		it uses comparable interface compareTo method for deciding the priority of elements added
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(10);
		q.offer(9);
		q.offer(8);
		q.offer(7);
		q.offer(6);
		
		//peek displays the last element entered but doesnt remove it
		System.out.println(q.peek());
		
		//poll return s the element at the mouth but also removes is
//		so that the next element moves in to mouth
		
		System.out.println("poll "+q.poll());
		System.out.println("size after poll "+q.size());
		
		q= new LinkedList<Integer>();
		q.offer(10);
		q.offer(9);
		q.offer(8);
		q.offer(7);
		q.offer(6);
		
		
		System.out.println(q.size());
		System.out.println("size after poll "+q.poll());
		System.out.println("poll : "+ q.poll());
		System.out.println("size after poll "+q.size());
		
	}

}
