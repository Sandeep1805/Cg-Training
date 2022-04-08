import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class test_5 {

	@Test
	void test() {
		Q1 m=new Q1();
		int[] expect= {45,87};
		int b[]= {45,54,56,65,74,87};
		int[] actual=m.minmaxFinder(b);
		assertArrayEquals(expect, actual);	
}
}