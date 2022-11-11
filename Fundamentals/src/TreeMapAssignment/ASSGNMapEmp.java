package TreeMapAssignment;

import java.util.TreeMap;

import customException.Account;

import java.util.Comparator;
import java.util.SortedMap;

public class ASSGNMapEmp {

	public static void main(String[] args) {
		Comparator<Account>acc = new AccComp();
		SortedMap<Account,Double> acoo = new TreeMap<Account,Double>(acc);
		Account a1=new Account("Adya",1,150000.0,102);
		Account a2=new Account("Akshay",5,170000.0,103);
		Account a3=new Account("Kartik",2,190000.0,101);
		
		acoo.put(a1, a1.getBalance());
		acoo.put(a2, a2.getBalance());
		acoo.put(a3, a3.getBalance());
		
		System.out.println(acoo);

	}

}
