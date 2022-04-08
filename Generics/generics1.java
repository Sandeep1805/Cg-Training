
import java.util.HashSet;
import java.util.Set;
class Employee
{
	int id,salary;
	String Name,Dept;
	public Employee(int empid,String empName, int empSalary, String empDept)
	{
		super();
		this.id=empid;
		this.Name=empName;
		this.salary=empSalary;
		this.Dept=empDept;
	}
	


	public String toString() {
		return "Employees [emloyee id=" + id + ", salary=" + salary + ", employee Name=" + Name + ", Deptartment=" + Dept+ "]";
	}
}


public class generics1{
	public static void main(String[] args)
	{
		Employee e1=new Employee(197,"Anirudh",50000,"Cloud");
		Employee e2=new Employee(243,"Junaid",55000,"Services");
		Employee e3=new Employee(129,"Dharma",65000,"Sales");
		Set<Employee> Emp= new HashSet<>();
		Emp.add(e1);
		Emp.add(e2);
		Emp.add(e3);
		for (Employee employees : Emp) {
			System.out.println(employees);
			
		}
	}
}
