package mypkg3;

import org.junit.Test;

import mypkg3.MyCalc;

public class MyCalcTest {

	@Test
	public void test() {
		MyCalc ob = new MyCalc();
		
           assertEquals(25, ob.sum(20, 5));	
           assertEquals(10, ob.sum(20, 5));	
	}

	private void assertEquals(int i, int sum) {
		// TODO Auto-generated method stub
		
	}

}