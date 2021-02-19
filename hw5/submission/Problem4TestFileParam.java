package Homework5;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.easymock.EasyMock;

@RunWith(JUnitParamsRunner.class)
public class Problem4TestFileParam {

	Problem4ServerData mockobj;//declare mockobj
	private Problem4Class prob4;
	
	@SuppressWarnings("unused")
	private static final Object[] prob4parameters () {
		return $(
		);
	}

	@Before
	public void setUp () {
		prob4 = new Problem4Class();
		mockobj=EasyMock.strictMock(Problem4ServerData.class);//construct mockobj
	}
	
	@Test
	@FileParameters("src/Homework5/Problem4.csv")
	public void test(int testcaseNumber, boolean existingMember, boolean validDiscount, int memberPoints, double total, 
			double expTotal_res, String bpNumber) {
		
		EasyMock.expect(mockobj.getMemberPoints()).andReturn(memberPoints);
		EasyMock.replay(mockobj);
		prob4.calcTotal(total, existingMember, validDiscount, mockobj);
		assertEquals(expTotal_res,prob4.calcTotal(total, existingMember, validDiscount, mockobj),0.01);
	}
}