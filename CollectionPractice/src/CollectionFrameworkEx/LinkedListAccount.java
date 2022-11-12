package CollectionFrameworkEx;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import ClassObject.Account;
public class LinkedListAccount {
	public static void main(String[]args) {
		Queue<Account> acc = new LinkedList<Account>(); //implementation of LL using Queue
		acc.offer(new Account("Hitesh",1101,250000.0,101));
		acc.offer(new Account("Ishan",1102,250010.0,102));
		acc.offer(new Account("Jacob",1105,250200.0,103));
		acc.offer(new Account("Sharon",1108,253000.0,100));
		acc.offer(new Account("Wane",1100,255000.0,102));
		
		System.out.println(acc);
		
		
		acc.forEach(x ->{
			System.out.println(x);
		});
		System.out.println();
		System.out.println("peek");
		System.out.println();
		System.out.println(acc.peek());
		
		
		Iterator<Account> it = acc.iterator();
		while(it.hasNext()) {
			Account a = it.next();
			System.out.println(a);
		}
	}

}
