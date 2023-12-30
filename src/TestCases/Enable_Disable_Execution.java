package TestCases;

import org.testng.annotations.Test;

public class Enable_Disable_Execution 
{

	@Test
	void test1()
	{
		System.out.println("this is test case1");
	}
	
	@Test
	void test2()
	{
		System.out.println("this is test case2");
	}
	
	@Test(enabled = false)
	void test3()
	{
		System.out.println("this is test case3");
	}
}
