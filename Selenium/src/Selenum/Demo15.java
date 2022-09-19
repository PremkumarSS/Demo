package Selenum;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo15 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	D.findElement(By.name("NewWindow")).click();
	Thread.sleep(3000);
	String p_id = D.getWindowHandle();
	Set<String> allwh = D.getWindowHandles();
	int count = allwh.size();
	System.out.println(count);
	for(String wh:allwh)
	{
		D.switchTo().window(wh);
		String t = D.getTitle();
		System.out.println(t);
		Thread.sleep(2000);
		if(allwh.equals(p_id))
		{D.close();
	}
	

}}}