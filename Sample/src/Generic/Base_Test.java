package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_constants  {

	public WebDriver D;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(gecko_key, gecko_value);
		D=new FirefoxDriver();
		D.manage().window().maximize();
		D.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		D.get(baseUrl);
	}
	@AfterMethod
	public void closeAppln()
	{D.close();
		
		
	}
}
