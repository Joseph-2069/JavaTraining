package CollectionFramework;




/*		Framework is basically  body/bodies of pre written code which uses coding language.
  		It is basically used for software applications and java Programs.
  		__________------------------______________--------------______________
  		
  		A framework is a set of classes and interfaces which provide a ready-made architecture. 
  		In order to implement a new feature or a class, there is no need to define a framework. 
  		However, an optimal object-oriented design always includes a framework with a collection of classes such 
  		that all the classes perform the same kind of task. 
  		
  		_____________--------------______________---------------____________--------------____________
  		
  		A Java Framework consist of set of interfaces and classes which provide a ready made architecture.
  		
  		
*/



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> EmpLi = new ArrayList<Employee>();
		EmpLi.add(new Employee(1,"Srushti",20000,201));
		EmpLi.add(new Employee(2,"Paradox",25000,202));
		EmpLi.add(new Employee(3,"EPR",22000,203));
		EmpLi.add(new Employee(4,"Spectra",23000,204));
		
//		for(int i =0;i<EmpLi.size();i++) {
//			System.out.println(EmpLi.get(i));
//		}
		
//		Iterator<Employee> it = EmpLi.iterator();
//		while(it.hasNext()) {
//			Employee e = it.next();
//			System.out.println(e);
//		}
		
		EmpLi.forEach(e -> System.out.println(e));

	}

}
