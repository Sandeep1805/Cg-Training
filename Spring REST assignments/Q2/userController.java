package REST.SpringRESTassignments.Q2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
	@Autowired
	private userService b;
	
	
	@SuppressWarnings("static-access")
	@GetMapping("/allusers")
	public List<user> getUser(){
		return b.getallusers();
	}
	@PostMapping("/admin")
	public String toValidate(@RequestBody user newuser) {
		return b.toValidate(newuser.getUsername(), newuser.getPassword());
	}
}
