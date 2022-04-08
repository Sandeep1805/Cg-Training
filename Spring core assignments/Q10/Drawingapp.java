package Q10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Drawingapp {
public static void main(String[] args) {
		
		ApplicationContext fac = new FileSystemXmlApplicationContext("src/Q10/spring.xml");
		Triangle triangle = (Triangle)fac.getBean("triangle");
		int e = triangle.draw(2);
		System.out.println(e);
		}
}
