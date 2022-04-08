package Assignment10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Employees {
	@RequestMapping(value="/Assignment10",method=RequestMethod.GET)
	public String run() {
		return "index";
	}
	@RequestMapping(value="/Assignment10",method=RequestMethod.POST)
	public String run1() {
		return "assignment10";
	}
}