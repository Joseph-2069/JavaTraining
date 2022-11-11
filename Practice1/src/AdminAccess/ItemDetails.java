package AdminAccess;

public class ItemDetails {

	private int itemID,itemPricing;
	private String itemName,itemCategory;
	
	ItemDetails(int itemID,String itemName,int itemPricing, String itemCategory){
		this.itemID= itemID;
		this.itemName=itemName;
		this.itemPricing=itemPricing;
		this.itemCategory=itemCategory;
	}
	
	public int getItemID() {
		return this.itemID;
	}
	public void setItemID(int ID) {
		this.itemID=ID;
	}
	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String name) {
		this.itemName= name;
	}
	public int getItemPricing() {
		return this.itemPricing;
	}
	public void setItemPricing(int price) {
		this.itemPricing=price;
	}
	public String getCategory() {
		return this.itemCategory;
	}
	public void setItemCategory(String category) {
		this.itemCategory=category;
	}
}
