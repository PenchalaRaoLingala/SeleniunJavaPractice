package TestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class ListenerImplClass {
	
  @Test
  public void testSuccess() {
	  Assert.assertTrue(true);
  }
  
  @Test
  public void testFail() {
	  Assert.assertTrue(false);
  }
}
