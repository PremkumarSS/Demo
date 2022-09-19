package Selenum;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo16 {

	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("https://www.google.com/");
	Thread.sleep(2000);
	WebElement ele = D.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	Actions act=new Actions(D);
	act.contextClick(ele).perform();
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Set<String> allwh = D.getWindowHandles();
	int c = allwh.size();
	System.out.println(c);
	ArrayList<String> l=new ArrayList<String>(allwh);
	int c1 = l.size();
	System.out.println(c1);
	String c3 = l.get(1);
	D.switchTo().window(c3);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_N);
	Thread.sleep(2000);
	D.manage().window().maximize();
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_C);
	
	
	}

}
