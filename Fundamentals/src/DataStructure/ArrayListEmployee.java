package DataStructure;
import java.util.*;

import ClassObj.Employee;
public class ArrayListEmployee {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Employee e = new Employee(2,"Joseph",2500.0,34);
		
		list.add(e);
		
		Employee e1 = new Employee(1,"Geo",34500,10);
		
		list.add(e1);
		
		list.add(new Employee(2,"Joe",22500.0,3));
		list.add(new Employee(4,"Monica",12000.0,30));
		
		
		
		System.out.println(list);
		
		e.setSalary(12300);
		System.out.println("e's Salary"+e.getSalary());
		
		
		System.out.println(e1==e);//gives false  // application point of view e1 and e2 represent the same value
		
		//   .equals() method is used to check if the value within two locations are the same
		
		System.out.println(e1.equals(e));// used to check if the two reference are meaningfully the same(in the application)
		
		//Object class equals method works similar to == operator
		int no =5, no1=5;
		System.out.println(no == no1);
		
		
		/*  contains method checks if the element is present by comparing it with every element in collection 
		 * it uses equals method for comparision
		 * so you have to override the equals method in the elements class if two elements are supposed to 
		 * be equal i.e meaningfully same application-wise 
		 * 
		 * 	REASON --- WHY SHOULD YOU OVERRIDE THE EQUALS METHOD??????
		 * 
		 * 		if you dont override equals in EMployee then the object class equals will be called
		 * and it checks if the two objects are memory-wise equal -so u wont get get the expected result 
		 * 
		 *  */
		
		
		boolean isPresent = list.contains(new Employee(22,"Pheobe",340000,22));
		System.out.println("Employee with empid 22 and name Pheobe is present or not??? =  "+isPresent);
	}

}
