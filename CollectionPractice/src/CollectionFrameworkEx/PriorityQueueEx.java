package CollectionFrameworkEx;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class PriorityQueueEx {
	public static void main(String[]args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		
	
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
