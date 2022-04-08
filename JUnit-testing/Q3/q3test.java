package q3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class q3test {
	operations obj;
	@BeforeAll
	 static void dis() {
		System.out.println("writing all annotations in testing");
	}
   @BeforeEach
	void initialize() {
    	obj=new operations();
    	}
   @AfterEach
   void clean() {
	   System.out.println("cleaning up ..");
   }
   @AfterAll
   static void after() {
	   System.out.println("this is afterall");
   }
	@Test
	void testadd() {
		
		int expect=5;
		int actual=obj.add(3,2);
		assertEquals(expect,actual);
		
	}
	@Test
	void testsub() {
		
		int expect=2;
		int actual=obj.sub(5,3);
		assertEquals(expect,actual);
		
	}
	@Test
	void testmul() {
	
		int expect=10;
		int actual=obj.mul(5,2);
		assertEquals(expect,actual);
		
	}
	@Test
	void testdiv() {
		
		int expect=10;
		int actual=obj.div(20,2);
		assertEquals(expect,actual);
		
	}

}
