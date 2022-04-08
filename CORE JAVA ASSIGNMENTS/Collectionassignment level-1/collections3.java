package cquestion3;
import java.util.*;
import java.util.Comparator;
import java.util.Scanner;
class Employee
{
	int ID,salary;
	String name,dept;
	public Employee(int id, String name, String dept, int salary) {
		this.ID=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public void set(int id) {
		this.ID = id;
	}
	public int get() {
		return ID;
	}
	
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getdept() {
		return dept;
	}
	public void setdept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return "Employee [id=" + ID + ", salary=" + salary + ", name=" + name + ", dept=" + dept + "]";
	}
	
}
class idComp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.get()-o2.get();
	}
}
class nameComp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getname().compareTo(o2.getname());
	}
}
class deptComp implements Comparator<Employee>{
    public int compare(Employee o1, Employee o2){
        return o1.getdept().compareTo(o2.getdept());
    }
}
class salaryComp implements Comparator<Employee>{
    public int compare(Employee o1, Employee o2){
        return o1.getsalary()-o2.getsalary();
    }
}
public class collections3 {
public static void main(String[] args) {
	System.out.println("Choose any option below\n a)ID \n b)name \n c)department \n d) salary");
	Scanner s=new Scanner(System.in);
	String c=s.next();
	s.close();
	if(c.equals("a")) {
		TreeSet<Employee> employee=new TreeSet<Employee>(new  idComp());
		employee.add(new Employee(78,"james","IT",56000));
		employee.add(new Employee(80,"barn","sales",80000));
		employee.add(new Employee(57,"jjthomson","marketing",40000));
		employee.add(new Employee(12,"stephen","business",78000));
		employee.add(new Employee(23,"hawk","managment",96000));
		employee.add(new Employee(63,"peter","development",42000));
		employee.add(new Employee(90,"rogers","testing",120000));
		employee.add(new Employee(56,"robert","safety",20000));
		employee.add(new Employee(87,"tony","security",30000));
		employee.add(new Employee(98,"stark","HR",560000));
		for(Employee empl: employee) {
			System.out.println(empl.toString());
		}
	}
		else if(c.equals("b")) {
			TreeSet<Employee> employee=new TreeSet<Employee>(new  nameComp());
		employee.add(new Employee(78,"james","IT",56000));
		employee.add(new Employee(80,"barn","sales",80000));
		employee.add(new Employee(57,"jjthomson","marketing",40000));
		employee.add(new Employee(12,"stephen","business",78000));
		employee.add(new Employee(23,"hawk","managment",96000));
		employee.add(new Employee(63,"peter","development",42000));
		employee.add(new Employee(90,"rogers","testing",120000));
		employee.add(new Employee(56,"robert","safety",20000));
		employee.add(new Employee(87,"tony","security",30000));
		employee.add(new Employee(98,"stark","HR",560000));
		for(Employee empl: employee) {
			System.out.println(empl.toString());
		}
		}
		else if(c.equals("c")) {
			TreeSet<Employee> employee=new TreeSet<Employee>(new  deptComp());
		employee.add(new Employee(78,"james","IT",56000));
		employee.add(new Employee(80,"barn","sales",80000));
		employee.add(new Employee(57,"jjthomson","marketing",40000));
		employee.add(new Employee(12,"stephen","business",78000));
		employee.add(new Employee(23,"hawk","managment",96000));
		employee.add(new Employee(63,"peter","development",42000));
		employee.add(new Employee(90,"rogers","testing",120000));
		employee.add(new Employee(56,"robert","safety",20000));
		employee.add(new Employee(87,"tony","security",30000));
		employee.add(new Employee(98,"stark","HR",560000));
		for(Employee empl: employee) {
			System.out.println(empl.toString());
		}
			
		}
		else {
			TreeSet<Employee> employee=new TreeSet<Employee>(new  salaryComp());
			employee.add(new Employee(78,"james","IT",56000));
			employee.add(new Employee(80,"barn","sales",80000));
			employee.add(new Employee(57,"jjthomson","marketing",40000));
			employee.add(new Employee(12,"stephen","business",78000));
			employee.add(new Employee(23,"hawk","managment",96000));
			employee.add(new Employee(63,"peter","development",42000));
			employee.add(new Employee(90,"rogers","testing",120000));
			employee.add(new Employee(56,"robert","safety",20000));
			employee.add(new Employee(87,"tony","security",30000));
			employee.add(new Employee(98,"stark","HR",560000));
			for(Employee empl: employee) {
				System.out.println(empl.toString());
		}
		
	}
		
}

	}
