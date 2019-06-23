package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Mytest {

	Checking check;
	String output;
	@BeforeEach
	public void test1() {
		 check=new Checking();
	}
	@Test
	void test() {
		
		 output=check.checks("ABCD");
		assertEquals("BCD",output);
	}
	
	@Test
	void test2() {
		
		 output=check.checks("AACD");
		assertEquals("CD",output);
	}
	@Test
	void test3() {
		
		 output=check.checks("BBAA");
		assertEquals("BBAA",output);
		
	}
	@Test
	void test4() {
		
		 output=check.checks("AABAA");
		assertEquals("BAA",output);
		
	}
	

}
