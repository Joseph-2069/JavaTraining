package Customer;

public class OrderLine {

private int ProdOrderId ,Prod_time,Quantity;
private String date;

public OrderLine(int prodOrderId, String date,int prod_time ,int quantity ) {
	ProdOrderId = prodOrderId;
	Prod_time = prod_time;
	Quantity = quantity;
	this.date = date;
}

public int getProdOrderId() {
	return ProdOrderId;
}

public void setProdOrderId(int prodOrderId) {
	ProdOrderId = prodOrderId;
}

public int getProd_time() {
	return Prod_time;
}

public void setProd_time(int prod_time) {
	Prod_time = prod_time;
}

public int getQuantity() {
	return Quantity;
}

public void setQuantity(int quantity) {
	Quantity = quantity;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}







}
