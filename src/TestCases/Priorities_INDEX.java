package TestCases;

import org.testng.annotations.Test;

public class Priorities_INDEX 
{
	@Test(priority = 0)
   void lanchApp()
   {
	   System.out.println("lanch Application");
   }
	
	@Test(priority = 1)
	void closeApp()
	{
		System.out.println("close Application");
	}
	
}
