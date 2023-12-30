package Apputils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Apputils 
{
	
	@BeforeTest
	public void login() 
	{
		System.out.println("Gmail login");
		
	}
	
    @AfterTest
	public void logout() 
	{
		System.out.println("Gmail logout");
	}
	@BeforeSuite
	public void lanchApp() 
	{
		
		System.out.println("lanch Gmail App");
		
	}
	
	@AfterSuite
	public void closeApp() 
	{
	
		System.out.println("close the App");
		
	}
}
