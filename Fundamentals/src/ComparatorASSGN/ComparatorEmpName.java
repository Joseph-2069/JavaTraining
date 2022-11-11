package ComparatorASSGN;

import java.util.Comparator;

import ClassObj.Employee;

public class ComparatorEmpName implements Comparator<Employee>{
	
	@Override
	public int compare(Employee e, Employee e2) {
		return e.getEmpname().compareTo(e2.getEmpname());
		
	}

}
