package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import source.multi;
public class testMulti {

	@Test
	public void testMulti(){
		
		double a=2;
		double b=5;
		double expected=10;
		double result=multi.multi(a, b);
		assertEquals(expected, result, 0.00001);
		
	}
}
