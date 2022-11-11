package AbstractClass;

public class Rectangle extends Shapes{

	public Rectangle( int length,int breadth) {
		super(length,breadth);
	}
	
	public int CalculateArea() {
		return this.getLength()*this.getBreadth();
	}
	public int CalculatePerimeter() {
		return 2*(this.getLength()+this.getBreadth());
	}
}
