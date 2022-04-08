package REST.SpringRESTassignments.Q6;

import org.springframework.stereotype.Service;

@Service
public class calculatorService {
 public int add(int a,int b) {
	 return a+b;
 }
 public int sub(int a,int b) {
	 return a-b;
 }
 public int mul(int a,int b) {
	 return a*b;
 }
 public double div(int a,int b) {
	 return a/b;
 }
}
