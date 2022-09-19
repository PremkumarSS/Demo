package Selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("file:///C:/Users/HP/Desktop/Html/Demo1.html");
	Thread.sleep(2000);
	WebElement E = D.findElement(By.name("upload file"));
	E.sendKeys("C:\\Users\\HP\\Desktop\\Chandan's Resume.pdf");
	}

}
