package CollectionFrameworkEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ClassObject.Employee;

public class HashSetIterator {
public static void main(String[] args) {
	Set<Employee>Hs=new HashSet<Employee>();
	Employee e1 = new Employee(101,"Joseph",500000,20);
	Hs.add(e1);
	Hs.add(new Employee(102,"George",350000,21));
	Hs.add(new Employee(103,"Geo",250000,22));
	Hs.add(new Employee(102,"Patrick",5000,23));
	Hs.add(new Employee(102,"Harry",150000,21));
	Hs.add(new Employee(102,"George",350000,21));
	
	
	System.out.println("------calling the iterator method---------");
	Iterator<Employee> it = Hs.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	System.out.println("--------using for each method--------");
	
	Hs.forEach(e->{
		System.out.println(e);
	});
}
}
