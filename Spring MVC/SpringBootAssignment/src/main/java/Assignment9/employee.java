package Assignment9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class employee {
	@RequestMapping(value="/Assignment9",method=RequestMethod.GET)
	public String run() {
		return "employ";
		
	}
	@RequestMapping(value="/Assignment9A" ,method=RequestMethod.POST)
	public String run1() {
		return "employ2";

}
	@RequestMapping(value="/Assignment9B" ,method=RequestMethod.POST)
	public String run2() {
		return "employ3";
}
}