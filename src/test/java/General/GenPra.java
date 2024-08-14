package General;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenPra {
	
	@Test
	public void demoGen() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.close();
	}

}
