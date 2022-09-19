package Selenum;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("https://www.facebook.com/");
	Thread.sleep(2000);
	D.findElement(By.name("email")).sendKeys("premkumar.mbl9@gmail.com");
	Thread.sleep(2000);
	D.findElement(By.name("pass")).sendKeys("Premkumar@123");
	Thread.sleep(2000);
	D.findElement(By.xpath("//button[.='Log In']")).click();
	Thread.sleep(2000);
	WebElement ele = D.findElement(By.xpath("//input[@type='search']"));
	ele.sendKeys("Puneeth Rajkumar");
	Thread.sleep(2000);
	ele.sendKeys(Keys.ENTER);
	D.findElement(By.xpath("//div[@aria-label='Follow']|//div[@role='button']|//div[@tabindex='0']")).click();
	
	}

}
