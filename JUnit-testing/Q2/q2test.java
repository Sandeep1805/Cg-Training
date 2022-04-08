package q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class q2test {


	 @Test
	    public void testAcctNo() throws Exception {
	        Withdraw a = new Withdraw();
	        int expected = 500;
	        int result = (int) a.withdraw(1500);
	        assertEquals(expected, result);
	        }

}