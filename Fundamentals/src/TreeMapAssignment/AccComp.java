package TreeMapAssignment;

import java.util.Comparator;

import customException.Account;

public class AccComp implements Comparator<Account>{
	
	@Override
	public int compare(Account a1, Account a2) {
		return a1.getAccountHolder().compareTo(a2.getAccountHolder());
	}
}
