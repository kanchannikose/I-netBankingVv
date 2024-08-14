package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
	
	WebDriver driver;
	
	public NewAccountPage(WebDriver driver)
	{
		driver=this.driver;
		PageFactory.initElements(driver, this);
	}
	
	   @FindBy(xpath="//a[normalize-space()='New Account']")
	   WebElement lnkNewAcc;
	
	   @FindBy(name="cusid")
		WebElement addCustId;
	
	   @FindBy(name="selaccount")
	   WebElement selectAccType;
	   
	   @FindBy(name="inideposit")
	   WebElement addIniDepo;
	   
	   @FindBy(name="button2")
	   WebElement submitBtn;
	   
	   
	   public void LnkNewAcc()
	   {
		   lnkNewAcc.click(); 
	   }
	   
	   public void CustId(String snum)
	   {
		   addCustId.sendKeys(snum); 
	   }
	   
	   public void AccType()
	   {
		   Select sel=new Select(selectAccType);
		   sel.selectByVisibleText("Savings");
	   }
	   
	   public void IniDepo(String amt)
	   {
		   addIniDepo.sendKeys(amt);
	   }
	   
	   public void submit()
	   {
		   submitBtn.click();
		   
	   }
	   
	

}
