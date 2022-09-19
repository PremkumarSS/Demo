package Selenum;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("http://www.demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	D.findElement(By.name("cusid")).sendKeys("Selenium");
	Thread.sleep(2000);
	D.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	Alert a= D.switchTo().alert();
	String t = a.getText();
			System.out.println(t);
			a.accept();
			
	
	}

}
