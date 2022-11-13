package CollectionFrameworkEx;
import ClassObject.Account;
import java.util.*;
public class HashMapAccount {
	public static void main(String[] args) {
		Map<Account,Double> a = new HashMap<Account,Double>();
		Account ac1= new Account("Joseph",101,120000,2201);
		a.put(ac1,ac1.getBalance());
		Account ac2= new Account("Micheal",102,110000,2202);
		a.put(ac2,ac2.getBalance());
		Account ac3= new Account("Kobe",103,130000,2203);
		a.put(ac3,ac3.getBalance());
		Account ac4= new Account("James",104,140000,2204);
		a.put(ac4,ac4.getBalance());
		
		System.out.println(a.containsKey(new Account("James",104,140000,2204)));
	}

}
