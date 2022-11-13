package CollectionFrameworkEx;
import java.util.Set;
import java.util.HashSet;

import ClassObject.Employee;
public class HashSetEx {
	public static void main(String[] args) {
		Set<Employee>Hs=new HashSet<Employee>();
		Employee e1 = new Employee(101,"Joseph",500000,20);
		Hs.add(e1);
		Hs.add(new Employee(102,"George",350000,21));
		Hs.add(new Employee(103,"Geo",250000,22));
		Hs.add(new Employee(102,"Patrick",5000,23));
		Hs.add(new Employee(102,"Harry",150000,21));
		Hs.add(new Employee(102,"George",350000,21));
		
		System.out.println(Hs);
		
		
	}
}
