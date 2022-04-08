package Q2;

import java.util.*;

public class Question {
   int qId;
   String qu;
   List<String> ans1;
   Set<String> ans2;
   Map<Integer, String> ans3;
   
   public int getqId() {
	return qId;
}
public void setqId(int qId) {
	this.qId = qId;
}

public String getQu() {
	return qu;
}
public void setQu(String qu) {
	this.qu = qu;
}
public List<String> getAns1() {
	return ans1;
}
public void setAns1(List<String> ans1) {
	this.ans1 = ans1;
}
public Set<String> getAns2() {
	return ans2;
}
public void setAns2(Set<String> ans2) {
	this.ans2 = ans2;
}
public Map<Integer, String> getAns3() {
	return ans3;
}
public void setAns3(Map<Integer, String> ans3) {
	this.ans3 = ans3;
}


}