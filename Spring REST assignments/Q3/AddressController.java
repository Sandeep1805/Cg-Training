package REST.SpringRESTassignments.Q3;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddressController {

	 
	
	@RequestMapping(value="/Address",method=RequestMethod.GET)
	public List<Address> getaddr(){
	
		return Arrays.asList(
	
   		 new Address("AndhraPradesh","Vizag","India",531345),
   		 new Address("Tamilnadu","Chennai","India",456732),
   		 new Address("Karnataka","Banglore","India",567843),
   		 new Address("Maharastra","Mumbai","India",908765),
   		 new Address("Telangana","Hyderabad","India",897654)
   		 ); 
	}
   
    @RequestMapping(value="/Address/{n}", method=RequestMethod.GET)
    public Address getZipCode(@PathVariable("n") long pincode) {
	     Address b=new Address("AndhraPradesh","Vizag","India",531345);
	     b.setZipcode(pincode);
	     return b;
	     
	    
	}
}
