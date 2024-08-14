package genericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
	
	Properties pro; //create object of properties
    
	public PropertyFileUtility() //create constructor
	{
		File src = new File(".\\src\\test\\resources\\CommonData");
		
		try {
			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("exception is "+e.getMessage());
		}
	}
	
	public String getUrl()
	{
		String url = pro.getProperty("url");
		return url;
		
	}
	
	public String getUsername()
	{
		String username=pro.getProperty("username");
		return username;
		
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
		
	}
	
	public String getFirefox()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
		
	}
	
	public String getEdge()
	{
		String edgepath = pro.getProperty("edgepath");
		return edgepath;
	}
}
