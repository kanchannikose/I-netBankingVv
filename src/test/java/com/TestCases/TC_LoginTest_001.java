package com.TestCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;

import genericUtilities.BaseClass;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException
	{	
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
	
		lp.setPwd(password);
	
		lp.clickBtn();
		
        if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
        {
        	Assert.assertTrue(true);
        	System.out.println("it is passed");
       
        }
        else
        {
        	captureSceenshot("TC_LoginTest_001");
        	Assert.assertTrue(false);
        	System.out.println("it is failed");
       
        }
	}

}
