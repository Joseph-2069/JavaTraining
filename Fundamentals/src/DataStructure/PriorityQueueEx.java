package DataStructure;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class PriorityQueueEx {
	public static void main(String[]args) {
		Queue <Integer> que =new PriorityQueue<Integer>();
		// always use the queue related methods .add() could have been used too 
		// but queue methods are preferred...
		que.offer(10);
		que.offer(50);
		que.offer(40);
		que.offer(80);
		que.offer(40);
		System.out.println(que.size());
		System.out.println("peek  "+que.peek());//peek returns element but doesnt remove it
		System.out.println(que.poll());//poll on the other hand returns the element and then removes it from the mouth of the queue
		
		
//		LinkedList -FIFO structure
		que = new LinkedList<Integer>();
		que.offer(200);
		que.offer(260);
		que.offer(203);
		que.offer(240);
		que.offer(220);
		
		
		
	}
}
