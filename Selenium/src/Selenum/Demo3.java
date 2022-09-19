package Selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
	WebElement ele = D.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
	Actions act=new Actions(D);
	act.doubleClick(ele).perform();
	}

}
