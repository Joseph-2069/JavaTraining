package CollectionFrameworkEx;

import java.util.*;

import ClassObject.Employee;

public class ArrayListEmployee {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(101,"Paradox",25000.0,200));
		emp.add(new Employee(102,"Srushti",35000.0,201));
		emp.add(new Employee(103,"Nazz",15000.0,202));
		emp.add(new Employee(104,"MC Square",40000.0,203));

		System.out.println(emp);

		System.out.println(emp.get(1));
		System.out.println(emp.size());

		Employee e1 =new Employee(101,"Paradox",25000.0,200);
		Employee e2 = emp.get(1);



		e1.setEmpSalary(4500000);
		System.out.println(e1);

		
		int o1 =5, n2=5;
		System.out.println(o1==n2);
		
		for(Employee e:emp) {
			System.out.println(e);
		}
		
		System.out.println("Using iterator");
		System.out.println();
	
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("Calling array list in employee for searching.....");
		boolean isPresent = emp.contains(new Employee(101,"Paradox",25000.0,200));
		System.out.println("Employee with name Paradox is present or not??  :"+isPresent);// comes out to be false as the new memory allocation is done and the address is not same
		
		System.out.println("__________--------____---Lambda function----___--___--_--____-_-");
		
		
		emp.forEach(ex->
			System.out.println(ex)/////////Why is the output in reverse???
			);
		
		
		
	}

}
