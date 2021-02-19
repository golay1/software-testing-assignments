package Homework4;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem3TestFileParam {

	private Problem3Class prob3;
	
	@SuppressWarnings("unused")
	private static final Object[] Prob3parameters () {
		return $(
		);
	}

	@Before
	public void setUp () {
		prob3 = new Problem3Class();
	}
	
	@Test
	@FileParameters("src/Homework4/Problem3.csv")
	public void test(int testcaseNumber, double distance, int count, boolean greenLight_res, boolean yellowLight_res,
			boolean redLight_res, boolean buzzer_res, boolean brakes_res, int count_res, String bpNumber) {
		
		prob3.setCount(count);
		prob3.setBrakes(false);
		prob3.setRedLight(false);
		prob3.setYellowLight(false);
		prob3.setGreenLight(false);
		prob3.setBuzzer(false);
		prob3.setWarnings(distance);
		assertEquals(greenLight_res,prob3.isGreenLight());
		assertEquals(yellowLight_res,prob3.isYellowLight());
		assertEquals(redLight_res,prob3.isRedLight());
		assertEquals(buzzer_res,prob3.isBuzzer());
		assertEquals(brakes_res,prob3.isBrakes());
		assertEquals(count_res,prob3.getCount());
	}

}