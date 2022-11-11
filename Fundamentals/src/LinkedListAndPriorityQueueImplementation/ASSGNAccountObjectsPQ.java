package LinkedListAndPriorityQueueImplementation;
import java.util.LinkedList;
import customException.Account;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import customException.Account;

//Assignment: LinkedList of account objects and priority Queue of account objects
public class ASSGNAccountObjectsPQ {
	public static void main(String[] args) {
		Queue<Account> acc= new PriorityQueue<Account>();
		acc.offer(new Account("Joe",2,50000,101));
		acc.offer(new Account("Janice",3,45000,102));
		acc.offer(new Account("Racheal",4,80000,103));
		acc.offer(new Account("Chandler",5,30000,104));
		acc.offer(new Account("Monica",6,20000,105));
		System.out.println(acc);
		
		System.out.println(acc.isEmpty());
		System.out.println(acc.peek());
		System.out.println(acc.poll());
		
		System.out.println(acc.peek());
		acc.clear();
		System.out.println(acc.peek());
	}
}
