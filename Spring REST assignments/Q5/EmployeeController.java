package REST.SpringRESTassignments.Q5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
    private EmployeeService empl;
	@GetMapping("/employe")
	public List<Employee> getAllemployees(){
		return empl.getAll();
	}
	@PostMapping("/placeemp")
	public void addemp(@RequestBody Employee e) {
		empl.addEmp(e);
	}
	@PutMapping("/emp/{id}")
	public void updateemp(@RequestBody Employee o,@PathVariable int id) {
		empl.updateEmp(o, id);
	}
	
	@DeleteMapping("/deleteemp")
	public void deleteAllemp() {
	empl.deleteAllEmp();
	}

}


