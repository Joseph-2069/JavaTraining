package ClassObject;

public class Employee {
	
	private double empSalary;
	private int empID,deptNo;
	private String empName;
	
	public Employee(int empID,String empName,double empSalary,int deptNo){
		this.empID = empID;
		this.empName=empName;
		this.empSalary = empSalary;
		this.deptNo = deptNo;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + ", deptNo=" + deptNo
				+ "]";
	}

	
	

}
