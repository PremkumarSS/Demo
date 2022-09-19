package Selenum;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo17 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("file:///C:/Users/HP/Desktop/Html/demo2.html");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)D;
	js.executeScript("document.getElementById('t1').value='SELENIUM'");
	
	}

}
