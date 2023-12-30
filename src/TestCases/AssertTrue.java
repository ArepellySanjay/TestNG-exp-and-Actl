package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue 
{
    @Test
	void test1()
	{
		boolean actress = true;
		Assert.assertTrue(actress);
		
		//output:pass;
	}
	
   /* admin login working or not?
    login as admin and check admin link are avalable or not
    exp:true;  actl:true;  TestCase:pass
    admin link should be display*/
    
	
	@Test
	void test2()
	{
		boolean sanju = false;
		Assert.assertTrue(sanju);
		
		//output:fail;
		
	}
	
}
