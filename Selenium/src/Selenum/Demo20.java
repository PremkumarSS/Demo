package Selenum;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo20 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	D.get("https://www.amazon.in/");
	WebElement E = D.findElement(By.xpath("//a[.='Facebook']"));
	Point L = E.getLocation();
	int x = L.getX();
	int y = L.getY();
	JavascriptExecutor js=(JavascriptExecutor)D;	
	js.executeScript("window.scrollBy("+x+","+y+")");
	E.click();

	}

}
