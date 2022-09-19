package Selenum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Demo35 {
public WebDriver D;
@Parameters({"browser"})
@Test
public void excel(String browser)
{System.setProperty("webdriver,chrome.driver", "./software/chromedriver.exe");
System.setProperty("webdriver.gecko.driver", "./software/chromedriver.exe");
if(browser.equals("firefox"))
{D=new FirefoxDriver();
D.get("https://www.google.com");
}
else{D=new ChromeDriver();
D.get("https://www.facebook.com");
}
}}
