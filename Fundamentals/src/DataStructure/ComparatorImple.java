package DataStructure;
import java.util.*;
import ClassObj.Employee;

public class ComparatorImple implements Comparator<Employee>{
	
	@Override
	public int compare(Employee e1 , Employee e2) {
		System.out.println("comparing e1.salary "+e1.getSalary()+" and e2.salary "+e2.getSalary());
		return (int)e1.getSalary()-(int)e2.getSalary();
	}

}
