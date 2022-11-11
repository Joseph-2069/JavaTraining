package DataStructure;
import java.util.*;
import ClassObj.Employee;
public class HashsetExercise {
	public static void main (String[]args) {
		Set<Employee> st = new HashSet<Employee>();
		Employee e1= new Employee(1,"Joseph",250000,3);
		st.add(e1);
		Employee e= new Employee(2,"Monica",100000,6);
		st.add(e);
		st.add(new Employee(1,"Joseph",250000,3) );
		st.add(new Employee(3,"Joe",150000,2));
		System.out.println(st);
		System.out.println(st.size());//shows output and even the duplicate value but it should show unique value
									  //WHY?? it is added to four different buckets and hence .equals is not called as the hash code is different for both 
									  //the same elements and hence we are not able to compare the two even though the data in them are same
	}
}
