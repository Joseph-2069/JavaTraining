package ExceptionHandlingAssignment;

public class ZeroBalanceException extends Exception {

	private double curBal;
	private double withDraw;
	private int accNo;
	
	public ZeroBalanceException(double curBal,int accNo) {
		super();
		this.curBal = curBal;
		this.accNo = accNo;
	}
	
	@Override
	public String toString() {
	
		return "ZeroBalanceException : Your Account balance is 0";
	}
	
}
