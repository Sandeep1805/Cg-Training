package REST.SpringRESTassignments.Q8;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class adminService {
	@Autowired
	adminrepo admRepo;
	public static List<Product> s=new ArrayList<>();
	void createOrder() {
		admRepo.save(new Product(1,"powerbank",1500));
		admRepo.save(new Product(2,"headphones",1000));
		admRepo.save(new Product(4,"speakers",2000));
		admRepo.save(new Product(3,"keyboard",500));
		admRepo.save(new Product(5,"spectacles",1500));
		}
	//Getting order
	public List<Product> getAll(){
		createOrder();
		return admRepo.findAll();
	}
	//Getting specific Order
	public Product getOrder(int id) {
		return admRepo.findOne(id);
	}
	//Placing Order
	public void addOrder(Product o) {
		admRepo.save(o);
	}
	//Updating Order
	public void updateOrder(Product odr,int id) {
		if(id==odr.getId()) {
			admRepo.save(odr);
		}
	}
	//Deleting an order
	public void deleteAllOrder() {
		admRepo.deleteAll();
	}

}
