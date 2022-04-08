package REST.SpringRESTassignments.Q5;

public class Employee {
	int empid;
	String empname;
	String empdept;
	String designation;
	double salary;
	
	public Employee(int empid, String empname, String empdept, String designation, double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdept() {
		return empdept;
	}

	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + ", designation="
				+ designation + ", salary=" + salary + "]";
	}

	
	

}
