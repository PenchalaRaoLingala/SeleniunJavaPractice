package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	SoftAssert softAssert = new SoftAssert();
  @Test
  public void softAssert() {
	  softAssert.assertTrue(false );
	  System.out.println("Soft assertion");
  }
  @Test
  public void hardAssertion() {
	  Assert.assertTrue(false);
	  System.out.println("Hard assertion");
  }
}
