package Inheritance;

public class Employee {
//	wap to calc the raise in the salary of emp
//	of 0.2 % which is the incentive
	private int empID;
	private String empName;
	private double empSalary;
	private int deptNo;
	public double perc;
	
	
	/*
	 * What is a constructor?
	 * It is called when an instance of the class is created. 
	 * At the time of calling constructor, memory for the object is allocated in the memory.
	 * It is a special type of method which is used to initialize the object.
	 * */
	
	
	
	
	// Default constructor is needed to invoke the class for inheritence
	public Employee() {
		System.out.println("Employee constructor is called");
	}
	
	
	
	public Employee(int empID , String empName , double empSalary,int deptNo,double perc) {//Parameterized constructors 
		
		System.out.println("Employee parameterized constructor was called............................");
		this.empID = empID; // this keyword is used to assign value to the variable which are hidden 
		this.empName= empName;
		this.empSalary = empSalary;
		this.deptNo= deptNo;
		this.perc =perc;
	}
	
//	--------COPY CONSTRUCTOR---------- 
//	The values of Employee e are taken as parameter and hence the values of Employee e are copied here
	
	public Employee(Employee e){
		this.empID = e.getID();
		this.empName = e.getName();
		this.empSalary=e.getSalary();
		this.deptNo= e.getDeptNo();
					
	}
	//to achieve encapsulation we use getters and setters
	//getters and setters are used to access variables that are hidden from the user
	// getXXXX is used to get the value that we 
	// setXXXX is used to set the value that we
	
	

//Encapsulation is a way to restrict the direct access to some components of an object, 
//	so users cannot access state values for all of the variables of a particular object. 
//	Encapsulation can be used to hide both data members and data functions or methods associated 
//	with an instantiated class or object.
	
	public int getID() {
		return this.empID;
	}
	
	
	public String getName() {
		return this.empName;
	}
	
	
	public void setName(String name) {
		this.empName= name;
	}
	
	
	public double getSalary() {
		return this.empSalary;
	}
	public void setSalary( double amt) {
		if(amt>0) {
			this.empSalary =amt;
		}else {
			System.out.println("Enter a valid amount");
		}
	}
	public int getDeptNo() {
		return this.deptNo;
	}
	public double CalcAnnualSalary() {
		return (this.empSalary*12);
	}
	
	
	public void display() {
		System.out.println("Employee ID: "+this.empID+" Employee Name: "+this.empName+" Employee Salary "+this.empSalary);
	}
	
	public double IncentiveWithSal() {
		return this.CalcAnnualSalary() + this.CalcAnnualSalary()*(this.perc/100);
	}
	
	
	
//OVERLOADING
	
//	Method Overloading: Multiple methods having same name but different parameters.
	
	public double CalcAnnualSalary(double bonus) {
		return this.empSalary*12 + bonus;
	}
	
@Override
public String toString() {
	return ("Employee ID: "+this.empID+" Employee Name: "+this.empName+" Employee Salary "+this.empSalary);
}
}
