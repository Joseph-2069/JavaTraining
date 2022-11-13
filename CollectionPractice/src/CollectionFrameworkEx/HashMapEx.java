package CollectionFrameworkEx;
import ClassObject.Employee;
import java.util.HashMap;
import java.util.Map;
public class HashMapEx {

	public static void main(String[] args) {
		Map<Employee,Double> map = new HashMap<Employee,Double>();
		Employee e1 = new Employee(101,"Joseph",25000,1);

		Employee e = new Employee(102,"Harry",35000,2);

		map.put(e1,e1.getEmpSalary());
		map.put(e, 35000.0);
		System.out.println(map.containsKey(new Employee(101,"Joseph",25000,1)));//returns false

		System.out.println(map.containsValue(35000.0));//returns true as the value is present in the hashMap

		meth(map);

	}
	
	static void meth(Map<Employee , Double> mp) {
		System.out.println("inside meth object "+mp.get(new Employee(101,"Joseph",25000,1)));
	}
}
