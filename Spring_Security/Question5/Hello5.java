package Question5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello5 {
  @GetMapping("/admin")
  public String admin() {
	  return "hello admin";
  }
  @GetMapping("/user")
  public String user() {
	  return "Hello user";
  }
}
