package Assignments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HelloWorldController {
	@RequestMapping(value="/AssignmentQ1",method=RequestMethod.GET)
	public String showweb() {
		return "HelloWorld";
	}

}