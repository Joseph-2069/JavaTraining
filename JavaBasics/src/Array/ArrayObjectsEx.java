package Array;

import java.util.Scanner;

public class ArrayObjectsEx {
	public static void main(String[] args) {
		
		
		
		Employee [] Emp = new Employee[5];
		Emp[0]= new Employee(1,"Srushti",25000,101);;
		Emp[1]=  new Employee(2,"Paradox",15000,102);;
		Emp[2]=new Employee(3,"Spectra",20000,103);
		
		for(Employee a:Emp) {
			System.out.println(a);
		}
		
	}
}
