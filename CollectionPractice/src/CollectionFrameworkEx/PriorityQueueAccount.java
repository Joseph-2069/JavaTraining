package CollectionFrameworkEx;
import java.util.Queue;
import java.util.PriorityQueue;
import ClassObject.Account;
public class PriorityQueueAccount {
	public static void main(String[]args) {
		Queue<Account> aq = new PriorityQueue<Account>();

		Account acc = new Account("Joseph",1101,3250000.0,101);
		Account acc2 = new Account("George",1201,1250000.0,102);
		Account acc3 = new Account("Josh",1301,2250000.0,103);
		aq.offer(acc);
		aq.offer(acc2);
		aq.offer(acc3);

		System.out.println(aq);
		//		print account list
		aq.forEach(x->{
			System.out.println(aq);

		});

		System.out.println("------size-------");
		System.out.println(aq.size());
		System.out.println("------peek-------");
		System.out.println(aq.peek());
		System.out.println(aq.size());
		System.out.println("------poll-------");
		System.out.println(aq.poll());
		System.out.println(aq.size());
	}
}
