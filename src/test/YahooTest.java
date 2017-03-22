package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooTest {
	
	
  @BeforeSuite
  public void initializeSelenium(){
	  System.out.println("In the very beginning:initialise selenium");
  }
  
  @AfterSuite
  public void shutDownSelenium(){
	  System.out.println("Destroy Selenium");
  }
	
  @BeforeTest
  public void beforeTest(){
	  System.out.println("Connection to DB");
  }
  
  @AfterTest
  public void afterTest(){
	  System.out.println("closing db");
  }
  
  @BeforeMethod
  public void openBrowser(){
	  System.out.println("Opening browser");
  }
  
  @AfterMethod
  public void closeBrowser(){
	  System.out.println("closing browser");
  }
  
  
  @Test
  public void testRecieveMail() {
	  System.out.println("Testing receiving mail");
  }
  
  @Test
  public void testSendMail(){
	  System.out.println("Testing sending mail");
  }
}
