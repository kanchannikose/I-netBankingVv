package genericUtilities;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class BaseClass {
	
	PropertyFileUtility putil=new PropertyFileUtility();
	
	public String baseurl =putil.getUrl();
	public String username =putil.getUsername();
	public String password =putil.getPassword();
	public static WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", putil.getFirefox());
			driver=new FirefoxDriver();
		}
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", putil.getEdge());
			driver=new EdgeDriver();
		}
		
		
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public static String captureSceenshot(String fileName) throws IOException
	  {
		  TakesScreenshot ts= (TakesScreenshot) driver;
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  File trg=new File("./screenshots/"+fileName+".png");
		  FileUtils.copyFile(src, trg);
		  
		  System.out.println("screenshot saved successfully");
		  return trg.getAbsolutePath();
		
		
	  }
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
