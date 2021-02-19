package Homework4;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem2TestParameterized {

	private Problem2Class prob2;
	private Problem2ClassStatus status;
	private double temp,pressure;
    private boolean HPCell_res;

    @Before
	public void setUp() throws Exception {
		prob2 = new Problem2Class();
	}

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
//			Parameters are: (1,2,3,4)
//			1=status, 2=temp, 3=pressure, 4=HPCell_res
//			Test case 1
            {Problem2ClassStatus.NorthernHemisphere,	120.1,	30.5,	true}, 
//			Test case 2
            {Problem2ClassStatus.SouthernHemisphere,	80.0,	31.1,	true},              
//			Test case 3
            {Problem2ClassStatus.NorthernHemisphere,	120.0,	30.6,	true}, 
//			Test case 4
            {Problem2ClassStatus.SouthernHemisphere,	79.9,	31.1,	false},
//			Test case 5
            {Problem2ClassStatus.NorthernHemisphere,	120.0,	39.1,	false},
//			Test case 6
            {Problem2ClassStatus.SouthernHemisphere,	80.0,	39.6,	false},
//			Test case 7
            {Problem2ClassStatus.NorthernHemisphere,	120.0,	30.5,	false},
//			Test case 8
            {Problem2ClassStatus.SouthernHemisphere,	80.0,	31.0,	false},
//			Test case 9
            {Problem2ClassStatus.NorthernHemisphere,	120.0,	39.0,	true},
//			Test case 10
            {Problem2ClassStatus.SouthernHemisphere,	80.0,	39.5,	true},
//			Test case 11
            {Problem2ClassStatus.NorthernHemisphere,	0.0,	39.1,	false},
//			Test case 12
            {Problem2ClassStatus.NorthernHemisphere,	150.0,	39.1,	true},
//			Test case 13
            {Problem2ClassStatus.NorthernHemisphere,	120.0,	0.0,	false},
//			Test case 14
            {Problem2ClassStatus.NorthernHemisphere,	120.0,	40.0,	false}
       });
    }

    public Problem2TestParameterized(Problem2ClassStatus status, double temp, double pressure, boolean HPCell_res) {
    	this.status=status;
    	this.temp=temp;
    	this.pressure=pressure;
    	this.HPCell_res=HPCell_res;
    }
	@Test
	public void test() {
		prob2.highPressCell(status, temp, pressure);
		assertEquals(HPCell_res, prob2.highPressCell(status, temp, pressure));
		}
}