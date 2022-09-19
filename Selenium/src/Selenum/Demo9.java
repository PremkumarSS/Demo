package Selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("http://www.cleartrip.com/flights/");
	Thread.sleep(2000);
	D.findElement(By.xpath("(//div[.='Tue, Aug 16'])[6]")).click();
	Thread.sleep(2000);
	D.findElement(By.xpath("(//div[.='17'])[1]")).click();
	
	}

}
