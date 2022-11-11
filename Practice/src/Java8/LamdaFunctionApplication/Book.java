package Java8.LamdaFunctionApplication;

public class Book {
	private int bookNo;
	private String BName,BClass;
	public Book(int bookNo,String BName, String BClass) {
		this.bookNo = bookNo;
		this.BName=BName;
		this.BClass = BClass;
	}
	
	int getBookNo() {
		return bookNo;
	}
	void setBookNo(int n) {
		this.bookNo = n;
	}
	
	String getBookName() {
		return BName;
	}
	void setBookName(String Name) {
		this.BName = Name;
	}

	public String getBClass() {
		return BClass;
	}

	public void setBClass(String bClass) {
		this.BClass = bClass;
	}
	
	@Override
	
	public String toString() {
		return " No :"+getBookNo()+" Name : "+getBookName()+" Class : "+getBClass();
	}
	
	
}
