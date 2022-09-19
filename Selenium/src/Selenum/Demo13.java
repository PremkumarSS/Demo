package Selenum;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo13 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	D.findElement(By.name("New Window")).click();
	Thread.sleep(3000);
	Set<String> allwh = D.getWindowHandles();
	int count = allwh.size();
	System.out.println(count);
	for(String wh:allwh)
	{
		System.out.println(wh);	
	}

}}
