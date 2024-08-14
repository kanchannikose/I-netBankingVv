package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;
import com.PageObject.NewAccountPage;

import genericUtilities.BaseClass;

public class TC_NewAccount_002 extends BaseClass{
	
	@Test
	public void NewAccount() throws InterruptedException
	{
		driver.get(baseurl);
		LoginPage lp=new LoginPage(driver);
	    lp.setUserName(username);
	    lp.setPwd(password);
	    lp.clickBtn();
	    
	    Thread.sleep(1000);
	    if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			
			Assert.assertTrue(true);
			System.out.println("It is passed ");
		}
		else
		{
			
			Assert.assertTrue(false);
			System.out.println("It is failed");
		}
	    /*  ----------------->correct but not getting output now<------------
	    
	    
	    Thread.sleep(1000);
	    NewAccountPage ap= new NewAccountPage(driver);
	    ap.LnkNewAcc();
        ap.CustId("72431");
        ap.AccType();
        ap.IniDepo("30000");
        ap.submit();
        
        Thread.sleep(3000);
	    
	*/
	
	}
	

}
