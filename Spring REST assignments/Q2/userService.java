package REST.SpringRESTassignments.Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class userService {
      public static List<user> a=new ArrayList<>();
         static {Arrays.asList(
              a.add(new user("Anirudh","ak47")),
    		  a.add(new user("Dharma","dk47")),
    		  a.add(new user("Junaid","jm47")),
    		  a.add(new user("Narasimha","nfs52"))
    		 
    		  );
             }
	public static  List<user> getallusers(){
    	  return a;
      }
	
	public String toValidate(String user1,String password1) {
		for (user user : a) {
			if(user1.equals(user.getUsername())){
				if(password1.equals(user.getPassword()))
					return "User is Valid";
			}
			else {
				return "User not Valid";
			}
		}
		return "Not a Valid Function";
		
	}
	@Override
	public String toString() {
		return "userService []";
	}
}
