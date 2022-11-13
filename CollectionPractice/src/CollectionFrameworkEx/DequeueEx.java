package CollectionFrameworkEx;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
public class DequeueEx {
	public static void main(String[] args) {
		Deque<String> dq = new LinkedList<String>();
		
		//We can enter the Element from both ends as per the requirement
		dq.offer("Element 1");//3
		dq.offerFirst("Element 2");//2
		dq.offerFirst("Element 0");//1
		dq.offerLast("Element3");//4
		
		System.out.println(dq);
		
		// elements can be removed from both front and end here in dequeue
		System.out.println(dq.poll());//2
		System.out.println(dq.pollFirst());//1
//		System.out.println(dq.pollLast());
		System.out.println(dq);
		
		
		
		
		Deque<String> d = new ArrayDeque<String>();
		// add() method to insert
        d.offer("For");//2
        d.offerFirst("Java");//1
        d.offerLast("Java");//3
        d.offer("is so good");//4
        System.out.println(d);
        
        System.out.println(d.peek());
        
        System.out.println(d.pollFirst());
        System.out.println(d);

        System.out.println(d.pollLast());
        System.out.println(d);

		
	}

}
