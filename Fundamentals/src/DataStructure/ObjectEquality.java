package DataStructure;

import java.util.ArrayList;
import java.util.List;

import ClassObj.Employee;

public class ObjectEquality {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Employee e = new Employee(2,"Joseph",2500.0,34);
		
		Employee e1 = e;
		
//		Employee e = new Employee(2,"Joe",22500.0,3);
		
		System.out.println(e1==e); // gives output as true(same memory )
		
		list.add(e);
		System.out.println(list);
		Employee e2 = new Employee(2,"Joseph",2500.0,34);
		
		e.setSalary(12300);
		System.out.println("e's Salary"+e.getSalary());
		
		
		System.out.println(e2==e);//gives false  // application point of view e1 and e2 represent the same value
		
		//   .equals() method is used to check if the value within two locations are the same
		
		System.out.println(e2.equals(e));// used to check if the two reference are meaningfully the same(in the application)
		
		//Object class equals method works similar to == operator
		int no =5, no1=5;
		System.out.println(no == no1);
		
	}
}
