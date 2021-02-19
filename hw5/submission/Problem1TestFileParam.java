package Homework5;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem1TestFileParam {

	private Problem1Class prob1;
	
	@SuppressWarnings("unused")
	private static final Object[] prob1parameters () {
		return $(
		);
	}

	@Before
	public void setUp () {
		prob1 = new Problem1Class();
	}
	
	@Test
	@FileParameters("src/Homework5/Problem1.csv")
	public void test(int testcaseNumber, boolean deepDish, double ordAmount, int numPizzas, 
			boolean specialOrderStatus_res, double total_res, String bpNumber) {
		
		prob1.setTotal(0);
		prob1.setSpecialOrderStatus(false);
		prob1.specialOrder(deepDish, ordAmount, numPizzas);
		assertEquals(total_res,prob1.getTotal(),0.01);
		assertEquals(specialOrderStatus_res,prob1.isSpecialOrderStatus());
	}
}