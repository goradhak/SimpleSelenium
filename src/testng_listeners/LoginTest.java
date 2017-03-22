package testng_listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority=1)
	public void login(){
		
		System.out.println("Start");
		
		try{
			Assert.assertEquals("A", "B");
		} catch(Throwable t){
			System.out.println("error");
			
		}
		
		System.out.println("end");		
	}
	
	@Test(priority=2)
	public void adminLogin(){
		
	}

}
