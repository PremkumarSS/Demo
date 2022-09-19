package Selenum;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo19 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("https://www.amazon.in/");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)D;
	for(int i=0;i<3;i++)
	{
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	}
	for(int j=0;j<3;j++)
	{
	js.executeScript("window.scrollBy(0,-500)");
	Thread.sleep(2000);
	}
	}

}



