package REST.SpringRESTassignments.Q8;

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
public class adminController {
	@Autowired
	private adminService ad;
	//Get all order
	@GetMapping("/product")
	public List<Product> getAllproducts(){
		return ad.getAll();
	}
	//place an order
	@PostMapping("/addproduct")
	public void addOrder(@RequestBody Product order) {
		ad.addOrder(order);
	}
	//Update an order
	@PutMapping("/product/{id}")
	public void updateOrder(@RequestBody Product o,@PathVariable int id) {
		ad.updateOrder(o, id);
	}
	
	//Delete an order
	@DeleteMapping("/deleteproducts")
	public void deleteAllOrder() {
		ad.deleteAllOrder();
	}

}
