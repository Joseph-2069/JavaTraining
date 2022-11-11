package ComparatorASSGN;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import ClassObj.Employee;

public class ASSGNEmpComp {
	public static void main(String[]args) {
		Comparator<Employee> comp = new ComparatorEmpName();
		SortedSet<Employee> emp = new TreeSet<Employee>(comp);
		Employee e = new Employee(2,"Joseph",2500.0,34);
		Employee e1 = new Employee(1,"Geo",34500,10);
		Employee e2=new Employee(2,"Joey",22500.0,3);
		Employee e3=new Employee(4,"Monica",12000.0,30);
		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		System.out.println(emp);
		
	}
}
