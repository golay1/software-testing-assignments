package Homework4;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem4TestFileParam {

	private Problem4Class prob4;
	
	@SuppressWarnings("unused")
	private static final Object[] prob4parameters () {
		return $(
		);
	}

	@Before
	public void setUp () {
		prob4 = new Problem4Class();
	}
	
	@Test
	@FileParameters("src/Homework4/Problem4.csv")
	public void test(int testcaseNumber, double cart, boolean firstTimeBuyer, boolean goldStatus, int bonusPoints, double taxRate,
			double total_res, boolean memberBonus_res, String bpNumber) {
		
		prob4.setTotal(0);
		prob4.setMemberBonus(false);
		prob4.determineMemberBonus(cart, firstTimeBuyer, goldStatus, bonusPoints, taxRate);
		assertEquals(total_res,prob4.getTotal(),0.01);
		assertEquals(memberBonus_res,prob4.isMemberBonus());
	}
}