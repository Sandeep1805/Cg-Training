package Assignment5;

import org.springframework.stereotype.Controller;

@Controller
public class Employee {
   private Integer employeeid;
   private String employeename;
   private String employeeDepartment;
   private String employeeDesignation;
   private String  employeeSalary;
public Integer getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(Integer employeeid) {
	this.employeeid = employeeid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public String getEmployeeDepartment() {
	return employeeDepartment;
}
public void setEmployeeDepartment(String employeeDepartment) {
	this.employeeDepartment = employeeDepartment;
}
public String getEmployeeDesignation() {
	return employeeDesignation;
}
public void setEmployeeDesignation(String employeeDesignation) {
	this.employeeDesignation = employeeDesignation;
}
public String getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(String employeeSalary) {
	this.employeeSalary = employeeSalary;
}

   
   
}