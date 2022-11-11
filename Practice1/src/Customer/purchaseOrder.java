package Customer;

public class purchaseOrder extends Customer{
	private int orderID,quantity,orderTime;
	private String orderDate;
	
	public purchaseOrder(int customerID,String customerName,long PhoneNumber,String Address,int orderId,String orderDate,int orderTime,int quantity) {
		super(customerID,customerName,PhoneNumber,Address);
		this.orderID=orderID;
		this.orderDate= orderDate;
		this.orderTime = orderTime;
	}
	

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}
	
	@Override
	public String toString() {
		return "OrderID: "+this.orderID+"Quantity: "+this.quantity+"Order Date: "+this.orderDate+"Order Time: "+this.orderTime;
	}
}
