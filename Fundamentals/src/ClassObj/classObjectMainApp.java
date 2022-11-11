package ClassObj;

public class classObjectMainApp {

	public static void main(String[] args) {
		Employee e = null;
		e= new Employee(1,"Joseph",35000,103);
		
		e.display();
		
		System.out.println(e);
				
				System.out.println(e.getEmpid());
				System.out.println(e.getSalary());
				System.out.println(e.getEmpname());
				
	}
}
