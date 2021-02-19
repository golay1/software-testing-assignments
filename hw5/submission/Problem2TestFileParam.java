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
public class Problem2TestFileParam {

	private Problem2Class prob2;
	
	@SuppressWarnings("unused")
	private static final Object[] prob2parameters () {
		return $(
		);
	}

	@Before
	public void setUp () {
		prob2 = new Problem2Class();
	}
	
	@Test
	@FileParameters("src/Homework5/Problem2.csv")
	public void test(int testcaseNumber, boolean existingMember, boolean validDiscount, int memberPoints, double total, 
			double expTotal_res, String bpNumber) {
		
		prob2.calcTotal(total, existingMember, validDiscount, memberPoints);
		assertEquals(expTotal_res,prob2.calcTotal(total, existingMember, validDiscount, memberPoints),0.01);
	}
}