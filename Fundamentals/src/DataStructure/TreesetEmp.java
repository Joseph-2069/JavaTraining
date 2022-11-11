package DataStructure;
import java.util.*;
import ClassObj.Employee;
public class TreesetEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SortedSet<Employee> sortS = new TreeSet<Employee>();
		Employee e1= new Employee(1,"Joseph",250000,3);
		sortS.add(e1);
		Employee e= new Employee(6,"Monica",100000,6);
		sortS.add(e);
		sortS.add(new Employee(1,"Joseph",250000,3) );
		sortS.add(new Employee(3,"Joe",150000,2));
		sortS.add(new Employee(2,"Phoebe",34500,8));
		System.out.println(sortS);
		
		
		
		//duplicate 
		
		System.out.println(sortS.size());
		System.out.println(sortS.contains(new Employee(3,"Joe",150000,2)));

	}

}
