package REST.SpringRESTassignments.Q1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworldcontroller {
  @RequestMapping("/hello")
  public String dispaly() {
	  return "Hello World!";
  }
}
