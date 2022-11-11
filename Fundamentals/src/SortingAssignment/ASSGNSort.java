package SortingAssignment;
import java.util.SortedSet;
import java.util.TreeSet;


import customException.Account;
public class ASSGNSort {
	public static void main(String[] args) {
	SortedSet<Account> acc = new TreeSet<Account>();
	Account a1=new Account("Adya",1,150000,102);
	Account a2=new Account("Akshay",5,170000,103);
	Account a3=new Account("Kartik",2,190000,101);
	acc.add(a1);
	acc.add(a2);
	acc.add(a3);
	System.out.println(acc);
	}
}
