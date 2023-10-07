package TestNG;

import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount = 10)
  public void testcase() {
	  System.out.println("Welcome to Hyderabad!");
  }
}
