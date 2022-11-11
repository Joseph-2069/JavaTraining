package DataStructure;

import java.util.HashMap;
import java.util.Map;

import ClassObj.Employee;

public class MapInterface {
//	Map<key,value> || there can only be one key but multiple value
//	if the value is again stored in the same key , the value is replaced 
//	HashMaps || put() method(key , value)
//	 to get the value , get(key) is used
//	clear() clears all the values
//	
	
	public static void main(String[]args) {
		Map<Employee,Double> m = new HashMap<Employee,Double>();
		Employee e = new Employee(2,"Joseph",2500.0,34);
		Employee e1 = new Employee(1,"Geo",34500,10);
		m.put(e,e.getSalary());
		m.put(e1,e.getSalary());
		m.put(new Employee(2,"Joey",22500.0,3),22500.0);
		m.put(new Employee(4,"Monica",12000.0,30),12000.0);
		
		System.out.println(m.containsKey(new Employee(4,"Monica",12000.0,30)));
		System.out.println(m);
		
		
		
		meth(m);
		
		
		
	
		
		
		
	}
	static void meth(Map<Employee,Double> mp) {
		System.out.println(mp.get(new Employee(1,"Geo",34500,10)));
//		we need to declare the type else anything can be added
//		mp.put(10,"jjj"); this would give error 
	}

}
