package HashMapAssignment;

import java.util.HashMap;
import java.util.Map;

import customException.Account;

public class ASSGNHashMap {
	public static void main (String[] args) {
		Map<Account,Double> acoo = new HashMap<Account,Double>();
		Account a1=new Account("Adya",1,150000.0,102);
		Account a2=new Account("Akshay",5,170000.0,103);
		Account a3=new Account("Kartik",2,190000.0,101);
		
		acoo.put(a1, a1.getBalance());
		acoo.put(a2, a2.getBalance());
		acoo.put(a3, a3.getBalance());
		
		System.out.println(acoo);
		
		System.out.println(acoo.containsKey(new Account("Adya",1,150000.0,102)));
		
		System.out.println(acoo.containsValue(150000.0));
	}
}
