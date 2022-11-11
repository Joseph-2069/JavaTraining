package ArrayEx;

public class EmpArray {

	public static void main(String[] args) {
		Employee[] arr = new Employee[3];
		arr[0] = new Employee(1,"Joseph",1234567,10);
		arr[1] = new Employee(2,"Joe",123456,11);
		
		for(Employee e: arr) {
			if(e!=null) {
				System.out.println(e);
//				System.out.println(e.calcAnnSal());
			}
		}
	}

}
