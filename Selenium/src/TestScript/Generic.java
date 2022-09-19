package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pom.Pom2;

public class Generic extends Pom2 {
	public Generic(WebDriver D) {
		super(D);
		// TODO Auto-generated constructor stub
	}
	public WebDriver D;
	@BeforeMethod
	public void openAppln()
	{System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("https://www.facebook.com/");
	Pom2 p=new Pom2(D);
	}
	@AfterMethod
	public void closeAppln()
	{D.close();
	}

}
