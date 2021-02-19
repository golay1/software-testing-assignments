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
public class Problem3TestFileParam {

	private Problem3Class prob3;
	
	@SuppressWarnings("unused")
	private static final Object[] prob3parameters () {
		return $(
		);
	}

	@Before
	public void setUp () {
		prob3 = new Problem3Class();
	}
	
	@Test
	@FileParameters("src/Homework5/Problem3.csv")
	public void test(int testcaseNumber, int boxInCarNum, int rrCarNum, int shipmentNum, 
			int boxNumInShip_res, String bpNumber) {
		
		prob3.calcPrevBoxNumber(boxInCarNum, rrCarNum, shipmentNum);
		assertEquals(boxNumInShip_res,prob3.calcPrevBoxNumber(boxInCarNum, rrCarNum, shipmentNum),1);
	}
}