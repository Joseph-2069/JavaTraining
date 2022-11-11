package Inheritance;

public class InheritenceExercise {
/*  Inheritance is a mechanism in which one class acquires the property of another class.
 *  For example, a child inherits the traits of his/her parents. 
 *  With inheritance, we can reuse the fields and methods of the existing class. 
 *  Hence, inheritance facilitates Re-usability and is an important concept of OOPs */
	public static void main(String [] args) {
		
		Manager m1 = new Manager(01,"Joey",25000,101,0.2,20,"Human Resource",10);
		m1.display();
		System.out.println(m1.CalcAnnualSalary(1000));
		
		final float pi = 3.14f;
//		pi++;//Throws error as the variable that is final can't be changed once it has been initialized
		
		
		//IMPORTANT: create a Manager object and check the sequence of constructor calls to it
		
		Manager m2 = new Manager(02,"Chandler",250000,102,0.2,21,"CEO",1000);
		m2.display();
		System.out.println(m2.CalcAnnualSalary());
		
		
		
		
		
		System.out.println("-------------------------------------------------------");
		Manager m3 = new Manager(02,"Chandler",250000,102,0.2,21,"CEO",1000);
		System.out.println(m3.IncentiveWithSal());
		
		
		
		
		
		
//		OUTPUT:     Employee parameterized constructor was called............................
//					Manager parameterized constructor is called
		
//		FIRST THE CONSTRUCTOR OF PARENT CLASS IS CALLED AND THEN THE METHOD AND INSTANCE VARIABLES ARE SEARCHED IN THE PARENT CLASS.
//		THEN IF THE COMPILER FINDS THE METHODS IN PARENT CLASS, THEIR FUNCTIONALITY IS IMPLEMENTED THERE AND THE OUTPUT IS RETURNED TO THE CHILD CLASS
//		AND THEN USED WHERE IT IS BEING CALLED.
//		IF THE CHILD CLASS HAS A OVERRIDDEN METHOD OF THAT FUNCTION THEN THE COMPILER OVERRIDES THE IMPLEMENTATION 
//		AND RETURNS THE OUTPUT CALCULATED IN THE CHILD CLASS.
//		
	}
}
