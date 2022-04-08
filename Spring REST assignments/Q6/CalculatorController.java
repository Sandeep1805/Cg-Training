package REST.SpringRESTassignments.Q6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
 @Autowired
 private calculatorService gh;
 
 @RequestMapping("/addition")
 public int getaddnum() {
	 return gh.add(45, 9);
 }
 @RequestMapping("/subtraction")
 public int getsub() {
	 return gh.sub(54, 9);
 }
 @RequestMapping("/multiply")
 public int getmul() {
	 return gh.mul(3, 4);
 }
 @RequestMapping("/division")
 public double getdiv() {
	 return gh.div(30, 10);
 }
 
}
