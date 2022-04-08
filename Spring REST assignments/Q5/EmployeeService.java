package REST.SpringRESTassignments.Q5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import REST.SpringRESTassignments.Q5.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;
	public static List<Employee> emps=new ArrayList<>();
	void createEmp() {
        empRepo.save(new Employee(1,"Anirudh","Cyber","Developer",75000));
        empRepo.save(new Employee(2,"Junaid","Tax","Accountant",45100));
        empRepo.save(new Employee(3,"Dharma","Development","Developer",55000));
        empRepo.save(new Employee(4,"Harsha","Testing","Analyst",45000));
			}
	public List<Employee> getAll(){
		createEmp();
		return empRepo.findAll();
	}
	public Employee getEmp(int id) {
		return empRepo.findOne(id);
	}
	public void addEmp(Employee o) {
		empRepo.save(o);
	}
	public void updateEmp(Employee odr,int id) {
		if(id==odr.getEmpid()) {
			empRepo.save(odr);
		}
	}
	public void deleteAllEmp() {
		empRepo.deleteAll();
	}

}