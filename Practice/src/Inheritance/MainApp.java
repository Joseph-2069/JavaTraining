package Inheritance;

public class MainApp {
public static void main(String[]args) {
	
	//variable of class is a reference variable
	Employee e1 = new Employee(01,"Joey",25000,101,0.2);
	System.out.println(e1);
	System.out.println("the annual salary of the Employee E1 is "+ e1.CalcAnnualSalary());
	System.out.println("the annual salary of the Employee E1 is "+ e1.CalcAnnualSalary(2000));
	e1.setSalary(100000);
	System.out.println( "The updated salary of "+e1.getName()+ " is "+ e1.getSalary());
	e1.display();
//	System.out.println("the annual salary of the Employee E1 is "+ e1.CalcAnnualSalary(2000));
	Employee e2 = new Employee(e1);//new keyboard 
	e2.display();
	System.out.println(e1.equals(e2));//false
	Employee e3 = e1; // here the address is same but e3 refers to e1 so teh address is same
	System.out.println(e3.equals(e1));//true
}
}


/*
 * can we access the private method of different class?
 * Private:
 * 
 * Public: can we accessed by the objects of the same class
 * How ever we can access them if we make getters and setters but they cant interfere with the implementations
 *
 * Protected:
 */

/* 
* What is Encapsulation?

It is used to hide the values or state of a structured data object 
inside a class, preventing direct access to them by clients in a way that could expose hidden data 

*/

/*
How we apply encapsulation?

1.declare class variables/attributes as private
2. provide public get and set methods to access and update the value of a private variable

*/