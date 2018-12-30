package com.inetbanking.testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	
	public void LoginTest()
	{
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		
		           lp.setUserName(username);
		           		           
		           lp.setPassword(password);		           
		         
		           lp.clickSubmit();		           
		           
		if(driver.getTitle().equals(exptitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
					
	}
	 
	 
}
