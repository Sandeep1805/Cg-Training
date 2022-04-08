package Assignments;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class SimpleInterestController {
	@RequestMapping( value="/AssignmentQ2",method=RequestMethod.GET) 
    public String showPage( ) {
		
	    
		return "SimpleInterest";
	}
	@RequestMapping( value="/AssignmentQ2",method=RequestMethod.POST)
	public String result(@RequestParam Integer principalAmount,@RequestParam Integer RateofInterest,@RequestParam Integer Time , ModelMap model) {
		model.put("principalAmount", principalAmount);
		model.put("RateofInterest", RateofInterest);
		model.put("Time", Time);
		return "SimpleInterestResult";
	}
}