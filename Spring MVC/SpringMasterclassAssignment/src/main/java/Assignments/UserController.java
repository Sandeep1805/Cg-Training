package Assignments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class UserController {
	@RequestMapping(value="/AssignmentQ3",method=RequestMethod.GET)
	public String showweb() {
		return  "Assignment3login";
	}
	@RequestMapping( value="/AssignmentQ3",method=RequestMethod.POST) //LOgin -this login for spring mvc
	public String Resultofwebpage(@ModelAttribute Usermodel model) {
		boolean run=model.isvalid(model.getPassword() ,model.getEmail() );
		if(!run) {
			return "error";}
			
		return "success";
		
		
}
}