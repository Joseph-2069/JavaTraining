package Customer;

public class Product extends OrderLine{
	
	private int ProductID,ProductStatus;
	private String description;
	private double unitPrice;
	
	public Product(int prodOrderId, String date,int prod_time ,int quantity,int productID, String description, double unitPrice, int productStatus) {
		super(prodOrderId,date,prod_time,quantity);
		ProductID = productID;
		this.description = description;
		this.unitPrice = unitPrice;
		ProductStatus = productStatus;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public int getProductStatus() {
		return ProductStatus;
	}

	public void setProductStatus(int productStatus) {
		ProductStatus = productStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	@Override
	public String toString() {
		return "ProductID "+this.ProductID+"Product Status "+this.ProductStatus+"Description "+this.description+"Unit Pricing "+this.unitPrice;
	}

}
