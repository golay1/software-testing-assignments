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
public class Problem5TestFileParam {

	private Problem5Class prob5;
	
	@SuppressWarnings("unused")
	private static final Object[] prob5parameters () {
		return $(
		);
	}

	@Before
	public void setUp () {
		prob5 = new Problem5Class();
	}
	
	@Test
	@FileParameters("src/Homework4/Problem5.csv")
	public void test(int testcaseNumber, double x, double y_res, String bpNumber) {
		
		prob5.setY(0);
		prob5.calcY(x);
		assertEquals(y_res,prob5.getY(),0.001);
	}
}