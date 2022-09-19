package Selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	D.findElement(By.xpath("//button[.='✕']")).click();
	Thread.sleep(2000);
	WebElement ele = D.findElement(By.xpath("(//div[.='Fashion'])[4]"));
	Actions act=new Actions(D);
	act.moveToElement(ele).perform();

	}

}
