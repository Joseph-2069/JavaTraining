package AbstractClass;
/*What is abstraction? 

Abstraction is a process of hiding the implementation 
details and showing only functionality to the user,
which means that it shows only the essential things to the user and hides the internal details.

*/

//*********Abstract class is created using abstract keyword******* 
public abstract class Shapes  { 
	// ABSTRACT : which has both implemented(abstract) and non-implemented(non-abstract) methods
/*		ABSTRACT CLASS: 
 * 			Abstract class is created using abstract keyword
 * ***************1)it can have both abstract and non-abstract methods
 * ***************2)it can not be instantiated(OBJECT NHI BANEGA)
 * ***************3)It can have constructor and static methods (-_-)
 * ***************4) All the abstract methods need to be called in the child class
 * 
 * 
 * 			
*/	
	private int length,breadth;
	String color = "maroon";
	public Shapes(int length){
		this.length = length;
	}
	public Shapes(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public String color() {
		return "color method";
	}
	
	static String color2="olive green";
	public abstract int CalculateArea();//Abstract class is created using abstract keyword
	public abstract int CalculatePerimeter();//Abstract class is created using abstract keyword
	
	
	
	

}
