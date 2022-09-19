package Selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo23 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("https://www.yahoo.com");
	Thread.sleep(2000);
	WebDriverWait w=new WebDriverWait(D, 10);
	w.until(ExpectedConditions.titleContains("Search"));
	String t1 = D.getTitle();
	System.out.println(t1);
	D.findElement(By.xpath("//a[@id='ysignin']")).click();
	//Thread.sleep(2000);
	w.until(ExpectedConditions.titleContains("Yahoo"));
	String t2 = D.getTitle();
	System.out.println(t2);
	D.findElement(By.xpath("//input[@type='text']")).sendKeys("premkumars95@yahoo.com");
	//Thread.sleep(2000);
	D.findElement(By.xpath("//input[@id='login-signin']")).click();
	Thread.sleep(2000);
	D.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Bangalore@123");
	//Thread.sleep(2000);
	D.findElement(By.xpath("//button[@name='verifyPassword']")).click();
	//Thread.sleep(2000);
	w.until(ExpectedConditions.titleContains("Yahoo"));
	String t3 = D.getTitle();
	System.out.println(t3);
	D.findElement(By.xpath("//div[@title='Mail']")).click();
	//Thread.sleep(2000);
	w.until(ExpectedConditions.titleContains("unread"));
	String t4 = D.getTitle();
	System.out.println(t4);
	D.findElement(By.xpath("//a[@aria-disabled='false']")).click();
	//Thread.sleep(2000);
	w.until(ExpectedConditions.titleContains("unread"));
	String t5 = D.getTitle();
	System.out.println(t5);
	D.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("selenium@yahoo.com");
	Thread.sleep(2000);
	D.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Selenium Demo");
	Thread.sleep(2000);
	D.findElement(By.xpath("//div[@aria-multiline='true']")).sendKeys("Hi this is Premkumar");
	Thread.sleep(2000);
	D.findElement(By.xpath("//button[@title='Send this email']")).click();
	Thread.sleep(2000);
	
	
	
	}

}
