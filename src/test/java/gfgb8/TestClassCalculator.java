package gfgb8;

import static org.junit.Assert.*;

import org.junit.Test;

import mypkg.MyCalculator;

public class TestClassCalculator {

	MyCalculator ob = new MyCalculator();
	@Test
	public void test_sum() {
		
		assertEquals(15, ob.sum(10, 5));
	}
	@Test
	public void test_sub() {
		
		assertEquals(5, ob.sub(10, 5));
	}
	@Test
	public void test_mul() {
		
		assertEquals(50, ob.mul(10, 5));
	}

}
