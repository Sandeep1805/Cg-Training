package REST.SpringRESTassignments.Q9;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import REST.SpringRESTassignments.Q9.Customer;
import REST.SpringRESTassignments.Q9.CustomerRepo;
@Service
public class CustomerService {
	@Autowired
	CustomerRepo admRepo;
	public static List<Customer> s=new ArrayList<>();
	void createOrder() {
		admRepo.save(new Customer(1,"Anirudh",21,"Male"));
		admRepo.save(new Customer(2,"Dharma",22,"Male"));
		admRepo.save(new Customer(4,"Junaid",21,"Male"));
		admRepo.save(new Customer(3,"Harsha",20,"Male"));
		admRepo.save(new Customer(5,"Sai",21,"Male"));
		}
	//Getting order
	public List<Customer> getAll(){
		createOrder();
		return admRepo.findAll();
	}
	//Getting specific Order
	public Customer getCustomer(int id) {
		return admRepo.findOne(id);
	}
	//Placing Order
	public void addCustomer(Customer o) {
		admRepo.save(o);
	}
	//Updating Order
	public void updateCustomer(Customer odr,int id) {
		if(id==odr.getId()) {
			admRepo.save(odr);
		}
	}
	//Deleting an order
	public void deleteAllOrder() {
		admRepo.deleteAll();
	}

}
