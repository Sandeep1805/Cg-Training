package REST.SpringRESTassignments.Q9;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import REST.SpringRESTassignments.Q9.Customer;
import REST.SpringRESTassignments.Q9.CustomerService;
@RestController
public class CustomerController {
	@Autowired
	private CustomerService ad;
	//Get all order
	@GetMapping("/customer")
	public List<Customer> getAllCustomers(){
		return ad.getAll();
	}
	//place an order
	@PostMapping("/addcustomer")
	public void addOrder(@RequestBody Customer order) {
		ad.addCustomer(order);
	}
	//Update an order
	@PutMapping("/Customer/{id}")
	public void updateOrder(@RequestBody Customer o,@PathVariable int id) {
		ad.updateCustomer(o, id);
	}
	
	//Delete an order
	@DeleteMapping("/deleteCustomers")
	public void deleteAllOrder() {
		ad.deleteAllOrder();
	}

}


