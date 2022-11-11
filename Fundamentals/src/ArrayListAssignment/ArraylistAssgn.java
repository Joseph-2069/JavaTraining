package ArrayListAssignment;
import customException.Account;
import java.util.*;
public class ArraylistAssgn {
	
	// assignment - arraylist of account objects and all methods on it
	
	
	public static void main(String[]agrs) {
		List<Account> Accno= new ArrayList<Account>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Account Holder Name   -->");
		String name = sc.next();
		
		Account ob1 = new Account(name,001,0,101);
		Accno.add(ob1);
		Accno.add(new Account("Joe",002,50000,102));
		
		System.out.print("Enter the amount you want to deposit -->");
		double Dep =sc.nextDouble();
		ob1.deposit(Dep);
		
		
		
		System.out.println(Accno);
		
		
		sc.close();
		
		
	}
}
