package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertEquals 
{
	/*  @Test
	public void test1()
	{
		 String expval,actval;
		 expval = "Google";
		 actval = "GooGle";
		
		 Assert.assertEquals(actval.toLowerCase(), expval.toLowerCase());
	}
	
    @Test
	public void test2()
	{
		 String expval,actval;
		 expval = "Google";
		 actval = "Gmail";
		
		 Assert.assertEquals(actval.toLowerCase(), expval.toLowerCase());
	}*/
	
	
	@Test
	public void test1() 
	{
	
		String exe,act;
		exe = "GOOgLE";
		act = "GOOGLE";
		
		Assert.assertEquals(exe.toUpperCase(), act.toUpperCase());
		
		
	}
	
	
	
	
	
	
	
	
	
	
}


   
















	
	

