package Inheritance;

public class Manager extends Employee{
	private int teamSize;
	private String ManDept;
	private double commission;
	public Manager() {
//		1)super can be used to refer immediate parent class instance variable.
//		2)super can be used to invoke immediate parent class method.
//		3)super() can be used to invoke immediate parent class constructor.
		super();
		System.out.println("Manager constructor is called");
	}
    Manager(int empID , String empName , double empSalary,int deptNo, double perc ,int teamSize , String ManDept, double commission)  {
//		3)super() can be used to invoke immediate parent class constructor.
    	super(empID,empName,empSalary,deptNo,perc);
    	System.out.println("Manager parameterized constructor is called");
		this.teamSize =teamSize ;
		this.ManDept=ManDept;
		this.commission = commission;
		
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getManDept() {
		return ManDept;
	}
	public void setManDept(String manDept) {
		ManDept = manDept;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
//	@Override
//	public void display() {
//		System.out.println("Manager Department "+this.ManDept+" Teamsize "+this.teamSize+" Commision "+this.commission);
//	}
//	
//	@Override
////	Overriding is a function that requires a subclass or child class to provide a variety of method implementations, 
////	that are already provided by one of its superclasses or parent classes, in any object-oriented programming language.
//	public String toString() {
//		return ("Manager Department "+this.ManDept+" Teamsize "+this.teamSize+" Commision "+this.commission);
//	}
	
	
	@Override   // METHOD DEFINITION CANNOT BE CHANGED
//	2)super can be used to invoke immediate parent class method.
	public double CalcAnnualSalary(double sal) {
		return(super.CalcAnnualSalary())+this.commission;
	}

	@Override 
	public double IncentiveWithSal() {
		return this.CalcAnnualSalary() + this.CalcAnnualSalary()*(super.perc)/100;
	}

}
