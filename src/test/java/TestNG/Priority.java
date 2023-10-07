package TestNG;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=0)
	public void test1() {
		System.out.println("testcase 1");  
	}
	@Test(priority=1)
	public void test2() {
		System.out.println("testcase 2");  
	}
		@Test(priority=-3)
		public void test3() {
		System.out.println("testcase 3"); 
	}
		@Test(priority=-9)
		public void test4() {
		System.out.println("testcase 4"); 
	}
		@Test(priority=9)
		public void test5() {
		System.out.println("testcase 5"); 
	}
}
