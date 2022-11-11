package AbstractClass;
/*
 * 
 * */
public class Square extends Shapes{
	
	public Square(int length) {
		super(length);
	}
	String color = "Yellow";

	public int CalculateArea(){
		return this.getLength( )* this.getLength();
	}
	public int CalculatePerimeter() {
		return 4 * this.getLength();
	}
	
}
