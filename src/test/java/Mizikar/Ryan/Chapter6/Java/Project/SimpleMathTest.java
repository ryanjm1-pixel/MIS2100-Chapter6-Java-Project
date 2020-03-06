package Mizikar.Ryan.Chapter6.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {
	
	@Test
	public void testThatZeroNumeratorReturnsZero() {
		fail("Not yet implemented");
		SimpleMath MathObject2 = new SimpleMath();
		assertEquals(0,MathObject2.divide(0, 7), .001);
		
	}
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath MathObject3 = new SimpleMath();
		assertEquals(.25,MathObject3.divide(1, 4), .001);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath MathObject4 = new SimpleMath();
		MathObject4.divide(0,4);
	}

}
