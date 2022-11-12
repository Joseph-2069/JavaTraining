package CollectionFrameworkEx;

import java.util.ArrayList;
import java.util.List;
import ClassObject.Account;
import java.util.Scanner;

public class ArrayListAccount {
	public static void main(String[]args) {

		List<Account> list = new ArrayList<Account>();
		Account acc1=new Account("Joseph Verghese",1101,250000.0,101);
		list.add(acc1);
		Account acc2=new Account("Elaza",1102,250010.0,102);
		list.add(acc2);
		Account acc3=new Account("Jacob",1105,250200.0,103);
		list.add(acc3);
		Account acc4=new Account("Sharon",1108,253000.0,100);
		list.add(acc4);
		Account acc5=new Account("Wane",1100,255000.0,102);
		list.add(acc5);
		
		list.add(new Account("Josh",1109,23457,121));
		
		
		
		
		list.forEach(x->{
			System.out.println(x);
		});
		
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter the correct name "); 
		 * String a = sc.next();
		 * acc1.setAccountHolder(a); 
		 * System.out.println(acc1);
		 */
		System.out.println();
		System.out.println("The balance in the account before deposit is"+acc1.getBalance()+"\n\n");
		System.out.println("Enter the amount you want to deposit into Account");
		acc1.deposit(sc.nextDouble());
		System.out.println("The new balance is "+acc1.getBalance());
		
		System.out.println(acc1);
		
	}
}
