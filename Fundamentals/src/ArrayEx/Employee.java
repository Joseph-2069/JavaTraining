package ArrayEx;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	private int deptno;
	
	public Employee() {
		System.out.println("Employee Constructor Called");
		this.empid=11;
		this.deptno=10;
		this.name="xyz";
		this.salary=100;
	}

	public Employee(int empid,String name,double salary,int deptno){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.deptno = deptno;
		
	}
	

	public String getEmpname() {
		return name;
	}
	
	public void setEmpname(String empname) {
		this.name = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		
		if(salary > 0)
		{
		  this.salary = salary;
		}
		else
		{
			System.out.println("Slary can't be 0 or less than 0");
		}
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getEmpid() {
		return empid;
	}
	
	public void display()
	{
		//this
		System.out.println("details:"+this.empid+","+this.name+","+this.salary+","+this.deptno);
		System.out.println(empid+","+this.name+","+this.salary+","+this.deptno);
		
		
	}
	
	
	
	@Override
	public String toString()
	{
		return "details:"+this.empid+","+this.name+","+this.salary+","+this.deptno;
	}
	
	
	public double calcAnnSal()
	{
		System.out.println("calculate annual salary of Employee called..");
		return this.salary * 12;
	}
	
	//function overloading  - static/compile time polymorphism
	public double calcAnnSal(double bonus)
	{
		return (this.salary * 12)+bonus;
	}

	private void setEmpid(int empid)
	{
		this.empid=empid;
	}
}