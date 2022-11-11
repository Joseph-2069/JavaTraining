package Customer;

public class Customer {
	
	private int custID;
	private String custName,custAddress;
	private long custNo;
	
	
	public Customer(int custID, String custName, long custNo,String custAddress) {

		this.custID = custID;
		this.custName = custName;
		this.custNo = custNo;
		this.custAddress=custAddress;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getCustNo() {
		return custNo;
	}

	public void setCustNo(long custNo) {
		this.custNo = custNo;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	
	
	
	@Override
	public String toString() {
		return "aCustID()=" + getCustID() + " CustName()=" + getCustName() + ", getCustNo()="
				+ getCustNo() + "]";
	}


	
	

	
	
}
