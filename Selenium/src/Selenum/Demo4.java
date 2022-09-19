package Selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
	WebElement ele = D.findElement(By.xpath("//span[.='right click me']"));
	Actions act=new Actions(D);
	act.contextClick(ele).perform();
	}

}
