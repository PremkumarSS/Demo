package Selenum;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo26 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	D.get("https://snowcityblr.com/");
	D.findElement(By.xpath("(//a[.='Contact Us'])[1]")).click();
	//WebElement f = D.findElement(By.xpath("//iframe[@loading='lazy']"));
	//D.switchTo().frame(f);
	WebElement f1 = D.findElement(By.xpath("//iframe[@aria-hidden='true']"));
	D.switchTo().frame(f1);
	D.findElement(By.className("navigate-link")).click();
	}

}
