package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNewsTest {
 
	
  @BeforeTest
  public void xyz(){
	  System.out.println("Before executing yahoo news test");
  }
  
  @Test
  public void testNews(){
	  System.out.println("Executing yahoo news test");
	  
  }
  
}
