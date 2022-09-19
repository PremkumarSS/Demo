package Selenum;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo22 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	D.get("http://localhost/login.do");
	D.findElement(By.id("username")).sendKeys("admin");
	D.findElement(By.name("pwd")).sendKeys("manager");
	D.findElement(By.xpath("//div[.='Login ']")).click();
	D.findElement(By.xpath("//div[.='Tasks']")).click();
	D.findElement(By.xpath("//div[.='Reports']")).click();
	D.findElement(By.xpath("//div[.='Users']")).click();
	D.findElement(By.xpath("//div[.='Work Schedule']")).click();

	}

}
