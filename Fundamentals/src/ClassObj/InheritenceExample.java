package ClassObj;

public class InheritenceExample {

	public static void main(String[] args) {
		
		
final int val;
		
		val=6; //after 1st initialization value is final
		
	//	val++;
		
	//	val=9;
		
		
		
		
		
		

		 //create a Manager object and check sequence of constructor call
		 
//		 Manager m = new Manager();
//		 
//		 m.display();
	
		 Manager m1 = new Manager(101,"Ronit Roy",45000,10,5,"Sales",12000);
//		 m1.display();
//		 System.out.println(m1);//Overrides toString() Method
		 
		 
//		 System.out.println(m1.calcAnnSal());	//When the Manager class Overridden method is commented
		 									 	//it calls in Employee class calcAnnSal() method	
		 if(m1 instanceof Manager)
			  ((Manager)m1).delegate();//Type casting is done : 
			 else
				 System.out.println("object ob ="+m1.getEmpname()+" is not manager so not calling delegate() method");

		 
//		 
//		 System.out.println(m1.getTeamSize());
//		 System.out.println(m1.getMgrType());
//		 System.out.println(m1.getCommission());
		 
		 
		//Employee e = new Employee();
		 
		  // superclass ref = subclass object();
			
			 Employee ob = new Manager(102,"Manish Shah",15000,20,5,"HR",10000);
			 ob.display();
			 
			 //this line should be executed only when ob's runtime type is Manager
			 
			 if(ob instanceof Manager)
			  ((Manager)ob).delegate();
			 else
				 System.out.println("object ob ="+ob.getEmpname()+" is not manager so not calling delegate() method");

		 
		 
	}

}
