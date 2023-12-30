package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Apputils.Apputils;

public class demo extends Apputils
{
	@Parameters({"email","subject"})
	@Test
	public void sendmail(String Mail, String subject)
	{
		System.out.println("Mail a send:"+Mail+"with subject line"+subject);
		
	}

}
