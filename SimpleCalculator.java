package testcode;
import appcode.SimpleCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleCalculatorTest {
	SimpleCalculator sc = new SimpleCalculator();

	
	@Test
	public void add() {
		int result = sc.add(1,4);
		assertEquals(5,result);
		
	}
	@Test
	public void sub() {
		int result = sc.sub(10,3);
		assertEquals(7,result);
		
	}
	@Test
	public void mul() {
		int result = sc.mul(3,3);
		assertEquals(9,result);
		
	}
	@Test
	public void div() {
		int result = sc.div(1,1);
		assertEquals(1,result);
		
	}

}
