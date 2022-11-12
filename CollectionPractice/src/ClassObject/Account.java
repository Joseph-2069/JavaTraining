package ClassObject;

import java.util.Comparator;



public class Account implements Comparable<Account>{
	private String AccountHolder;
	private int AccNo,AccID;
	private double balance;
	
	
	
	public Account(String accountHolder, int accNo, double balance, int AccID) {
		super();
		AccountHolder = accountHolder;
		AccNo = accNo;
		this.AccID = AccID;
		this.balance = balance;
		
	}

	public String getAccountHolder() {
		return AccountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}
	public int getAccNo() {
		return AccNo;
	}
	public double getBalance() {
		return balance;
	}
	public int getAccID() {
		return AccID;
	}
	public void deposit(double amt) {
		this.balance = this.balance + amt;
	}
	public double withdraw(double amt) throws InsufficientBalanceException ,ZeroBalanceException{
		
		if(amt <= this.balance )	
		{
			this.balance = this.balance - amt;
			
			
			if(this.balance ==0) {
				
				throw new ZeroBalanceException(this.balance ,this.AccNo);				
				
			}
			
			System.out.println("Current Balance is"+ this.balance+" after withdrawing amt:"+amt);
		}
		else
		{
			//System.out.println("Insufficient Balance: amt:"+amt+" is greater than your balance:"+this.balance);
			
			throw new InsufficientBalanceException(this.balance,amt,this.AccNo);
		}
		return amt;
	}
		//Assignment
		@Override
		public String toString() {
//			return("Acc No.:"+getAccNo()+" Name: "+ getAccountHolder()+" Balance: "+getBalance());
			return("Acc ID.:"+getAccID()+" Name: "+ getAccountHolder()+" Balance: "+getBalance());
		}
		@Override
		public int compareTo(Account a1) {
			return this.getAccID()-a1.getAccID();
		}
		@Override 
		public int hashCode() {
			return this.AccID;
		}
		
	}

//when using comparable we override two methods hashcode() and compareTo()
//And while using comparator we use compare 
	

