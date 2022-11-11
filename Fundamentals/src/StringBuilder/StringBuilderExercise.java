package StringBuilder;

import ClassObj.Employee;

public class StringBuilderExercise {
	public static void main(String[]args) {
		String s ="Joseph";
		System.out.println(s+" Vibin");
		s=s+" haha"; // s points to a new one object and the old value goes into garbage collector
					 // "Vibin " is eligible for GArbage Collection
		System.out.println(s);
		
		
		
		Employee e1 = new Employee(2,"Jojo",35000,1); // only one pointer is there here
		System.out.println(e1);
		e1.setEmpname("Joseph");
	    e1 = new Employee(2,"Jo",30000,2);
		System.out.println(e1);
		//After this only one object is eligible for garbage collection
		//but if on line 18 there is another Employee e2 is created instead , then 0 object are eligible for garbage collection
		//String Buffer is synchronised and is slower
	}
}
