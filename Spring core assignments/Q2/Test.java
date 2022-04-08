package Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new FileSystemXmlApplicationContext("src/Q2/q2.xml");
	Question q=(Question) context.getBean("ques");
	System.out.println("Question id is"+q.getqId());
	System.out.println(q.getQu());
	System.out.println("Answers in list form is:");
	for(String w:q.getAns1()) {
		System.out.println(w);
	}
	System.out.println("Answers in set form is:");
	for(String w:q.getAns2()) {
		System.out.println(w);
	}
	System.out.println("Answers in map form is :");
	System.out.println(q.getAns3());
	
}
}
