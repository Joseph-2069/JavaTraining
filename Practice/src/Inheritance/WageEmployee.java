package Inheritance;

public class WageEmployee extends Employee{

		private int deptid;
		private double dailyWage;
		private int daysWorked;
		
		WageEmployee(){
			super();
			System.out.println("WageEmployee Constructor called.......");
		}
		WageEmployee(int empID , String empName , double empSalary,int deptNo,double perc,int deptid,double dailyWage,int daysWorked){
			super(empID , empName ,empSalary,deptNo,perc);
			System.out.println("Parameterised Constrictir called......");
			this.deptid = deptid;
			this.dailyWage = dailyWage;
			this.daysWorked =daysWorked;
		}
		
		public int getdeptid() {
			return this.deptid;
		}
		public double getDailyWage() {
			return this.getDailyWage();
			
		}
		public double setDailyWage( double wage) {
			return this.dailyWage += wage;
		}
		public int getdaysWorked() {
			return this.daysWorked;
		}
		
		
		
		@Override
		public String toString() {
			return "Dept ID: "+ this.deptid+" Daily Wage "+ this.dailyWage+" Days Worked "+this.daysWorked;
		}
		@Override
		public double CalcAnnualSalary() {
			//Annual salary + the extra wage that the employee is earning is calculated here
			return super.CalcAnnualSalary()+this.dailyWage*this.daysWorked;
		}
}
