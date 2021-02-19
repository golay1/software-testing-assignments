package Homework4;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem1TestJunit {

	private Problem1Class prob1;
	
	@SuppressWarnings("unused")
	private static final Object[] Prob1parameters () {
		return $(
//				Parameters are: (1,2,3,4,5)
//								1=member, 2=primeStatus, 3=cart, 4=rate_res
//				Test case 1
				$(true,		true,	5_000.00,	0.950),
//				Test case 2
				$(false,	true,	5_000.00,	0.975),
//				Test case 3
				$(true,		false,	5_000.00,	0.925),
//				Test case 4
				$(false,	false,	5_000.00,	0.965),
//				Test case 5
				$(true,		true,	4_999.99,	0.900),
//				Test case 6
				$(true,		false,	4_999.99,	0.950),
//				Test case 7
				$(false,	true,	4_999.99,	0.955),
//				Test case 8
				$(false,	false,	4_999.99,	0.985),
//				Test case 9
				$(true,		true,	0.00,		0.900),
//				Test case 10
				$(true,		true,	10000.00,	0.950)
		);
	}

	@Before
	public void setUp () {
		prob1 = new Problem1Class();
	}
	
	@Test
	@Parameters(method="Prob1parameters")
	public void test(boolean member, boolean primeStatus, double cart, double rate_res) {
		
		prob1.calcRate(member, primeStatus, cart);
		assertEquals(rate_res,prob1.calcRate(member,primeStatus,cart),0.001);
	}

}