package AbstractClass;
/*   
 * Abstract
 * 
 *  WHY ABSTRACT Class???????
 *  Abstract class provide the template to the sub class but not the implementation
 *  
 *  
 *  */
public class AbstractEx {
	public static void main(String[]args) {
		
//		(Reference of super class) s = new (Constructor of sub class ());
//		Shapes s1 = new Shapes(10); //throws error coz the object of abstract class cannot be created
		
		Square s2 =new Square(20);// IDHAR MEIN REFERENCE IS SQUARE || NORMAL OBJECT DECLARATION 
		System.out.println(s2.CalculateArea());
		System.out.println(s2.CalculatePerimeter());
		
		Shapes s = new Square(20);// IDHAR RV IS SHAPES ||
		
		
		
		System.out.println(s.CalculateArea());
		System.out.println(s.CalculatePerimeter());
		
		
		Shapes r = new Rectangle(10,20);
		System.out.println(r.CalculateArea());
		System.out.println(r.CalculatePerimeter());
		
		System.out.println(s2.color);
		System.out.println(s.color);
	}
	
	
	
	/*
	 * WTF IS UPCASTING?
	 * Upcasting is the typecasting of a child object to a parent object.  
	 * Upcasting gives us the flexibility to access the parent class members
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

}
