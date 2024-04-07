package mytest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTestClass {	
	MyClass ob = new MyClass();
	@Test
	public void testSum() {
		assertEquals(30, ob.sum(20, 10));
	}
	@Test
	public void testDiff() {
		assertEquals(10, ob.diff(20, 10));
	}
	@Test
	public void testMul() {
		assertEquals(200, ob.mul(20, 10));
	}
	@Test
	public void testDiv() {
		assertEquals(2, ob.div(20, 10));
	}
}
