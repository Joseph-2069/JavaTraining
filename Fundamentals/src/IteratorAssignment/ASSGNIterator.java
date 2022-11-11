package IteratorAssignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import customException.Account;

public class ASSGNIterator {
	public static void main(String[] args) {
		Set<Account> hs = new HashSet<Account>();
		Account a1=new Account("Adya",1,150000,102);
		Account a2=new Account("Akshay",5,170000,103);
		Account a3=new Account("Kartik",2,190000,101);
		hs.add(a3);
		hs.add(a2);
		hs.add(a1);
		Iterator<Account> it = hs.iterator();
		while(it.hasNext()) {
			Account Acoo = it.next();
			System.out.println(Acoo);
		}
		
		hs.forEach(Acoo -> System.out.println(Acoo));
	}
}
