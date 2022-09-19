package Selenum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo24 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	D.get("https://demoqa.com/frames");
	D.switchTo().frame("frame1");
	WebElement frame1text = D.findElement(By.id("sampleHeading"));
	System.out.println(frame1text.getText());
	D.switchTo().defaultContent();
	D.switchTo().frame("frame2");
	WebElement frame2text = D.findElement(By.id("sampleHeading"));
	System.out.println(frame2text.getText());
	D.switchTo().defaultContent();
	D.close();
}}
